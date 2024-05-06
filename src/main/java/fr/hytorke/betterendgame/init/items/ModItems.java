package fr.hytorke.betterendgame.init.items;

import fr.hytorke.betterendgame.BetterEndGame;
import fr.hytorke.betterendgame.init.items.custom.item.MetalDetectorItem;
import fr.hytorke.betterendgame.init.items.custom.upgrades.GlowSmithingTemplate;
import fr.hytorke.betterendgame.init.items.custom.JakeSandwich;
import fr.hytorke.betterendgame.init.items.custom.upgrades.NightVSmithingTemplate;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    // Items :
    public static final Item ASH_DUST = createItemRegister("ash_dust", new Item(new FabricItemSettings().fireproof()));
    public static final Item SLIMY_RABBIT_FOOT = createItemRegister("slimy_rabbit_foot", new Item(new FabricItemSettings()));
    public static final Item RECORD_PLAYER = createItemRegister("record_player", new Item(new FabricItemSettings()));
    public static final Item METAL_DETECTOR = createItemRegister("metal_detector", new MetalDetectorItem(new FabricItemSettings()));

    // Upgrades :
    //   Smithing Upgrades :
    public static final Item GLOW_SMITHING_TEMPLATE = createItemRegister("glow_smithing_template", new GlowSmithingTemplate(new FabricItemSettings()));
    public static final Item NIGHTV_SMITHING_TEMPLATE = createItemRegister("nightv_smithing_template", new NightVSmithingTemplate(new FabricItemSettings()));
    public static final Item JUKEBOX_SMITHING_TEMPLATE = createItemRegister("jukebox_smithing_template", new Item(new FabricItemSettings()));
    //   Chest Upgrades :
    public static final Item PADLOCK_CHEST_UPGRADE = createItemRegister("padlock_chest_upgrade", new Item(new FabricItemSettings()));
    public static final Item COPPER_CHEST_UPGRADE = createItemRegister("copper_chest_upgrade", new Item(new FabricItemSettings()));
    public static final Item IRON_CHEST_UPGRADE = createItemRegister("iron_chest_upgrade", new Item(new FabricItemSettings()));
    public static final Item GOLD_CHEST_UPGRADE = createItemRegister("gold_chest_upgrade", new Item(new FabricItemSettings()));
    public static final Item DIAMOND_CHEST_UPGRADE = createItemRegister("diamond_chest_upgrade", new Item(new FabricItemSettings()));
    public static final Item EMERALD_CHEST_UPGRADE = createItemRegister("emerald_chest_upgrade", new Item(new FabricItemSettings()));
    public static final Item NETHERITE_CHEST_UPGRADE = createItemRegister("netherite_chest_upgrade", new Item(new FabricItemSettings().fireproof()));

    // Foods :
    public static final Item JAKE_SANDWICH = createItemRegister("jake_sandwich", new JakeSandwich(new FabricItemSettings()
            .food(new FoodComponent.Builder()
                    .hunger(20)
                    .saturationModifier(20)
                    .alwaysEdible()
                    .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1200, 0),1.0F)
                    .meat()
                    .build())));

    public static Item createItemRegister(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BetterEndGame.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BetterEndGame.LOGGER.info("Registering Mod Items.");
    }
}
