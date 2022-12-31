
package net.mcreator.kyomod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.kyomod.init.KyomodModTabs;
import net.mcreator.kyomod.init.KyomodModItems;

public class HallowAxeItem extends AxeItem {
	public HallowAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 660;
			}

			public float getSpeed() {
				return 15f;
			}

			public float getAttackDamageBonus() {
				return 16f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 28;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(KyomodModItems.HALO.get()));
			}
		}, 1, -3f, new Item.Properties().tab(KyomodModTabs.TAB_BLUE_ARCHIVE));
	}
}
