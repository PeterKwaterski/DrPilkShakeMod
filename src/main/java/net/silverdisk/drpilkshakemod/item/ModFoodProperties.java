package net.silverdisk.drpilkshakemod.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties ICE_CREAM = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2f).build();
    public static final FoodProperties CHOC_ICE_CREAM = new FoodProperties.Builder().nutrition(8).saturationModifier(1.2f).build();
    public static final FoodProperties MILKSHAKE = new FoodProperties.Builder().nutrition(9).saturationModifier(1.5f).build();
    public static final FoodProperties CHOC_MILKSHAKE = new FoodProperties.Builder().nutrition(12).saturationModifier(1.5f).build();
}
