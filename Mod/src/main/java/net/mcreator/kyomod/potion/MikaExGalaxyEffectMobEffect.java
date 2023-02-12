
package net.mcreator.kyomod.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.kyomod.procedures.MikaExGalaxyEffectExpiresProcedure;

public class MikaExGalaxyEffectMobEffect extends MobEffect {
	public MikaExGalaxyEffectMobEffect() {
		super(MobEffectCategory.HARMFUL, -26113);
	}

	@Override
	public String getDescriptionId() {
		return "effect.kyomod.mika_ex_galaxy_effect";
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		MikaExGalaxyEffectExpiresProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
