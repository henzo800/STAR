package star.simple_tools;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;

public class SimpleSword extends SwordItem {
	static private final ItemTier itemTier = ItemTier.DIAMOND;
	static private final int maxDamage = 20;
	static private final float attackDamage = 10.0f;
	static private final Properties properties = new Properties().maxStackSize(10).group(ItemGroup.COMBAT);
	public SimpleSword() {
		super(itemTier, maxDamage, attackDamage, properties);
	}
}
