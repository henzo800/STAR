package star.items;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import star.setup.BlockRegistry;

public class BlockSimple extends BlockItem {

	public static final String REG = star.blocks.BlockSimple.REG;

	public BlockSimple() {
		super(BlockRegistry.simpleBlock.get(), new Item.Properties().group(ItemGroup.MISC));
	}
	
	

}
