package me.minecraft.star.setup;

import me.minecraft.star.STAR;
import me.minecraft.star.gui.CarContainer;
import me.minecraft.star.gui.TrainContainer;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ContainerRegister {
	public static final DeferredRegister<ContainerType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS, STAR.MODID);
	
	public static final RegistryObject<ContainerType<TrainContainer>> TRAINCONTAINER = CONTAINERS.register(TrainContainer.REG, () -> new ContainerType<>(TrainContainer::new));
	
	public static final RegistryObject<ContainerType<CarContainer>> CARCONTAINER = CONTAINERS.register(CarContainer.REG, () -> new ContainerType<>(CarContainer::new));
	
	
}
