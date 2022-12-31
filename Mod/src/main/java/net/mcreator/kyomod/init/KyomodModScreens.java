
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kyomod.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.kyomod.client.gui.SupremeGeneratorGUIScreen;
import net.mcreator.kyomod.client.gui.GeneratorGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class KyomodModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(KyomodModMenus.GENERATOR_GUI.get(), GeneratorGUIScreen::new);
			MenuScreens.register(KyomodModMenus.SUPREME_GENERATOR_GUI.get(), SupremeGeneratorGUIScreen::new);
		});
	}
}
