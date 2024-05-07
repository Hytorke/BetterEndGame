package fr.hytorke.betterendgame.init;

import fr.hytorke.betterendgame.BetterEndGame;
import fr.hytorke.betterendgame.init.amors.ModArmors;
import fr.hytorke.betterendgame.init.blocks.ModBlocks;
import fr.hytorke.betterendgame.init.items.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup BETTERENDGAME_ARMOR_GROUP = createItemGroupRegister("armors", FabricItemGroup.builder()
            .displayName(Text.translatable("itemGroup.betterendgame.armors"))
            .icon(() -> new ItemStack(ModArmors.SHROOM_NETHERITE_HELMET))
            .entries((context, entries) -> {
                entries.add(ModArmors.SHROOM_HEADLAMP);
                entries.add(ModArmors.SHROOM_NETHERITE_HELMET);
                entries.add(ModArmors.JUKEBOX_NETHERITE_HELMET);
                entries.add(ModArmors.SLIMY_NETHERITE_BOOTS);
                entries.add(ModArmors.NIGHTV_GOGGLES);
                entries.add(ModArmors.NIGHTV_NETHERITE_HELMET);
            })
            .build());

    public static final ItemGroup BETTERENDGAME_BLOCK_GROUP = createItemGroupRegister("blocks", FabricItemGroup.builder()
            .displayName(Text.translatable("itemGroup.betterendgame.blocks"))
            .icon(() -> new ItemStack(ModBlocks.ASH_BLOCK_ITEM))
            .entries((context, entries) -> {
                entries.add(ModBlocks.ASH_BLOCK_ITEM);
                entries.add(ModBlocks.MAGNETIC_IRON_BLOCK_ITEM);
                entries.add(ModBlocks.THRUSTER_BLOCK_ITEM);
                entries.add(ModBlocks.COMPACTED_THRUSTER_BLOCK_ITEM);
                entries.add(ModBlocks.REALLY_COMPACTED_THRUSTER_BLOCK_ITEM);
            })
            .build());

    public static final ItemGroup BETTERENDGAME_ITEMS_GROUP = createItemGroupRegister("items", FabricItemGroup.builder()
            .displayName(Text.translatable("itemGroup.betterendgame.items"))
            .icon(() -> new ItemStack(ModItems.ASH_DUST))
            .entries((context, entries) -> {
                entries.add(ModItems.METAL_DETECTOR);
                entries.add(ModItems.ASH_DUST);
                entries.add(ModItems.SLIMY_RABBIT_FOOT);
                entries.add(ModItems.RECORD_PLAYER);
                entries.add(ModItems.GLOW_SMITHING_TEMPLATE);
                entries.add(ModItems.NIGHTV_SMITHING_TEMPLATE);
                entries.add(ModItems.JUKEBOX_SMITHING_TEMPLATE);
                entries.add(ModItems.PADLOCK_CHEST_UPGRADE);
                entries.add(ModItems.COPPER_CHEST_UPGRADE);
                entries.add(ModItems.IRON_CHEST_UPGRADE);
                entries.add(ModItems.GOLD_CHEST_UPGRADE);
                entries.add(ModItems.DIAMOND_CHEST_UPGRADE);
                entries.add(ModItems.EMERALD_CHEST_UPGRADE);
                entries.add(ModItems.NETHERITE_CHEST_UPGRADE);
                entries.add(ModItems.JAKE_SANDWICH);
            })
            .build());

    public static ItemGroup createItemGroupRegister(String name, ItemGroup itemGroup) {
        return Registry.register(Registries.ITEM_GROUP, new Identifier(BetterEndGame.MOD_ID, name), itemGroup);
    }

    public static void registerItemGroups() {
        BetterEndGame.LOGGER.info("Registering Mod ItemGroup.");
    }
}