package star.entitys;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import star.setup.BlockRegistry;

public class BlockSimple extends ItemEntity {

	public BlockSimple(EntityType<? extends ItemEntity> p_i50217_1_, World world) {
		super(p_i50217_1_, world);
		this.cannotPickup();
	}

	public BlockSimple(World worldIn, double x, double y, double z) {
		super(worldIn, x, y, z);
		this.cannotPickup();
	}

	public BlockSimple(World worldIn, double x, double y, double z, ItemStack stack) {
		super(worldIn, x, y, z, stack);
		this.cannotPickup();
	}

	@Override
	public void tick() {
		super.tick();
		if(this.isOnGround() == true && this.isAddedToWorld()) {
			if(!(this.world.getBlockState(this.getPosition().add(0.0, -1.0, 0.0)).equals(BlockRegistry.simpleBlock.get().getDefaultState()))) {
				this.world.setBlockState(this.getPosition().add(0.0, -1.0, 0.0), BlockRegistry.simpleBlock.get().getDefaultState());
			}
			
		}
		
	}

	
}
