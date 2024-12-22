package net.silverdisk.drpilkshakemod.effect;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.silverdisk.drpilkshakemod.PilkshakeMod;
import net.minecraft.world.entity.ai.attributes.Attributes;


public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, PilkshakeMod.MOD_ID);

    public static final RegistryObject<MobEffect> RegPepperEffect = MOB_EFFECTS.register("pepper",
            () -> new RegPepperEffect(MobEffectCategory.HARMFUL, 0x553D2B));


    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }

}
