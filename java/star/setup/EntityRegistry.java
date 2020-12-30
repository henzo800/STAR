package star.setup;

import net.minecraft.entity.EntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.entity.EntityClassification;
import net.minecraft.util.ResourceLocation;
import star.Main;
import star.entitys.TestEntity;

public final class EntityRegistry {
	public EntityRegistry() {
		public static final DeferredRegister<EntityType<?>> ENTITIES = new DeferredRegister<>(ForgeRegistries.ENTITIES, Main.MODID);
		
		public static final RegistryObject<EntityType<TestEntity>> TEST_ENTITY = ENTITIES.register(TestEntity.REG, TestEntity::new);
	}

}
