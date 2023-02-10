
package net.mcreator.kyomod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.kyomod.entity.PerorozillaEntity;
import net.mcreator.kyomod.client.model.ModelPerorozilla;

public class PerorozillaRenderer extends MobRenderer<PerorozillaEntity, ModelPerorozilla<PerorozillaEntity>> {
	public PerorozillaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelPerorozilla(context.bakeLayer(ModelPerorozilla.LAYER_LOCATION)), 5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PerorozillaEntity entity) {
		return new ResourceLocation("kyomod:textures/entities/perorozilla.png");
	}
}
