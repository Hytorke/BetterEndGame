package fr.hytorke.betterendgame.init.amors.custom;

import fr.hytorke.betterendgame.init.amors.ModArmorMaterials;
import fr.hytorke.betterendgame.init.amors.ModArmors;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class NightVGoggles extends ArmorItem {
    public NightVGoggles(ModArmorMaterials modArmorMaterials, ArmorItem.Type type, Item.Settings settings) {
        super(modArmorMaterials, type, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (world.isClient || !(entity instanceof PlayerEntity player)) return;

        if (player.getEquippedStack(EquipmentSlot.HEAD).getItem() == ModArmors.NIGHTV_GOGGLES || player.getEquippedStack(EquipmentSlot.HEAD).getItem() == ModArmors.NIGHTV_NETHERITE_HELMET) {
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 240, 0, true, false));
        }

        super.inventoryTick(stack, world, entity, slot, selected);
    }
}
