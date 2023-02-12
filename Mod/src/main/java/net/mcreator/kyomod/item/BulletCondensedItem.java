
package net.mcreator.kyomod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.kyomod.init.KyomodModTabs;

import java.util.List;

public class BulletCondensedItem extends Item {
	public BulletCondensedItem() {
		super(new Item.Properties().tab(KyomodModTabs.TAB_BLUE_ARCHIVE).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public int getEnchantmentValue() {
		return 20;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Many Bullets!"));
	}
}
