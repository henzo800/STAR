package star;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Main.MODID)
public class Main {
	public static final String MODID = "star";
	
	public static IEventBus MOD_EVENT_BUS;
	public Main() {
		MOD_EVENT_BUS = FMLJavaModLoadingContext.get().getModEventBus();
		
		commonStartUp();
		DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> Main::clientStartUp);
	}
	public static void commonStartUp() {
		MOD_EVENT_BUS.register(star.simple_block.StartupCommon.class);
		MOD_EVENT_BUS.register(star.simple_tools.StartupCommon.class);
		MOD_EVENT_BUS.register(star.simple_item.StartupCommon.class);
	}
	
	public static void clientStartUp() {
		MOD_EVENT_BUS.register(star.simple_block.StartupClient.class);
		MOD_EVENT_BUS.register(star.simple_tools.StartupClient.class);
		MOD_EVENT_BUS.register(star.simple_item.StartupCommon.class);
	}
}
