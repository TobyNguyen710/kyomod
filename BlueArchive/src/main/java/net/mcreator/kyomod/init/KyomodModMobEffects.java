
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kyomod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.kyomod.potion.XPMobEffect;
import net.mcreator.kyomod.potion.UnlimitedNightVisionEffectMobEffect;
import net.mcreator.kyomod.potion.KeepInventoryMobEffect;
import net.mcreator.kyomod.potion.HeroOfTheVillageMobEffect;
import net.mcreator.kyomod.KyomodMod;

public class KyomodModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, KyomodMod.MODID);
	public static final RegistryObject<MobEffect> UNLIMITED_NIGHT_VISION_EFFECT = REGISTRY.register("unlimited_night_vision_effect",
			() -> new UnlimitedNightVisionEffectMobEffect());
	public static final RegistryObject<MobEffect> HERO_OF_THE_VILLAGE = REGISTRY.register("hero_of_the_village",
			() -> new HeroOfTheVillageMobEffect());
	public static final RegistryObject<MobEffect> KEEP_INVENTORY = REGISTRY.register("keep_inventory", () -> new KeepInventoryMobEffect());
	public static final RegistryObject<MobEffect> XP = REGISTRY.register("xp", () -> new XPMobEffect());
}
