
package net.mcreator.kyomod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.kyomod.procedures.HaloItemInHandTickProcedure;
import net.mcreator.kyomod.init.KyomodModTabs;

import java.util.List;

public class HaloItem extends Item {
	public HaloItem() {
		super(new Item.Properties().tab(KyomodModTabs.TAB_BLUE_ARCHIVE).stacksTo(64).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("A mysterious gem that allows you to reach Gods"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		HaloItemInHandTickProcedure.execute(world, entity);
	}
}
