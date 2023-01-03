
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kyomod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.kyomod.KyomodMod;

public class KyomodModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, KyomodMod.MODID);
	public static final RegistryObject<SoundEvent> THEME140 = REGISTRY.register("theme140",
			() -> new SoundEvent(new ResourceLocation("kyomod", "theme140")));
	public static final RegistryObject<SoundEvent> GUNSHOT = REGISTRY.register("gunshot",
			() -> new SoundEvent(new ResourceLocation("kyomod", "gunshot")));
	public static final RegistryObject<SoundEvent> MIDORI_SHOOT = REGISTRY.register("midori_shoot",
			() -> new SoundEvent(new ResourceLocation("kyomod", "midori_shoot")));
	public static final RegistryObject<SoundEvent> MODORI_SKILL_2 = REGISTRY.register("modori_skill_2",
			() -> new SoundEvent(new ResourceLocation("kyomod", "modori_skill_2")));
	public static final RegistryObject<SoundEvent> MODORI_SKILL_1 = REGISTRY.register("modori_skill_1",
			() -> new SoundEvent(new ResourceLocation("kyomod", "modori_skill_1")));
	public static final RegistryObject<SoundEvent> AZUSA_SHOOT = REGISTRY.register("azusa_shoot",
			() -> new SoundEvent(new ResourceLocation("kyomod", "azusa_shoot")));
	public static final RegistryObject<SoundEvent> AZUSA_SKILL = REGISTRY.register("azusa_skill",
			() -> new SoundEvent(new ResourceLocation("kyomod", "azusa_skill")));
	public static final RegistryObject<SoundEvent> THEME139 = REGISTRY.register("theme139",
			() -> new SoundEvent(new ResourceLocation("kyomod", "theme139")));
	public static final RegistryObject<SoundEvent> REANIMATE = REGISTRY.register("reanimate",
			() -> new SoundEvent(new ResourceLocation("kyomod", "reanimate")));
	public static final RegistryObject<SoundEvent> BULBEL = REGISTRY.register("bulbel",
			() -> new SoundEvent(new ResourceLocation("kyomod", "bulbel")));
	public static final RegistryObject<SoundEvent> ENDER_LILIES = REGISTRY.register("ender_lilies",
			() -> new SoundEvent(new ResourceLocation("kyomod", "ender_lilies")));
	public static final RegistryObject<SoundEvent> HARMONIOUS = REGISTRY.register("harmonious",
			() -> new SoundEvent(new ResourceLocation("kyomod", "harmonious")));
	public static final RegistryObject<SoundEvent> HIFUMI_GREETINGS_FULL = REGISTRY.register("hifumi_greetings_full",
			() -> new SoundEvent(new ResourceLocation("kyomod", "hifumi_greetings_full")));
	public static final RegistryObject<SoundEvent> HIFUMI_SENSEI = REGISTRY.register("hifumi_sensei",
			() -> new SoundEvent(new ResourceLocation("kyomod", "hifumi_sensei")));
	public static final RegistryObject<SoundEvent> THIS_GAME = REGISTRY.register("this_game",
			() -> new SoundEvent(new ResourceLocation("kyomod", "this_game")));
}
