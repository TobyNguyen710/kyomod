
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kyomod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.kyomod.world.features.plants.LilyFeature;
import net.mcreator.kyomod.world.features.ores.HaloOreFeature;
import net.mcreator.kyomod.KyomodMod;

@Mod.EventBusSubscriber
public class KyomodModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, KyomodMod.MODID);
	public static final RegistryObject<Feature<?>> HALO_ORE = REGISTRY.register("halo_ore", HaloOreFeature::feature);
	public static final RegistryObject<Feature<?>> LILY = REGISTRY.register("lily", LilyFeature::feature);
}
