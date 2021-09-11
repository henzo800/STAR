package me.minecraft.star.entities;

import me.minecraft.star.STAR;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.RestrictSunGoal;
import net.minecraft.entity.ai.goal.TemptGoal;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.world.World;

public class TestEntity extends CowEntity {

	public static final String REG = "simple_entity";

	public TestEntity(EntityType<? extends CowEntity> p_i48567_1_, World p_i48567_2_) {
		super(p_i48567_1_, p_i48567_2_);
		STAR.LOGGER.debug("STAR - Entity Constructed");
	}
	
	public static AttributeModifierMap.MutableAttribute createAttributes() {
	      return MobEntity.createMobAttributes().add(Attributes.MAX_HEALTH, 0.5D)
	    		  .add(Attributes.MOVEMENT_SPEED, (double)0.2F)
	    		  .add(Attributes.FOLLOW_RANGE, 20.0)
	    		  .add(Attributes.ATTACK_DAMAGE, 20.0);
	}
	
	@Override
	protected void registerGoals() {
		STAR.LOGGER.debug("STAR - Entity Goals");
		this.goalSelector.addGoal(0, new TemptGoal(this, 1.25D, Ingredient.of(Items.WHEAT), false));
		this.goalSelector.addGoal(1, new RestrictSunGoal(this));
		this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 20.0, false));
	}
	
}	
