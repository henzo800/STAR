package star.simple_tools;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemTier;
import net.minecraft.item.PickaxeItem;

public class SimplePickaxe extends PickaxeItem {
	static private final ItemTier itemTier = ItemTier.DIAMOND;
	static private final int maxDamage = 1;
	static private final float attackDamage = 1.0f;
	static private final Properties properties = new Properties().maxStackSize(10).group(ItemGroup.TOOLS);
	public SimplePickaxe() {
		super(itemTier, maxDamage, attackDamage, properties);
	}
}
