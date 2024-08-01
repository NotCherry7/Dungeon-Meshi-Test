package net.notcherry.dungeonmod.datagen;

import net.minecraftforge.client.model.generators.ModelFile;
import net.notcherry.dungeonmod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.notcherry.dungeonmod.DungeonMod;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, DungeonMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
//        blockWithItem(ModBlocks.SUNTRANT_ORE);
//
//
//        stairsBlock(((StairBlock) ModBlocks.MOONPEARL_STAIRS.get()), blockTexture(ModBlocks.MOONPEARL_BLOCK.get()));
//        slabBlock(((SlabBlock) ModBlocks.MOONPEARL_SLAB.get()), blockTexture(ModBlocks.MOONPEARL_BLOCK.get()), blockTexture(ModBlocks.MOONPEARL_BLOCK.get()));
//
//        buttonBlock(((ButtonBlock) ModBlocks.MOONPEARL_BUTTON.get()), blockTexture(ModBlocks.MOONPEARL_BLOCK.get()));
//        pressurePlateBlock(((PressurePlateBlock) ModBlocks.MOONPEARL_PRESSURE_PLATE.get()), blockTexture(ModBlocks.MOONPEARL_BLOCK.get()));
//
//        fenceBlock(((FenceBlock) ModBlocks.MOONPEARL_FENCE.get()), blockTexture(ModBlocks.MOONPEARL_BLOCK.get()));
//        fenceGateBlock(((FenceGateBlock) ModBlocks.MOONPEARL_FENCE_GATE.get()), blockTexture(ModBlocks.MOONPEARL_BLOCK.get()));
//        wallBlock(((WallBlock) ModBlocks.MOONPEARL_WALL.get()), blockTexture(ModBlocks.MOONPEARL_BLOCK.get()));

//        doorBlockWithRenderType(((DoorBlock) ModBlocks.MOONPEARL_DOOR.get()), modLoc("block/moonpearl_door_bottom"), modLoc("block/moonpearl_door_top"), "cutout");
//        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.MOONPEARL_TRAPDOOR.get()), modLoc("block/moonpearl_trapdoor"), true, "cutout");

//        simpleBlockWithItem(ModBlocks.BUTTERCUP.get(), models().cross(blockTexture(ModBlocks.BUTTERCUP.get()).getPath(),
//                blockTexture(ModBlocks.BUTTERCUP.get())).renderType("cutout"));
//        simpleBlockWithItem(ModBlocks.POTTED_BUTTERCUP.get(), models().singleTexture("potted_buttercup", new ResourceLocation("flower_pot_cross"), "plant",
//                blockTexture(ModBlocks.BUTTERCUP.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.COOKING_POT.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/cooking_pot")));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
