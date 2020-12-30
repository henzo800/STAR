package star.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class SimpleItem extends Item {
	static private final int stackSize = 20;
	public static final String REG = "star_i03_simple_item";
	static private final Properties properties = new Properties().isImmuneToFire().maxStackSize(stackSize).group(ItemGroup.MISC);
	public SimpleItem() {
		super(properties);
	}

}
