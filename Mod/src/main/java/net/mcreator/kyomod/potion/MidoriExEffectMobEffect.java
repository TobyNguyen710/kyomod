
package net.mcreator.kyomod.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.kyomod.procedures.MidoriExEffectStartsProcedure;

public class MidoriExEffectMobEffect extends MobEffect {
	public MidoriExEffectMobEffect() {
		super(MobEffectCategory.HARMFUL, -16711936);
	}

	@Override
	public String getDescriptionId() {
		return "effect.kyomod.midori_ex_effect";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		MidoriExEffectStartsProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
