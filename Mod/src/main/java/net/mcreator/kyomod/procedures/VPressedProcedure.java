package net.mcreator.kyomod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.kyomod.network.KyomodModVariables;
import net.mcreator.kyomod.init.KyomodModItems;
import net.mcreator.kyomod.init.KyomodModEntities;
import net.mcreator.kyomod.entity.BulletMikaExEntity;
import net.mcreator.kyomod.entity.Bullet1Entity;
import net.mcreator.kyomod.KyomodMod;

public class VPressedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == KyomodModItems.FRESH_INPIRATION.get()
				&& (entity.getCapability(KyomodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new KyomodModVariables.PlayerVariables())).midoriAbility == false) {
			{
				boolean _setval = true;
				entity.getCapability(KyomodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.midoriAbility = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("kyomod:modori_skill_1")), SoundSource.PLAYERS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("kyomod:modori_skill_1")),
							SoundSource.PLAYERS, 1, 1, false);
				}
			}
			if (entity instanceof Player _plr ? _plr.getAbilities().instabuild : false) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60, 1, (true), (true)));
				{
					ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
					if (_ist.hurt(1, RandomSource.create(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(KyomodModItems.FRESH_INPIRATION.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (entity instanceof Player _player)
					_player.getCooldowns()
							.addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 13);
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""),
									_level.getServer(), null).withSuppressedOutput(),
							"effect give @e[type=!minecraft:player,type=!minecraft:horse, type=!minecraft:villager, type=!minecraft:wolf, tag=!midori_ex_cant_hit, limit=5, sort=nearest] kyomod:midori_ex_effect 1 1 true");
			} else if (entity instanceof Player _playerHasItem
					? _playerHasItem.getInventory().contains(new ItemStack(KyomodModItems.HALO.get()))
					: false) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60, 1, (true), (true)));
				{
					ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
					if (_ist.hurt(1, RandomSource.create(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(KyomodModItems.FRESH_INPIRATION.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (entity instanceof Player _player)
					_player.getCooldowns()
							.addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 13);
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""),
									_level.getServer(), null).withSuppressedOutput(),
							"effect give @e[type=!minecraft:player,type=!minecraft:horse, type=!minecraft:villager, type=!minecraft:wolf, tag=!midori_ex_cant_hit, limit=5, sort=nearest] kyomod:midori_ex_effect 1 1 true");
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(KyomodModItems.HALO.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 3,
							_player.inventoryMenu.getCraftSlots());
				}
			}
			KyomodMod.queueServerWork(240, () -> {
				{
					boolean _setval = false;
					entity.getCapability(KyomodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.midoriAbility = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7aAbility ready."), (true));
			});
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == KyomodModItems.ET_OMNIA_VANITAS
				.get()
				&& (entity.getCapability(KyomodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new KyomodModVariables.PlayerVariables())).azusaAbility == false) {
			{
				boolean _setval = true;
				entity.getCapability(KyomodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.azusaAbility = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("kyomod:azusa_skill")),
							SoundSource.PLAYERS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("kyomod:azusa_skill")),
							SoundSource.PLAYERS, 1, 1, false);
				}
			}
			if (entity instanceof Player _plr ? _plr.getAbilities().instabuild : false) {
				{
					ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
					if (_ist.hurt(1, RandomSource.create(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(KyomodModItems.ET_OMNIA_VANITAS.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (entity instanceof Player _player)
					_player.getCooldowns()
							.addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 13);
				{
					Entity _shootFrom = entity;
					Level projectileLevel = _shootFrom.level;
					if (!projectileLevel.isClientSide()) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, float damage, int knockback) {
								AbstractArrow entityToSpawn = new Bullet1Entity(KyomodModEntities.BULLET_1.get(), level);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, (float) 3.34, 1);
						_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
						_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 15, 0);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
				}
			} else if (entity instanceof Player _playerHasItem
					? _playerHasItem.getInventory().contains(new ItemStack(KyomodModItems.HALO.get()))
					: false) {
				{
					ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
					if (_ist.hurt(1, RandomSource.create(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(KyomodModItems.ET_OMNIA_VANITAS.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (entity instanceof Player _player)
					_player.getCooldowns()
							.addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 13);
				{
					Entity _shootFrom = entity;
					Level projectileLevel = _shootFrom.level;
					if (!projectileLevel.isClientSide()) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, float damage, int knockback) {
								AbstractArrow entityToSpawn = new Bullet1Entity(KyomodModEntities.BULLET_1.get(), level);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, (float) 3.34, 1);
						_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
						_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 15, 0);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(KyomodModItems.HALO.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 5,
							_player.inventoryMenu.getCraftSlots());
				}
			}
			KyomodMod.queueServerWork(400, () -> {
				{
					boolean _setval = false;
					entity.getCapability(KyomodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.azusaAbility = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7dAbility ready."), (true));
			});
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
				.getItem() == KyomodModItems.PURIFICATION_WEAVER.get()
				&& (entity.getCapability(KyomodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new KyomodModVariables.PlayerVariables())).sakurakoAbility == false) {
			{
				boolean _setval = true;
				entity.getCapability(KyomodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.sakurakoAbility = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("kyomod:sakurako_skill")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("kyomod:sakurako_skill")),
							SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (entity instanceof Player _plr ? _plr.getAbilities().instabuild : false) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(KyomodModItems.PURIFICATION_WEAVER_EX.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("SakurakoExTimer",
						0);
				(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("SakurakoExBullets",
						20);
			} else if (entity instanceof Player _playerHasItem
					? _playerHasItem.getInventory().contains(new ItemStack(KyomodModItems.HALO.get()))
					: false) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(KyomodModItems.PURIFICATION_WEAVER_EX.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("SakurakoExTimer",
						0);
				(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("SakurakoExBullets",
						20);
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(KyomodModItems.HALO.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 4,
							_player.inventoryMenu.getCraftSlots());
				}
			}
			KyomodMod.queueServerWork(320, () -> {
				{
					boolean _setval = false;
					entity.getCapability(KyomodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.sakurakoAbility = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A77Ability ready."), (true));
			});
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == KyomodModItems.QUIS_UT_DEUS
				.get()
				&& (entity.getCapability(KyomodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new KyomodModVariables.PlayerVariables())).mikaAbility == false) {
			{
				boolean _setval = true;
				entity.getCapability(KyomodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.mikaAbility = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("kyomod:mika_skill")),
							SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("kyomod:mika_skill")),
							SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (entity instanceof Player _plr ? _plr.getAbilities().instabuild : false) {
				{
					ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
					if (_ist.hurt(1, RandomSource.create(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(KyomodModItems.QUIS_UT_DEUS.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (entity instanceof Player _player)
					_player.getCooldowns()
							.addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 13);
				{
					Entity _shootFrom = entity;
					Level projectileLevel = _shootFrom.level;
					if (!projectileLevel.isClientSide()) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, float damage, int knockback) {
								AbstractArrow entityToSpawn = new BulletMikaExEntity(KyomodModEntities.BULLET_MIKA_EX.get(), level);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, 1, 1);
						_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
						_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 15, 0);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
				}
			} else if (entity instanceof Player _playerHasItem
					? _playerHasItem.getInventory().contains(new ItemStack(KyomodModItems.HALO.get()))
					: false) {
				{
					ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
					if (_ist.hurt(1, RandomSource.create(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(KyomodModItems.QUIS_UT_DEUS.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (entity instanceof Player _player)
					_player.getCooldowns()
							.addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 13);
				{
					Entity _shootFrom = entity;
					Level projectileLevel = _shootFrom.level;
					if (!projectileLevel.isClientSide()) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, float damage, int knockback) {
								AbstractArrow entityToSpawn = new BulletMikaExEntity(KyomodModEntities.BULLET_MIKA_EX.get(), level);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, 1, 1);
						_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
						_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 15, 0);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(KyomodModItems.HALO.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 6,
							_player.inventoryMenu.getCraftSlots());
				}
			}
			KyomodMod.queueServerWork(100, () -> {
				{
					boolean _setval = false;
					entity.getCapability(KyomodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.mikaAbility = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A75Ability ready."), (true));
			});
		}
	}
}
