package net.notcherry.dungeonmod.event;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.notcherry.dungeonmod.DungeonMod;
import net.notcherry.dungeonmod.entity.ModEntities;
import net.notcherry.dungeonmod.entity.custom.MandrakeEntity;

@Mod.EventBusSubscriber(modid = DungeonMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.MANDRAKE.get(), MandrakeEntity.createAttributes().build());
    }
}
