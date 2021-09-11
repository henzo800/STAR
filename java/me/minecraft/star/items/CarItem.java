package me.minecraft.star.items;

import me.minecraft.star.setup.EntityRegister;
import net.minecraft.item.ItemGroup;

public class CarItem extends MySpawnEggItem {
	
	public static final String REG = "car_item";
	
	public CarItem() {
		super(() -> EntityRegister.CARENTITY.get(), 
				"ffffff", 
				"ff0000", 
				new Properties().fireResistant().tab(ItemGroup.TAB_TRANSPORTATION));
	}
}
