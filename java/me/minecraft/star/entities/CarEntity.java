package me.minecraft.star.entities;

import me.minecraft.star.STAR;
import me.minecraft.star.gui.CarContainer;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.passive.horse.HorseEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public class CarEntity extends HorseEntity {

	public static final String REG = "car_entity";
	
	public double speed_modifier = 0;
	
	public CarContainer inventory;
	
	public CarEntity(EntityType<? extends HorseEntity> p_i50238_1_, World p_i50238_2_) {
		super(p_i50238_1_, p_i50238_2_);
	}

	public static AttributeModifierMap.MutableAttribute createAttributes() {
	      return MobEntity.createMobAttributes().add(Attributes.MAX_HEALTH, 5.0D)
	    		  .add(Attributes.MOVEMENT_SPEED, 1.0D)
	    		  .add(Attributes.ARMOR, 10.0D)
	    		  .add(Attributes.KNOCKBACK_RESISTANCE, 0.9D);
	}

	@Override
	public ActionResultType mobInteract(PlayerEntity player, Hand hand) {
		if (!(player instanceof ServerPlayerEntity)) {
			return ActionResultType.sidedSuccess(this.level.isClientSide);
		}
		
		ServerPlayerEntity serverPlayerEntity = (ServerPlayerEntity)player;

	    if (player.isSecondaryUseActive()) {
	    	if(this.inventory == null) {
				this.inventory = new CarContainer(player.getId(), player.inventory);
			}
			NetworkHooks.openGui(serverPlayerEntity, 
					inventory, 
					(packetBuffer)-> packetBuffer.writeInt(10));
	    	
	        return ActionResultType.sidedSuccess(this.level.isClientSide);
	    }
	    else if (!this.isVehicle()) {
	   	   this.doPlayerRide(player);
		   return ActionResultType.sidedSuccess(this.level.isClientSide);
	    }
	    else {
	       return ActionResultType.sidedSuccess(this.level.isClientSide);
	    }
	}
	
	@Override
	public void openInventory(PlayerEntity p_110199_1_) {
	}

	@Override
	protected void registerGoals() {
		STAR.LOGGER.debug("STAR - Entity Goals");
	}
	
	@Override
	public boolean isSaddled() {
		return true;
	}

	@Override
	public boolean isTamed() {
		return true;
	}

	@Override
	protected void randomizeAttributes() {
	}
	//Prevent CarEntity from "jumping"
	@Override
	public boolean canJump() {
		//will always return false
		return false;
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	public void aiStep() {
		super.aiStep();
	}

	@Override
	public void travel(Vector3d travelVector) {
		super.travel(travelVector);
	}
	
	
	
	
	
	
	
	

}
