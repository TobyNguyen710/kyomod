package net.mcreator.kyomod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.kyomod.init.KyomodModMobEffects;

public class BulletMikaExProjectileHitsLivingEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos(x, y, z),
						ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("kyomod:mika_skill_hit_then_explode")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("kyomod:mika_skill_hit_then_explode")),
						SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(KyomodModMobEffects.MIKA_EX_GALAXY_EFFECT.get(), 61, 1, (false), (false)));
	}
}
