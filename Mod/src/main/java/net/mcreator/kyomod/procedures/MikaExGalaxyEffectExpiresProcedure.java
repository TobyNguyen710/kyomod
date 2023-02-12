package net.mcreator.kyomod.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class MikaExGalaxyEffectExpiresProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)
					- (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) / 3));
		entity.hurt(DamageSource.MAGIC, 20);
	}
}
