
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kyomod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.kyomod.KyomodMod;

public class KyomodModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, KyomodMod.MODID);
	public static final RegistryObject<Potion> UNLIMITED_NIGHT_VISION = REGISTRY.register("unlimited_night_vision",
			() -> new Potion(new MobEffectInstance(KyomodModMobEffects.UNLIMITED_NIGHT_VISION_EFFECT.get(), 1, 0, false, true)));
	public static final RegistryObject<Potion> HERO_OF_THE_VILLAGE_POTION = REGISTRY.register("hero_of_the_village_potion",
			() -> new Potion(new MobEffectInstance(KyomodModMobEffects.HERO_OF_THE_VILLAGE.get(), 1, 0, false, true)));
	public static final RegistryObject<Potion> KEEP_INVENTORY_POTION = REGISTRY.register("keep_inventory_potion",
			() -> new Potion(new MobEffectInstance(KyomodModMobEffects.KEEP_INVENTORY.get(), 1, 0, false, true)));
	public static final RegistryObject<Potion> XP_POTION = REGISTRY.register("xp_potion",
			() -> new Potion(new MobEffectInstance(KyomodModMobEffects.XP.get(), 1, 0, false, true)));
}
