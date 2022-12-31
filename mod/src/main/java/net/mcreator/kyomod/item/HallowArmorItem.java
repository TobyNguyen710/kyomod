
package net.mcreator.kyomod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.kyomod.init.KyomodModTabs;
import net.mcreator.kyomod.init.KyomodModItems;

public abstract class HallowArmorItem extends ArmorItem {
	public HallowArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 40;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{5, 15, 15, 5}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 18;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(KyomodModItems.HALO.get()));
			}

			@Override
			public String getName() {
				return "hallow_armor";
			}

			@Override
			public float getToughness() {
				return 3f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.2f;
			}
		}, slot, properties);
	}

	public static class Helmet extends HallowArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(KyomodModTabs.TAB_BLUE_ARCHIVE));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "kyomod:textures/models/armor/haloknight__layer_1.png";
		}
	}

	public static class Chestplate extends HallowArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(KyomodModTabs.TAB_BLUE_ARCHIVE));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "kyomod:textures/models/armor/haloknight__layer_1.png";
		}
	}

	public static class Leggings extends HallowArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(KyomodModTabs.TAB_BLUE_ARCHIVE));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "kyomod:textures/models/armor/haloknight__layer_2.png";
		}
	}

	public static class Boots extends HallowArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(KyomodModTabs.TAB_BLUE_ARCHIVE));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "kyomod:textures/models/armor/haloknight__layer_1.png";
		}
	}
}
