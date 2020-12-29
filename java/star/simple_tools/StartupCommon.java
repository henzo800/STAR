package star.simple_tools;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import star.Main;

public class StartupCommon {
	public static SimpleSword simpleSword;
	public static SimplePickaxe	simplePickaxe;

	  @SubscribeEvent
	  public static void onItemsRegistration(final RegistryEvent.Register<Item> itemRegisterEvent) {
	    simpleSword = (SimpleSword) new SimpleSword().setRegistryName(Main.MODID, "star_i01_simple_sword");
	    simplePickaxe = (SimplePickaxe) new SimplePickaxe().setRegistryName(Main.MODID, "star_i02_simple_pickaxe");
	    itemRegisterEvent.getRegistry().registerAll(simpleSword, simplePickaxe);
	  }

	  @SubscribeEvent
	  public static void onCommonSetupEvent(FMLCommonSetupEvent event) {
	    
	  }
}
