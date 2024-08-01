package net.notcherry.dungeonmod.entity;

import net.notcherry.dungeonmod.DungeonMod;
import net.notcherry.dungeonmod.entity.custom.MandrakeEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, DungeonMod.MOD_ID);

    public static final RegistryObject<EntityType<MandrakeEntity>> MANDRAKE =
            ENTITY_TYPES.register("mandrake", () -> EntityType.Builder.of(MandrakeEntity::new, MobCategory.CREATURE)
                    .sized(0.2f, 1.4f).build("mandrake"));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
