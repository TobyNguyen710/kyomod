
package net.mcreator.kyomod.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.kyomod.procedures.XPEffectStartedappliedProcedure;

public class XPMobEffect extends MobEffect {
	public XPMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -7680);
	}

	@Override
	public String getDescriptionId() {
		return "effect.kyomod.xp";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyInstantenousEffect(Entity source, Entity indirectSource, LivingEntity entity, int amplifier, double health) {
		XPEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
