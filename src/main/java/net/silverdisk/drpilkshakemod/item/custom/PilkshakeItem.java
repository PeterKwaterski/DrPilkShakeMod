package net.silverdisk.drpilkshakemod.item.custom;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import net.silverdisk.drpilkshakemod.item.ModItems;

public class PilkshakeItem extends Item{

    public PilkshakeItem(Item.Properties pProperties) {
        super(pProperties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pEntityLiving){
        if (pEntityLiving instanceof ServerPlayer serverplayer) {
            CriteriaTriggers.CONSUME_ITEM.trigger(serverplayer, pStack);
            serverplayer.awardStat(Stats.ITEM_USED.get(this));
        }

        if (!pLevel.isClientSide && pEntityLiving instanceof Player player) {
            player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, Integer.MAX_VALUE, 2));
            player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, Integer.MAX_VALUE, 0));
            player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 100, 1));
            player.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 100, 1));
            player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 100, 1));
            player.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 36000, 4));
            player.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 36000, 1));
            player.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 36000, 1));
            player.addEffect(new MobEffectInstance(MobEffects.CONDUIT_POWER, Integer.MAX_VALUE, 1));
            player.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 36000, 1));
            player.addEffect(new MobEffectInstance(MobEffects.BAD_OMEN, 100, 1));
            player.addEffect(new MobEffectInstance(MobEffects.GLOWING, 36000, 1));
            player.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 100, 1));
            player.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 100, 1));
            player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, Integer.MAX_VALUE, 1));
            player.addEffect(new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 100, 1));
            player.addEffect(new MobEffectInstance(MobEffects.HUNGER, 36000, 1));
            player.addEffect(new MobEffectInstance(MobEffects.INFESTED, 36000, 1));
            player.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, Integer.MAX_VALUE, 1));
            player.addEffect(new MobEffectInstance(MobEffects.JUMP, 100, 1));
            player.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 1000, 1));
            player.addEffect(new MobEffectInstance(MobEffects.LUCK, Integer.MAX_VALUE, 4));
            player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 36000, 4));
            player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, Integer.MAX_VALUE, 0));
            player.addEffect(new MobEffectInstance(MobEffects.OOZING, 100, 1));
            player.addEffect(new MobEffectInstance(MobEffects.POISON, 100, 1));
            player.addEffect(new MobEffectInstance(MobEffects.RAID_OMEN, 100, 1));
            player.addEffect(new MobEffectInstance(MobEffects.SATURATION, 100, 1));
            player.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 100, 1));
            player.addEffect(new MobEffectInstance(MobEffects.TRIAL_OMEN, 100, 1));
            player.addEffect(new MobEffectInstance(MobEffects.UNLUCK, 36000, 1));
            player.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, Integer.MAX_VALUE, 0));
            player.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 36000, 1));
            player.addEffect(new MobEffectInstance(MobEffects.WEAVING, 36000, 1));
            player.addEffect(new MobEffectInstance(MobEffects.WIND_CHARGED, 100, 1));
            player.addEffect(new MobEffectInstance(MobEffects.WITHER, 36000, 2));
        }

        if (pEntityLiving instanceof Player player) {
            return ItemUtils.createFilledResult(pStack, player, new ItemStack(ModItems.CAN.get()), false);
        } else {
            pStack.consume(1, pEntityLiving);
            return pStack;
        }
    }

    @Override
    public int getUseDuration(ItemStack pStack, LivingEntity pEntity) {
        return 32;
    }

    @Override
    public UseAnim getUseAnimation(ItemStack pStack) {
        return UseAnim.DRINK;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pHand) {
        return ItemUtils.startUsingInstantly(pLevel, pPlayer, pHand);
    }
}
