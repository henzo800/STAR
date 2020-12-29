package star.simple_item;

import net.minecraft.block.Blocks;
import net.minecraft.entity.monster.CreeperEntity;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import star.Main;

@EventBusSubscriber
public class StartupCommon {
	public static SimpleItem simpleItem;
	
	  @SubscribeEvent
	  public static void onItemsRegistration(final RegistryEvent.Register<Item> itemRegisterEvent) {
	    simpleItem = (SimpleItem) new SimpleItem().setRegistryName(Main.MODID, "star_i03_simple_item");
	    itemRegisterEvent.getRegistry().register(simpleItem);
	  }

	  @SubscribeEvent
	  public static void onCommonSetupEvent(FMLCommonSetupEvent event) {
	    
	  }
	  
	  @SubscribeEvent
	  public void onInteract(PlayerInteractEvent event) {
		  final int fireTime = 5;
		  if(event.getEntity() instanceof CreeperEntity) {
			  event.getEntity().setFire(fireTime);
			  
		  }
	  	  event.getWorld().setBlockState(event.getPlayer().getPosition(), Blocks.DIAMOND_BLOCK.getDefaultState());
	    
	  }
	  
	  
}
