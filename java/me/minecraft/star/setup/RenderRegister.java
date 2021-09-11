package me.minecraft.star.setup;

import me.minecraft.star.renders.CarEntityRender;
import me.minecraft.star.renders.TestEntityRender;
import me.minecraft.star.renders.TrainEntityRender;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class RenderRegister {
	public static void registerRenderers(FMLClientSetupEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(EntityRegister.TESTENTITY.get(), TestEntityRender::new);
    	RenderingRegistry.registerEntityRenderingHandler(EntityRegister.CARENTITY.get(), CarEntityRender::new);  
    	RenderingRegistry.registerEntityRenderingHandler(EntityRegister.TRAINENTITY.get(), TrainEntityRender::new);  
	}
}
