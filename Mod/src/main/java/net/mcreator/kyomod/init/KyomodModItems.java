
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kyomod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.kyomod.item.Theme140Item;
import net.mcreator.kyomod.item.Theme139Item;
import net.mcreator.kyomod.item.ReanimateItem;
import net.mcreator.kyomod.item.LandsEndDimensionItem;
import net.mcreator.kyomod.item.HifumiBulletItem;
import net.mcreator.kyomod.item.HarmoniousItem;
import net.mcreator.kyomod.item.HaloNuggetItem;
import net.mcreator.kyomod.item.HaloItem;
import net.mcreator.kyomod.item.HaloCoreItem;
import net.mcreator.kyomod.item.HallowSwordItem;
import net.mcreator.kyomod.item.HallowShovelItem;
import net.mcreator.kyomod.item.HallowPickaxeItem;
import net.mcreator.kyomod.item.HallowHoeItem;
import net.mcreator.kyomod.item.HallowAxeItem;
import net.mcreator.kyomod.item.HallowArmorItem;
import net.mcreator.kyomod.item.FreshInpirationItem;
import net.mcreator.kyomod.item.FreshInpiration2Item;
import net.mcreator.kyomod.item.EtOmniaVanitasItem;
import net.mcreator.kyomod.item.EnderLiliesMusicItem;
import net.mcreator.kyomod.item.BulletItem;
import net.mcreator.kyomod.item.Bullet1Item;
import net.mcreator.kyomod.item.BulbelItem;
import net.mcreator.kyomod.KyomodMod;

