package net.notcherry.dungeonmod.item;

import net.notcherry.dungeonmod.DungeonMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.notcherry.dungeonmod.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DungeonMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> DUNGEON_TAB = CREATIVE_MODE_TABS.register("dungeon_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MANDRAKE.get()))
                    .title(Component.translatable("creativetab.dungeon_tab"))
                    .displayItems((pParameters, pOutput) -> {
// ITEMS

                        pOutput.accept(ModItems.MANDRAKE.get());
                        pOutput.accept(ModItems.MANDRAKE_HEAD.get());
                        pOutput.accept(ModItems.MANDRAKE_SPAWN_EGG.get());
// BLOCKS
                        pOutput.accept(ModBlocks.COOKING_POT.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}