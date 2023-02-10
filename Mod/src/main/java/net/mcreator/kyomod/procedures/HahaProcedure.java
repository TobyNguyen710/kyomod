package net.mcreator.kyomod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.client.Minecraft;

import net.mcreator.kyomod.init.KyomodModItems;

public class HahaProcedure {
	public static void execute(LevelAccessor world) {
		if (3 == 3) {
			if (world.isClientSide())
				Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(KyomodModItems.HALO.get()));
		}
	}
}
