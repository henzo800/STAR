package star.entitys;

import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class TestEntity extends ZombieEntity {
	public static final String REG = "test_entity";

	public TestEntity(World worldIn) {
		super(worldIn);
		this.addPotionEffect(new EffectInstance(Effects.SPEED));
		
	}

	public TestEntity(EntityType<? extends ZombieEntity> type, World worldIn) {
		super(type, worldIn);
		this.addPotionEffect(new EffectInstance(Effects.SPEED));
	}

	@Override
	public boolean isChild() {
		return true;
	}

	@Override
	public void tick() {
		super.tick();
		if(!(this.getEntityWorld().getBlockState(this.getPosition().add(0.0, -1.0, 0.0)).equals(Blocks.NETHERRACK.getDefaultState()))) {
			this.getEntityWorld().setBlockState(this.getPosition().add(0.0, -1.0, 0.0), Blocks.NETHERRACK.getDefaultState());
		}
	}
	
	

	
}
