package net.silverdisk.drpilkshakemod.event;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraftforge.event.brewing.BrewingRecipeRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.silverdisk.drpilkshakemod.PilkshakeMod;
import net.silverdisk.drpilkshakemod.item.ModItems;
import net.silverdisk.drpilkshakemod.potion.ModPotions;

@Mod.EventBusSubscriber(modid = PilkshakeMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModEvents {

    @SubscribeEvent
    public static void onBrewingRecipeRegistry(BrewingRecipeRegisterEvent event){
        PotionBrewing.Builder builder = event.getBuilder();
        builder.addMix(Potions.WATER, ModItems.DRPEPPERSYRUP.get(), ModPotions.DRPEPPER.getHolder().get());
    }
}
