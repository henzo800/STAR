package star;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import star.setup.BlockRegistry;
import star.setup.EntityRegistry;
import star.setup.ItemRegistry;

@Mod(Main.MODID)
public class Main {
	public static final String MODID = "star";
	
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	
	public Main() {
		BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
		ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		EntityRegistry.ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
		LOGGER.info("STAR Registry Built");
		
		
	}
}
