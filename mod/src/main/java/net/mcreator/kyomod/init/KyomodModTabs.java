
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kyomod.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class KyomodModTabs {
	public static CreativeModeTab TAB_BLUE_ARCHIVE;
	public static CreativeModeTab TAB_ENDER_LILIES;

	public static void load() {
		TAB_BLUE_ARCHIVE = new CreativeModeTab("tabblue_archive") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(KyomodModBlocks.HALO_BLOCK.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_ENDER_LILIES = new CreativeModeTab("tabender_lilies") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(KyomodModItems.LANDS_END_DIMENSION.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
