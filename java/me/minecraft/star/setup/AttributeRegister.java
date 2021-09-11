package me.minecraft.star.setup;

import me.minecraft.star.entities.CarEntity;
import me.minecraft.star.entities.TestEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

public class AttributeRegister {
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(EntityRegister.TESTENTITY.get(), TestEntity.createAttributes().build());
		event.put(EntityRegister.CARENTITY.get(), CarEntity.createAttributes().build());
	}
}
