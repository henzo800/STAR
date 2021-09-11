package me.minecraft.star.items;

import me.minecraft.star.setup.EntityRegister;
import net.minecraft.item.ItemGroup;

public class TrainItem extends MySpawnEggItem {
	//Initilize Variables
	public static String REG = "train_item";
	private static String colour1 = "ffffff";
	private static String colour2 = "0000ff";
	
	public TrainItem() {
		//Pass variables to parent class
		//Use the supplier to get the type of train entity
		super(() -> EntityRegister.TRAINENTITY.get(),
				//pass colours to parent
				colour1, colour2, 
				//Initilize item properties
				new Properties()
					.fireResistant()
					.tab(ItemGroup.TAB_TRANSPORTATION));
	}
}
