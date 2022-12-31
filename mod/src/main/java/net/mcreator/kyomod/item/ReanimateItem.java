
package net.mcreator.kyomod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import net.mcreator.kyomod.init.KyomodModTabs;

import java.util.List;

public class ReanimateItem extends RecordItem {
	public ReanimateItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("kyomod:reanimate")),
				new Item.Properties().tab(KyomodModTabs.TAB_BLUE_ARCHIVE).stacksTo(1).rarity(Rarity.RARE), 100);
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A74Sounds of the damned"));
	}
}
