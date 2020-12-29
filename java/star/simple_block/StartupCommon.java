package star.simple_block;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import star.Main;

/**
 * User: The Grey Ghost
 * Date: 24/12/2014
 *
 * The Startup classes for this example are called during startup, in the following order:
 * onBlocksRegistration then onItemsRegistration
 *  See MinecraftByExample class for more information
 */
public class StartupCommon
{
  public static BlockSimple blockSimple;  // this holds the unique instance of your block
  public static BlockItem itemBlockSimple;  // this holds the unique instance of the ItemBlock corresponding to your block

  @SubscribeEvent
  public static void onBlocksRegistration(final RegistryEvent.Register<Block> blockRegisterEvent) {
    blockSimple = (BlockSimple)(new BlockSimple().setRegistryName(Main.MODID, "star_b01_simple_block"));
    blockRegisterEvent.getRegistry().register(blockSimple);
  }

  @SubscribeEvent
  public static void onItemsRegistration(final RegistryEvent.Register<Item> itemRegisterEvent) {
    // We need to create a BlockItem so the player can carry this block in their hand and it can appear in the inventory
    final int MAXIMUM_STACK_SIZE = 20;  // player can only hold 20 of this block in their hand at once

    Item.Properties itemSimpleProperties = new Item.Properties()
                                                   .maxStackSize(MAXIMUM_STACK_SIZE)
                                                   .group(ItemGroup.MISC);  // which inventory tab?
    itemBlockSimple = new BlockItem(blockSimple, itemSimpleProperties);
    itemBlockSimple.setRegistryName(blockSimple.getRegistryName());
    itemRegisterEvent.getRegistry().register(itemBlockSimple);
  }

  @SubscribeEvent
  public static void onCommonSetupEvent(FMLCommonSetupEvent event) {
    // not actually required for this example....
  }
  
}
