package me.minecraft.star.entities;

import me.minecraft.star.gui.TrainContainer;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.item.minecart.AbstractMinecartEntity;
import net.minecraft.entity.item.minecart.FurnaceMinecartEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.IPacket;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public class TrainEntity extends FurnaceMinecartEntity {

	public TrainContainer inventory;
	public int fuel;

	public TrainEntity(EntityType<? extends FurnaceMinecartEntity> p_i50126_1_, World p_i50126_2_) {
		super(p_i50126_1_, p_i50126_2_);
	}

	public TrainEntity(World p_i1723_1_, double p_i1723_2_, double p_i1723_4_, double p_i1723_6_) {
		super(p_i1723_1_, p_i1723_2_, p_i1723_4_, p_i1723_6_);
	}


	public static final String REG = "train_entity";

	@Override
	public Type getMinecartType() {
		return AbstractMinecartEntity.Type.RIDEABLE;
	}

	public ActionResultType interact(PlayerEntity player, Hand hand) {
		if (!(player instanceof ServerPlayerEntity)) return ActionResultType.FAIL;  // should always be true, but just in case...
			ServerPlayerEntity serverPlayerEntity = (ServerPlayerEntity)player;
		if (player.isSecondaryUseActive()) {
			if(this.inventory == null) {
				this.inventory = new TrainContainer(player.getId(), player.inventory);
			}
			NetworkHooks.openGui(serverPlayerEntity, 
					inventory, 
					(packetBuffer)-> packetBuffer.writeInt(10));
			return ActionResultType.PASS;
		} 
		else if (this.isVehicle()) {
			return ActionResultType.PASS;
		} 
		else if (!this.level.isClientSide) {
			return player.startRiding(this) ? ActionResultType.CONSUME : ActionResultType.PASS;
		} 
		else {
			return ActionResultType.SUCCESS;
		}
	}

	@Override
	public ActionResultType interactAt(PlayerEntity p_184199_1_, Vector3d p_184199_2_, Hand p_184199_3_) {
		return super.interactAt(p_184199_1_, p_184199_2_, p_184199_3_);
	}

	@Override
	public float getCurrentCartSpeedCapOnRail() {
		return 100.0f;
	}

	@Override
	public double getMaxSpeedWithRail() {
		return 100.0f;
	}

	@Override
	public double getPassengersRidingOffset() {
		return 1.0D;
	}

	@Override
	public float getMaxCartSpeedOnRail() {
		return 100.0f;
	}

	@Override
	public IPacket<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	public void tick() {
		super.tick();
		if(inventory != null) {
			this.fuel = inventory.getBurnProgress();
		}
		//STAR.LOGGER.debug(this.fuel);
	}











}
