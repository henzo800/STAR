package me.minecraft.star.renders;

import me.minecraft.star.STAR;
import me.minecraft.star.entities.CarEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.CreeperModel;
import net.minecraft.util.ResourceLocation;

public class CarEntityRender extends MobRenderer<CarEntity, CreeperModel<CarEntity>> {


	public CarEntityRender(EntityRendererManager renderManagerIn) {
		super(renderManagerIn, new CreeperModel<CarEntity>(0.0f), 1.0f);
	}

	@Override
	public ResourceLocation getTextureLocation(CarEntity p_110775_1_) {
		return new ResourceLocation(STAR.MODID, "textures/entity/red_rack.png");
	}
	

}
