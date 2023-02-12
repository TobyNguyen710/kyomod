package net.mcreator.kyomod.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.kyomod.init.KyomodModItems;

public class PurificationWeaverItemInInventoryTickNBTProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getOrCreateTag().getDouble("SakurakoExTimer") == 200) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(KyomodModItems.PURIFICATION_WEAVER_EX.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
						_player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(KyomodModItems.PURIFICATION_WEAVER.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else {
			itemstack.getOrCreateTag().putDouble("SakurakoExTimer", (itemstack.getOrCreateTag().getDouble("SakurakoExTimer") + 1));
		}
	}
}
