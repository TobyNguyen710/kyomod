
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kyomod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.kyomod.world.biome.TheAbyssBiomeBiome;
import net.mcreator.kyomod.world.biome.TestBiomeBiome;
import net.mcreator.kyomod.world.biome.LandsEndBiomeBiome;
import net.mcreator.kyomod.KyomodMod;

public class KyomodModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, KyomodMod.MODID);
	public static final RegistryObject<Biome> LANDS_END_BIOME = REGISTRY.register("lands_end_biome", LandsEndBiomeBiome::createBiome);
	public static final RegistryObject<Biome> TEST_BIOME = REGISTRY.register("test_biome", TestBiomeBiome::createBiome);
	public static final RegistryObject<Biome> THE_ABYSS_BIOME = REGISTRY.register("the_abyss_biome", TheAbyssBiomeBiome::createBiome);
}
