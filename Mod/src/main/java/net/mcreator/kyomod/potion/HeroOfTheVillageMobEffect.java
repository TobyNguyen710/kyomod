
package net.mcreator.kyomod.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.kyomod.procedures.HeroOfTheVillageEffectStartedappliedProcedure;

public class HeroOfTheVillageMobEffect extends MobEffect {
	public HeroOfTheVillageMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -3866791);
	}

	@Override
	public String getDescriptionId() {
		return "effect.kyomod.hero_of_the_village";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyInstantenousEffect(Entity source, Entity indirectSource, LivingEntity entity, int amplifier, double health) {
		HeroOfTheVillageEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
