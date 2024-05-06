package fr.hytorke.betterendgame.init.amors;

import fr.hytorke.betterendgame.BetterEndGame;
import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {

    SHROOM_HEADLAMP(
            "shroom_headlamp",
            33,
            new int[] {0, 0, 0, 0},
            0,
            SoundEvents.ITEM_ARMOR_EQUIP_CHAIN,
            0F,
            0F,
            () -> Ingredient.ofItems(Items.GOLD_INGOT)
    ),

    SHROOM_NETHERITE(
            "shroom_netherite",
            37,
            new int[] {3, 6, 8, 3},
            15,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            3.0F,
            0.1F,
            () -> Ingredient.ofItems(Items.NETHERITE_INGOT)
    ),

    NIGHT_VISION_GOGGLES(
            "nightv_goggles",
            33,
            new int[] {0, 0, 0, 0},
            0,
            SoundEvents.ITEM_ARMOR_EQUIP_CHAIN,
            0F,
            0F,
            () -> Ingredient.ofItems(Items.DIAMOND)
    ),

    NIGHT_VISION_GOGGLES_NETHERITE(
            "nightv_netherite",
            37,
            new int[] {3, 6, 8, 3},
            15,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            3.0F,
            0.1F,
            () -> Ingredient.ofItems(Items.NETHERITE_INGOT)
    ),

    JUKEBOX_NETHERITE(
            "jukebox_netherite",
            37,
            new int[] {3, 6, 8, 3},
            15,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            3.0F,
            0.1F,
            () -> Ingredient.ofItems(Items.NETHERITE_INGOT)
    ),

    SLIMY_NETHERITE(
            "slimy_netherite",
            37,
            new int[] {3, 6, 8, 3},
            15,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            3.0F,
            0.1F,
            () -> Ingredient.ofItems(Items.NETHERITE_INGOT)
    ),

    SWIFTNESS_NETHERITE(
            "swiftness_netherite",
            37,
            new int[] {3, 6, 8, 3},
            15,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            3.0F,
            0.1F,
            () -> Ingredient.ofItems(Items.NETHERITE_INGOT)
    );

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent sound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }


    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.ordinal()] * durabilityMultiplier;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return protectionAmounts[type.ordinal()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.sound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return BetterEndGame.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}