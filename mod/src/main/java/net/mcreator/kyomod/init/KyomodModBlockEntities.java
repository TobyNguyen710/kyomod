
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kyomod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.kyomod.block.entity.SupremeGeneratorBlockEntity;
import net.mcreator.kyomod.block.entity.GeneratorBlockEntity;
import net.mcreator.kyomod.KyomodMod;

public class KyomodModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, KyomodMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> GENERATOR = register("generator", KyomodModBlocks.GENERATOR, GeneratorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SUPREME_GENERATOR = register("supreme_generator", KyomodModBlocks.SUPREME_GENERATOR,
			SupremeGeneratorBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
