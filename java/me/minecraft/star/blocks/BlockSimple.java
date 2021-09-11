package me.minecraft.star.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockSimple extends Block
{
	  public static final String REG = "block_simple";
	  public static final int STACK = 10;
	  public static final Item.Properties ItemProperties = new Item.Properties().stacksTo(STACK);
	  
	  public BlockSimple()
	  {
	    super(Block.Properties.of(Material.STONE)
	    		// look at Block.Properties for further options
	            // typically useful: hardnessAndResistance(), harvestLevel(), harvestTool()
	         );
	    
	  }
	  
	  
	  
	  
}