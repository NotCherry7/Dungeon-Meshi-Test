package net.notcherry.dungeonmod;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.notcherry.dungeonmod.block.ModBlocks;
import net.notcherry.dungeonmod.block.entity.ModBlockEntities;
import net.notcherry.dungeonmod.effect.ModEffects;
import net.notcherry.dungeonmod.entity.ModEntities;
import net.notcherry.dungeonmod.entity.client.MandrakeRenderer;
import net.notcherry.dungeonmod.event.KeyboardEventHandler;
import net.notcherry.dungeonmod.event.MouseEventHandler;
import net.notcherry.dungeonmod.event.MouseScrollEventHandler;
import net.notcherry.dungeonmod.item.ModCreativeModTabs;
import net.notcherry.dungeonmod.item.ModItems;
import net.notcherry.dungeonmod.potion.ModPotions;
import net.notcherry.dungeonmod.recipe.ModRecipes;
import net.notcherry.dungeonmod.screen.CookingPotMenu;
import net.notcherry.dungeonmod.screen.CookingPotScreen;
import net.notcherry.dungeonmod.screen.ModMenuTypes;
import net.notcherry.dungeonmod.sounds.ModSounds;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(DungeonMod.MOD_ID)
public class DungeonMod {

    public static final String MOD_ID = "dungeonmod";

    private static final Logger LOGGER = LogUtils.getLogger();

    public DungeonMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

//        modEventBus.register(new KeyboardEventHandler());
//        modEventBus.register(new MouseEventHandler());
//        modEventBus.register(new MouseScrollEventHandler());

        ModCreativeModTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModSounds.register(modEventBus);
        ModEntities.register(modEventBus);

        ModEffects.register(modEventBus);
        ModPotions.register(modEventBus);

        ModBlockEntities.register(modEventBus);
        ModMenuTypes.register(modEventBus);
        ModRecipes.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {

        });
    }


    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.FIRE_SHARD);
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

        LOGGER.info("HELLO from server starting");
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            EntityRenderers.register(ModEntities.MANDRAKE.get(), MandrakeRenderer::new);

            MenuScreens.register(ModMenuTypes.COOKING_POT_MENU.get(), CookingPotScreen::new);
        }
    }
}
