
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kyomod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.kyomod.block.SupremeGeneratorBlock;
import net.mcreator.kyomod.block.LilyBlock;
import net.mcreator.kyomod.block.LandsEndDimensionPortalBlock;
import net.mcreator.kyomod.block.HaloOreBlock;
import net.mcreator.kyomod.block.HaloBlockBlock;
import net.mcreator.kyomod.block.GeneratorBlock;
import net.mcreator.kyomod.block.BlightedWoodWoodBlock;
import net.mcreator.kyomod.block.BlightedWoodStairsBlock;
import net.mcreator.kyomod.block.BlightedWoodSlabBlock;
import net.mcreator.kyomod.block.BlightedWoodPressurePlateBlock;
import net.mcreator.kyomod.block.BlightedWoodPlanksBlock;
import net.mcreator.kyomod.block.BlightedWoodLogBlock;
import net.mcreator.kyomod.block.BlightedWoodLeavesBlock;
import net.mcreator.kyomod.block.BlightedWoodFenceGateBlock;
import net.mcreator.kyomod.block.BlightedWoodFenceBlock;
import net.mcreator.kyomod.block.BlightedWoodButtonBlock;
import net.mcreator.kyomod.block.BlightedStoneBlock;
import net.mcreator.kyomod.block.BlightedGrassBlock;
import net.mcreator.kyomod.block.BlightedDirtBlock;
import net.mcreator.kyomod.KyomodMod;

public class KyomodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, KyomodMod.MODID);
	public static final RegistryObject<Block> HALO_ORE = REGISTRY.register("halo_ore", () -> new HaloOreBlock());
	public static final RegistryObject<Block> HALO_BLOCK = REGISTRY.register("halo_block", () -> new HaloBlockBlock());
	public static final RegistryObject<Block> GENERATOR = REGISTRY.register("generator", () -> new GeneratorBlock());
	public static final RegistryObject<Block> SUPREME_GENERATOR = REGISTRY.register("supreme_generator", () -> new SupremeGeneratorBlock());
	public static final RegistryObject<Block> LANDS_END_DIMENSION_PORTAL = REGISTRY.register("lands_end_dimension_portal",
			() -> new LandsEndDimensionPortalBlock());
	public static final RegistryObject<Block> BLIGHTED_GRASS = REGISTRY.register("blighted_grass", () -> new BlightedGrassBlock());
	public static final RegistryObject<Block> BLIGHTED_DIRT = REGISTRY.register("blighted_dirt", () -> new BlightedDirtBlock());
	public static final RegistryObject<Block> BLIGHTED_STONE = REGISTRY.register("blighted_stone", () -> new BlightedStoneBlock());
	public static final RegistryObject<Block> LILY = REGISTRY.register("lily", () -> new LilyBlock());
	public static final RegistryObject<Block> BLIGHTED_WOOD_WOOD = REGISTRY.register("blighted_wood_wood", () -> new BlightedWoodWoodBlock());
	public static final RegistryObject<Block> BLIGHTED_WOOD_LOG = REGISTRY.register("blighted_wood_log", () -> new BlightedWoodLogBlock());
	public static final RegistryObject<Block> BLIGHTED_WOOD_PLANKS = REGISTRY.register("blighted_wood_planks", () -> new BlightedWoodPlanksBlock());
	public static final RegistryObject<Block> BLIGHTED_WOOD_LEAVES = REGISTRY.register("blighted_wood_leaves", () -> new BlightedWoodLeavesBlock());
	public static final RegistryObject<Block> BLIGHTED_WOOD_STAIRS = REGISTRY.register("blighted_wood_stairs", () -> new BlightedWoodStairsBlock());
	public static final RegistryObject<Block> BLIGHTED_WOOD_SLAB = REGISTRY.register("blighted_wood_slab", () -> new BlightedWoodSlabBlock());
	public static final RegistryObject<Block> BLIGHTED_WOOD_FENCE = REGISTRY.register("blighted_wood_fence", () -> new BlightedWoodFenceBlock());
	public static final RegistryObject<Block> BLIGHTED_WOOD_FENCE_GATE = REGISTRY.register("blighted_wood_fence_gate",
			() -> new BlightedWoodFenceGateBlock());
	public static final RegistryObject<Block> BLIGHTED_WOOD_PRESSURE_PLATE = REGISTRY.register("blighted_wood_pressure_plate",
			() -> new BlightedWoodPressurePlateBlock());
	public static final RegistryObject<Block> BLIGHTED_WOOD_BUTTON = REGISTRY.register("blighted_wood_button", () -> new BlightedWoodButtonBlock());
}
