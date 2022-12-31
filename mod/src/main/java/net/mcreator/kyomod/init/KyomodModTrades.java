
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.kyomod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class KyomodModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.WEAPONSMITH) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(KyomodModItems.HALO_CORE.get()), new ItemStack(Items.EMERALD, 32),
					new ItemStack(KyomodModItems.FRESH_INPIRATION.get()), 10, 500, 0f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(KyomodModItems.HALO_CORE.get()), new ItemStack(Items.EMERALD, 32),
					new ItemStack(KyomodModItems.ET_OMNIA_VANITAS.get()), 10, 5, 0.05f));
		}
	}
}
