package net.notcherry.dungeonmod.datagen;

import net.notcherry.dungeonmod.DungeonMod;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.GlobalLootModifierProvider;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, DungeonMod.MOD_ID);
    }

    @Override
    protected void start() {
//        add("sorcerer_branch_from_leaves", new AddItemModifier(new LootItemCondition[]{
//                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.OAK_LEAVES).build(),
//                LootItemRandomChanceCondition.randomChance(0.6f).build()}, ModItems.FIRE_SHARD.get()));

//        add("buttercup_from_moobloom", new AddItemModifier(new LootItemCondition[]{
//                new LootTableIdCondition.Builder(new ResourceLocation("entity/moobloomentity")).build(),
//                LootItemRandomChanceCondition.randomChance(2.4f).build()}, Items.DANDELION));

    }
}
