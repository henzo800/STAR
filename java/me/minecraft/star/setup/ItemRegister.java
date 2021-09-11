package me.minecraft.star.setup;

import me.minecraft.star.STAR;
import me.minecraft.star.items.BlockSimple;
import me.minecraft.star.items.CarItem;
import me.minecraft.star.items.TrainItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegister {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, STAR.MODID);
	public static final RegistryObject<Item> BLOCKSIMPLE_ITEM = ITEMS.register(BlockSimple.REG , BlockSimple::new);
	public static final RegistryObject<Item> CAR_ITEM = ITEMS.register(CarItem.REG, CarItem::new);
	public static final RegistryObject<Item> TRAIN_ITEM = ITEMS.register(TrainItem.REG, TrainItem::new);
			
}
