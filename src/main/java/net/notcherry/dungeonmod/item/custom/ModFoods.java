package net.notcherry.dungeonmod.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties MANDRAKE = new FoodProperties.Builder().nutrition(5).fast()
            .saturationMod(0.3f)
            .effect(() -> new MobEffectInstance(MobEffects.POISON, 100), 0.25f)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 200), 0.10f)
            .build();

    public static final FoodProperties MANDRAKE_HEAD = new FoodProperties.Builder().nutrition(3).fast()
            .saturationMod(0.1f)
            .effect(() -> new MobEffectInstance(MobEffects.POISON, 100), 0.75f)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 200), 0.50f)
            .build();
}
