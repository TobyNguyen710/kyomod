
package net.mcreator.kyomod.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.kyomod.procedures.UnlimitedNightVisionEffectEffectStartedappliedProcedure;

public class UnlimitedNightVisionEffectMobEffect extends MobEffect {
	public UnlimitedNightVisionEffectMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16643398);
	}

	@Override
	public String getDescriptionId() {
		return "effect.kyomod.unlimited_night_vision_effect";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyInstantenousEffect(Entity source, Entity indirectSource, LivingEntity entity, int amplifier, double health) {
		UnlimitedNightVisionEffectEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
