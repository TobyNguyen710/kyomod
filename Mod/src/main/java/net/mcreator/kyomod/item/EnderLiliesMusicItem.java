
package net.mcreator.kyomod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.kyomod.init.KyomodModTabs;

public class EnderLiliesMusicItem extends RecordItem {
	public EnderLiliesMusicItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("kyomod:ender_lilies")),
				new Item.Properties().tab(KyomodModTabs.TAB_ENDER_LILIES).stacksTo(1).rarity(Rarity.RARE), 100);
	}
}
