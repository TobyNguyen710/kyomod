
package net.mcreator.kyomod.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.kyomod.procedures.KeepInventoryEffectStartedappliedProcedure;

public class KeepInventoryMobEffect extends MobEffect {
	public KeepInventoryMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16580792);
	}

	@Override
	public String getDescriptionId() {
		return "effect.kyomod.keep_inventory";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyInstantenousEffect(Entity source, Entity indirectSource, LivingEntity entity, int amplifier, double health) {
		KeepInventoryEffectStartedappliedProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ());
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
