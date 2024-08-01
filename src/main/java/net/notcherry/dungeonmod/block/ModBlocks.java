package net.notcherry.dungeonmod.block;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.notcherry.dungeonmod.DungeonMod;
import net.notcherry.dungeonmod.block.custom.CookingPotBlock;
import net.notcherry.dungeonmod.item.ModItems;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.notcherry.dungeonmod.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, DungeonMod.MOD_ID);

//    public static final RegistryObject<Block> BUTTERCUP = registerBlock("moonbloom",
//            () -> new FlowerBlock(() -> MobEffects.LUCK, 5,
//                    BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion().noCollission()));
//    public static final RegistryObject<Block> POTTED_BUTTERCUP = BLOCKS.register("potted_moonbloom",
//            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.BUTTERCUP,
//                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));

    public static final RegistryObject<Block> COOKING_POT = registerBlock("cooking_pot",
            () -> new CookingPotBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItems(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItems(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}