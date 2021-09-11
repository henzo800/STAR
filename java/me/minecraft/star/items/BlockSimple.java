package me.minecraft.star.items;

import me.minecraft.star.setup.BlockRegister;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class BlockSimple extends BlockItem {
	
	public static final String REG = me.minecraft.star.blocks.BlockSimple.REG;

	public BlockSimple() {
		super(BlockRegister.BLOCKSIMPLE.get(), new Item.Properties().stacksTo(10).tab(ItemGroup.TAB_MISC));
	}

}
