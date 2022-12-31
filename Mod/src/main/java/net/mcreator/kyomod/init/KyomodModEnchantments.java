
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kyomod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.kyomod.enchantment.TestEnchantment;
import net.mcreator.kyomod.KyomodMod;

public class KyomodModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, KyomodMod.MODID);
	public static final RegistryObject<Enchantment> TEST = REGISTRY.register("test", () -> new TestEnchantment());
}
