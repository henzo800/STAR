package me.minecraft.star.setup;

import me.minecraft.star.STAR;
import me.minecraft.star.entities.CarEntity;
import me.minecraft.star.entities.TestEntity;
import me.minecraft.star.entities.TrainEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityRegister {
	public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, STAR.MODID);

	public static final RegistryObject<EntityType<TestEntity>> TESTENTITY = ENTITIES.register(TestEntity.REG, () -> EntityType.Builder.<TestEntity>of(TestEntity::new, EntityClassification.MISC)
			.sized(0.98F, 0.7F)
			.clientTrackingRange(8)
			.build(TestEntity.REG));
	
	public static final RegistryObject<EntityType<CarEntity>> CARENTITY = ENTITIES.register(CarEntity.REG, () -> EntityType.Builder.<CarEntity>of(CarEntity::new, EntityClassification.MISC)
			.sized(2.0F, 2.0F)
			.clientTrackingRange(5)
			.build(CarEntity.REG));
	
	public static final RegistryObject<EntityType<TrainEntity>> TRAINENTITY = ENTITIES.register(TrainEntity.REG, () -> EntityType.Builder.<TrainEntity>of(TrainEntity::new, EntityClassification.MISC)
			.sized(0.98F, 0.7F)
			.clientTrackingRange(8)
			.build(TrainEntity.REG));
	
}



