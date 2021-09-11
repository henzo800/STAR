package me.minecraft.star;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import me.minecraft.star.gui.CarScreen;
import me.minecraft.star.gui.TrainScreen;
import me.minecraft.star.setup.AttributeRegister;
import me.minecraft.star.setup.BlockRegister;
import me.minecraft.star.setup.ContainerRegister;
import me.minecraft.star.setup.EntityRegister;
import me.minecraft.star.setup.ItemRegister;
import me.minecraft.star.setup.RenderRegister;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.entity.SpawnReason;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(STAR.MODID)
public class STAR {
	public static final String MODID= "star";
	
	public static final Logger LOGGER = LogManager.getLogger();
	
	public STAR() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		bus.register(this.getClass());
		
		EntityRegister.ENTITIES.register(bus);
		BlockRegister.BLOCKS.register(bus);
		ItemRegister.ITEMS.register(bus);
		ContainerRegister.CONTAINERS.register(bus);
		
		LOGGER.info("STAR has been initialised");
	}
    
    @SubscribeEvent
	public static void entityAttributeCreationEvent(EntityAttributeCreationEvent event) {
    	LOGGER.info("STAR - Entity Attribute Event");
		AttributeRegister.registerAttributes(event);
	}
    
    @SubscribeEvent
    public static void onCommonSetupEvent(FMLCommonSetupEvent event) {
    	LOGGER.info("STAR - Common Setup");
    	
    }
    
    //Begin Event for Client Setup
    @SubscribeEvent
    public static void onClientSetupEvent(FMLClientSetupEvent event) {
    	LOGGER.info("STAR - Client Setup");
    	//Register object renderers.
    	RenderRegister.registerRenderers(event);
    	//Register Screens for GUI
    	ScreenManager.register(ContainerRegister.TRAINCONTAINER.get(), 
    			TrainScreen::new);
    	ScreenManager.register(ContainerRegister.CARCONTAINER.get(), 
    			CarScreen::new);
    }
    
    @SubscribeEvent
    public static void modelRegistryEvent(ModelRegistryEvent event) {
    }
    
    @SubscribeEvent
    public void playerRightClick(RightClickBlock event) {
    	if(event.getItemStack() == ItemRegister.CAR_ITEM.get().getDefaultInstance()) {
    		EntityRegister.CARENTITY.get().spawn((ServerWorld) event.getWorld(), null, null, event.getHitVec().getBlockPos().above(), SpawnReason.SPAWN_EGG, true, true);
    		
    	}
    }
    
}
