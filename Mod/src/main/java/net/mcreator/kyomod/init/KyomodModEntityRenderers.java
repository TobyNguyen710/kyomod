
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kyomod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.kyomod.client.renderer.PerorozillaRenderer;
import net.mcreator.kyomod.client.renderer.HifumiRenderer;
import net.mcreator.kyomod.client.renderer.BlightedGolemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class KyomodModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(KyomodModEntities.BLIGHTED_GOLEM.get(), BlightedGolemRenderer::new);
		event.registerEntityRenderer(KyomodModEntities.BULLET_1.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(KyomodModEntities.HIFUMI.get(), HifumiRenderer::new);
		event.registerEntityRenderer(KyomodModEntities.HIFUMI_BULLET.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(KyomodModEntities.PEROROZILLA.get(), PerorozillaRenderer::new);
	}
}
