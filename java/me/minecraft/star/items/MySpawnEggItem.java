package me.minecraft.star.items;

import java.util.function.Supplier;

import net.minecraft.entity.EntityType;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.nbt.CompoundNBT;

//Class for custom item to spawn entity of correct type
public class MySpawnEggItem extends SpawnEggItem {
	//Initialize supplier of EntityType
	private Supplier<EntityType<?>> entityType;
	
	//Constructor inherited from parent class
	public MySpawnEggItem(Supplier<EntityType<?>> entityTypeSupplier, 
			String colour1, 
			String colour2, 
			Properties properties) {
		//Pass modified variables to parent class
		super(null, 
				Integer.parseInt(colour1, 16), 
				Integer.parseInt(colour2, 16), 
				properties);
		//Assign the entity type to a supplier
		this.entityType = entityTypeSupplier;
	}
	
	//Override for the default entity type retrieval
	@Override
	public EntityType<?> getType(CompoundNBT entityNBT) {
		//return the assigned entity type
		return entityType.get();
	}
}