public class KyomodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, KyomodMod.MODID);
	public static final RegistryObject<Item> HALO = REGISTRY.register("halo", () -> new HaloItem());
	public static final RegistryObject<Item> HALO_ORE = block(KyomodModBlocks.HALO_ORE, KyomodModTabs.TAB_BLUE_ARCHIVE);
	public static final RegistryObject<Item> HALO_BLOCK = block(KyomodModBlocks.HALO_BLOCK, KyomodModTabs.TAB_BLUE_ARCHIVE);
	public static final RegistryObject<Item> HALO_CORE = REGISTRY.register("halo_core", () -> new HaloCoreItem());
	public static final RegistryObject<Item> HALO_NUGGET = REGISTRY.register("halo_nugget", () -> new HaloNuggetItem());
	public static final RegistryObject<Item> HALLOW_PICKAXE = REGISTRY.register("hallow_pickaxe", () -> new HallowPickaxeItem());
	public static final RegistryObject<Item> HALLOW_AXE = REGISTRY.register("hallow_axe", () -> new HallowAxeItem());
	public static final RegistryObject<Item> HALLOW_SWORD = REGISTRY.register("hallow_sword", () -> new HallowSwordItem());
	public static final RegistryObject<Item> HALLOW_SHOVEL = REGISTRY.register("hallow_shovel", () -> new HallowShovelItem());
	public static final RegistryObject<Item> HALLOW_HOE = REGISTRY.register("hallow_hoe", () -> new HallowHoeItem());
	public static final RegistryObject<Item> HALLOW_ARMOR_HELMET = REGISTRY.register("hallow_armor_helmet", () -> new HallowArmorItem.Helmet());
	public static final RegistryObject<Item> HALLOW_ARMOR_CHESTPLATE = REGISTRY.register("hallow_armor_chestplate",
			() -> new HallowArmorItem.Chestplate());
	public static final RegistryObject<Item> HALLOW_ARMOR_LEGGINGS = REGISTRY.register("hallow_armor_leggings", () -> new HallowArmorItem.Leggings());
	public static final RegistryObject<Item> HALLOW_ARMOR_BOOTS = REGISTRY.register("hallow_armor_boots", () -> new HallowArmorItem.Boots());
	public static final RegistryObject<Item> BULLET = REGISTRY.register("bullet", () -> new BulletItem());
	public static final RegistryObject<Item> FRESH_INPIRATION_2 = REGISTRY.register("fresh_inpiration_2", () -> new FreshInpiration2Item());
	public static final RegistryObject<Item> FRESH_INPIRATION = REGISTRY.register("fresh_inpiration", () -> new FreshInpirationItem());
	public static final RegistryObject<Item> ET_OMNIA_VANITAS = REGISTRY.register("et_omnia_vanitas", () -> new EtOmniaVanitasItem());
	public static final RegistryObject<Item> THEME_140 = REGISTRY.register("theme_140", () -> new Theme140Item());
	public static final RegistryObject<Item> THEME_139 = REGISTRY.register("theme_139", () -> new Theme139Item());
	public static final RegistryObject<Item> REANIMATE = REGISTRY.register("reanimate", () -> new ReanimateItem());
	public static final RegistryObject<Item> GENERATOR = block(KyomodModBlocks.GENERATOR, KyomodModTabs.TAB_BLUE_ARCHIVE);
	public static final RegistryObject<Item> SUPREME_GENERATOR = block(KyomodModBlocks.SUPREME_GENERATOR, KyomodModTabs.TAB_BLUE_ARCHIVE);
	public static final RegistryObject<Item> ENDER_LILIES_MUSIC = REGISTRY.register("ender_lilies_music", () -> new EnderLiliesMusicItem());
	public static final RegistryObject<Item> HARMONIOUS = REGISTRY.register("harmonious", () -> new HarmoniousItem());
	public static final RegistryObject<Item> BULBEL = REGISTRY.register("bulbel", () -> new BulbelItem());
	public static final RegistryObject<Item> BLIGHTED_GOLEM = REGISTRY.register("blighted_golem_spawn_egg",
			() -> new ForgeSpawnEggItem(KyomodModEntities.BLIGHTED_GOLEM, -10747892, -15728640,
					new Item.Properties().tab(KyomodModTabs.TAB_ENDER_LILIES)));
	public static final RegistryObject<Item> LANDS_END_DIMENSION = REGISTRY.register("lands_end_dimension", () -> new LandsEndDimensionItem());
	public static final RegistryObject<Item> BLIGHTED_GRASS = block(KyomodModBlocks.BLIGHTED_GRASS, KyomodModTabs.TAB_ENDER_LILIES);
	public static final RegistryObject<Item> BLIGHTED_DIRT = block(KyomodModBlocks.BLIGHTED_DIRT, KyomodModTabs.TAB_ENDER_LILIES);
	public static final RegistryObject<Item> BLIGHTED_STONE = block(KyomodModBlocks.BLIGHTED_STONE, KyomodModTabs.TAB_ENDER_LILIES);
	public static final RegistryObject<Item> LILY = block(KyomodModBlocks.LILY, KyomodModTabs.TAB_ENDER_LILIES);
	public static final RegistryObject<Item> BLIGHTED_WOOD_WOOD = block(KyomodModBlocks.BLIGHTED_WOOD_WOOD, KyomodModTabs.TAB_ENDER_LILIES);
	public static final RegistryObject<Item> BLIGHTED_WOOD_LOG = block(KyomodModBlocks.BLIGHTED_WOOD_LOG, KyomodModTabs.TAB_ENDER_LILIES);
	public static final RegistryObject<Item> BLIGHTED_WOOD_PLANKS = block(KyomodModBlocks.BLIGHTED_WOOD_PLANKS, KyomodModTabs.TAB_ENDER_LILIES);
	public static final RegistryObject<Item> BLIGHTED_WOOD_LEAVES = block(KyomodModBlocks.BLIGHTED_WOOD_LEAVES, KyomodModTabs.TAB_ENDER_LILIES);
	public static final RegistryObject<Item> BLIGHTED_WOOD_STAIRS = block(KyomodModBlocks.BLIGHTED_WOOD_STAIRS, KyomodModTabs.TAB_ENDER_LILIES);
	public static final RegistryObject<Item> BLIGHTED_WOOD_SLAB = block(KyomodModBlocks.BLIGHTED_WOOD_SLAB, KyomodModTabs.TAB_ENDER_LILIES);
	public static final RegistryObject<Item> BLIGHTED_WOOD_FENCE = block(KyomodModBlocks.BLIGHTED_WOOD_FENCE, KyomodModTabs.TAB_ENDER_LILIES);
	public static final RegistryObject<Item> BLIGHTED_WOOD_FENCE_GATE = block(KyomodModBlocks.BLIGHTED_WOOD_FENCE_GATE,
			KyomodModTabs.TAB_ENDER_LILIES);
	public static final RegistryObject<Item> BLIGHTED_WOOD_PRESSURE_PLATE = block(KyomodModBlocks.BLIGHTED_WOOD_PRESSURE_PLATE,
			KyomodModTabs.TAB_ENDER_LILIES);
	public static final RegistryObject<Item> BLIGHTED_WOOD_BUTTON = block(KyomodModBlocks.BLIGHTED_WOOD_BUTTON, KyomodModTabs.TAB_ENDER_LILIES);
	public static final RegistryObject<Item> BULLET_1 = REGISTRY.register("bullet_1", () -> new Bullet1Item());
	public static final RegistryObject<Item> HIFUMI = REGISTRY.register("hifumi_spawn_egg",
			() -> new ForgeSpawnEggItem(KyomodModEntities.HIFUMI, -103, -1, new Item.Properties().tab(KyomodModTabs.TAB_BLUE_ARCHIVE)));
	public static final RegistryObject<Item> HIFUMI_BULLET = REGISTRY.register("hifumi_bullet", () -> new HifumiBulletItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
