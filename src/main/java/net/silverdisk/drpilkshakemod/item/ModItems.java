package net.silverdisk.drpilkshakemod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.silverdisk.drpilkshakemod.PilkshakeMod;
import net.silverdisk.drpilkshakemod.item.custom.DrPepperItem;
import net.silverdisk.drpilkshakemod.item.custom.PilkshakeItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PilkshakeMod.MOD_ID);

    public static final RegistryObject<Item> DRPEPPERSYRUP = ITEMS.register("dpsyrup",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRPEPPER = ITEMS.register("drpepper",
            () -> new DrPepperItem(new Item.Properties()));

    public static final RegistryObject<Item> PILKSHAKE = ITEMS.register("pilkshake",
            () -> new PilkshakeItem(new Item.Properties()));

    public static final RegistryObject<Item> CAN = ITEMS.register("can",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ICE_CREAM = ITEMS.register("icecream",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ICE_CREAM)));

    public static final RegistryObject<Item> CHOC_ICE_CREAM = ITEMS.register("chocicecream",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CHOC_ICE_CREAM)));

    public static final RegistryObject<Item> MILKSHAKE = ITEMS.register("milkshake",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MILKSHAKE)));

    public static final RegistryObject<Item> CHOC_MILKSHAKE = ITEMS.register("chocmilkshake",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CHOC_MILKSHAKE)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
