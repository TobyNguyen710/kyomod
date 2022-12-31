
package net.mcreator.kyomod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.kyomod.init.KyomodModTabs;

public class Theme139Item extends RecordItem {
	public Theme139Item() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("kyomod:theme139")),
				new Item.Properties().tab(KyomodModTabs.TAB_BLUE_ARCHIVE).stacksTo(1).rarity(Rarity.RARE), 100);
	}
}
