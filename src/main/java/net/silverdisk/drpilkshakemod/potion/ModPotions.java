package net.silverdisk.drpilkshakemod.potion;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.silverdisk.drpilkshakemod.PilkshakeMod;
import net.silverdisk.drpilkshakemod.effect.ModEffects;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS =
            DeferredRegister.create(ForgeRegistries.POTIONS, PilkshakeMod.MOD_ID);

    public static final RegistryObject<Potion> DRPEPPER = POTIONS.register("flatdrpepper",
            () -> new Potion(new MobEffectInstance(ModEffects.RegPepperEffect.getHolder().get(), 1, 0)));

    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }
}
