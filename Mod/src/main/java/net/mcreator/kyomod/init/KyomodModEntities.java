
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kyomod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.kyomod.entity.HifumiEntity;
import net.mcreator.kyomod.entity.HifumiBulletEntity;
import net.mcreator.kyomod.entity.Bullet1Entity;
import net.mcreator.kyomod.entity.BlightedGolemEntity;
import net.mcreator.kyomod.KyomodMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class KyomodModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, KyomodMod.MODID);
	public static final RegistryObject<EntityType<BlightedGolemEntity>> BLIGHTED_GOLEM = register("blighted_golem",
			EntityType.Builder.<BlightedGolemEntity>of(BlightedGolemEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlightedGolemEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Bullet1Entity>> BULLET_1 = register("projectile_bullet_1",
			EntityType.Builder.<Bullet1Entity>of(Bullet1Entity::new, MobCategory.MISC).setCustomClientFactory(Bullet1Entity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<HifumiEntity>> HIFUMI = register("hifumi",
			EntityType.Builder.<HifumiEntity>of(HifumiEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(HifumiEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HifumiBulletEntity>> HIFUMI_BULLET = register("projectile_hifumi_bullet",
			EntityType.Builder.<HifumiBulletEntity>of(HifumiBulletEntity::new, MobCategory.MISC).setCustomClientFactory(HifumiBulletEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			BlightedGolemEntity.init();
			HifumiEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(BLIGHTED_GOLEM.get(), BlightedGolemEntity.createAttributes().build());
		event.put(HIFUMI.get(), HifumiEntity.createAttributes().build());
	}
}
