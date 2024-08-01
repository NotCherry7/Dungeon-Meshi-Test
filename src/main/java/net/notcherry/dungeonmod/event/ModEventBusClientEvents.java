package net.notcherry.dungeonmod.event;

import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.notcherry.dungeonmod.DungeonMod;
import net.notcherry.dungeonmod.entity.ModEntities;
import net.notcherry.dungeonmod.entity.client.MandrakeModel;
import net.notcherry.dungeonmod.entity.client.MandrakeRenderer;
import net.notcherry.dungeonmod.entity.client.ModModelLayers;

@Mod.EventBusSubscriber(modid = DungeonMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.MANDRAKE_LAYER, MandrakeModel::createBodyLayer);
    }

}
