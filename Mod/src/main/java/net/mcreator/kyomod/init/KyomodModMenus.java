
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kyomod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.kyomod.world.inventory.SupremeGeneratorGUIMenu;
import net.mcreator.kyomod.world.inventory.HifumiBagGUIMenu;
import net.mcreator.kyomod.world.inventory.GeneratorGUIMenu;
import net.mcreator.kyomod.KyomodMod;

public class KyomodModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, KyomodMod.MODID);
	public static final RegistryObject<MenuType<GeneratorGUIMenu>> GENERATOR_GUI = REGISTRY.register("generator_gui",
			() -> IForgeMenuType.create(GeneratorGUIMenu::new));
	public static final RegistryObject<MenuType<SupremeGeneratorGUIMenu>> SUPREME_GENERATOR_GUI = REGISTRY.register("supreme_generator_gui",
			() -> IForgeMenuType.create(SupremeGeneratorGUIMenu::new));
	public static final RegistryObject<MenuType<HifumiBagGUIMenu>> HIFUMI_BAG_GUI = REGISTRY.register("hifumi_bag_gui",
			() -> IForgeMenuType.create(HifumiBagGUIMenu::new));
}
