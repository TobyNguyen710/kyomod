
package net.mcreator.kyomod.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.entity.EquipmentSlot;

public class TestEnchantment extends Enchantment {
	public TestEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.UNCOMMON, EnchantmentCategory.VANISHABLE, slots);
	}

	@Override
	public int getMaxLevel() {
		return 3;
	}
}
