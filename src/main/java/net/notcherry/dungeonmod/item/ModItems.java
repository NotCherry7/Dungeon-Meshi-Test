package net.notcherry.dungeonmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import net.notcherry.dungeonmod.DungeonMod;
import net.notcherry.dungeonmod.item.custom.ModFoods;
import net.notcherry.dungeonmod.entity.ModEntities;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DungeonMod.MOD_ID);

    public static final RegistryObject<Item> FIRE_SHARD = ITEMS.register("fire_shard",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MANDRAKE = ITEMS.register("mandrake",
            () -> new Item(new Item.Properties().food(ModFoods.MANDRAKE)));

    public static final RegistryObject<Item> MANDRAKE_HEAD = ITEMS.register("mandrake_head",
            () -> new Item(new Item.Properties().food(ModFoods.MANDRAKE_HEAD)));

    public static final RegistryObject<Item> MANDRAKE_SPAWN_EGG = ITEMS.register("mandrake_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.MANDRAKE, 0x7A3425, 0x456B26,
                    new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
