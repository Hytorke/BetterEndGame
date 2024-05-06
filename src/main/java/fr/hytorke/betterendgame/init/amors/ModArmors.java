package fr.hytorke.betterendgame.init.amors;

import fr.hytorke.betterendgame.BetterEndGame;
import fr.hytorke.betterendgame.init.amors.custom.NighVGoggles;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModArmors {

    public static final Item SHROOM_HEADLAMP = createArmorRegister( "shroom_headlamp", new ArmorItem(
            ModArmorMaterials.SHROOM_HEADLAMP,
            ArmorItem.Type.HELMET,
            new Item.Settings()));

    public static final Item SHROOM_NETHERITE_HELMET = createArmorRegister( "shroom_netherite_helmet", new ArmorItem(
            ModArmorMaterials.SHROOM_NETHERITE,
            ArmorItem.Type.HELMET,
            new Item.Settings().fireproof()));

    public static final Item NIGHTV_GOGGLES = createArmorRegister( "nightv_goggles", new NighVGoggles(
            ModArmorMaterials.NIGHT_VISION_GOGGLES,
            ArmorItem.Type.HELMET,
            new Item.Settings()));

    public static final Item NIGHTV_NETHERITE_HELMET = createArmorRegister( "nightv_netherite_helmet", new ArmorItem(
            ModArmorMaterials.NIGHT_VISION_GOGGLES_NETHERITE,
            ArmorItem.Type.HELMET,
            new Item.Settings()));

    public static final Item JUKEBOX_NETHERITE_HELMET = createArmorRegister( "jukebox_netherite_helmet", new ArmorItem(
            ModArmorMaterials.JUKEBOX_NETHERITE,
            ArmorItem.Type.HELMET,
            new Item.Settings().fireproof()));

    public static final Item SLIMY_NETHERITE_BOOTS = createArmorRegister( "slimy_netherite_boots", new ArmorItem(
            ModArmorMaterials.SLIMY_NETHERITE,
            ArmorItem.Type.BOOTS,
            new Item.Settings().fireproof()));

    public static final Item SWIFTNESS_NETHERITE_BOOTS = createArmorRegister( "swiftness_netherite_boots", new ArmorItem(
            ModArmorMaterials.SWIFTNESS_NETHERITE,
            ArmorItem.Type.BOOTS,
            new Item.Settings().fireproof()));


    public static Item createArmorRegister(String name, ArmorItem armorItem) {
        return Registry.register(Registries.ITEM, new Identifier(BetterEndGame.MOD_ID, name), armorItem);
    }

    public static void registerModArmors() {
        BetterEndGame.LOGGER.info("Registering Mod Armors.");
    }
}
