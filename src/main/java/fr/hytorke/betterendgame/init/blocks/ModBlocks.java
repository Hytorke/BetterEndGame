package fr.hytorke.betterendgame.init.blocks;

import fr.hytorke.betterendgame.BetterEndGame;
import fr.hytorke.betterendgame.init.blocks.custom.CompactedThrusterBlock;
import fr.hytorke.betterendgame.init.blocks.custom.ThrusterBlock;
import fr.hytorke.betterendgame.init.items.ModItems;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    //Blocks :
    public static final Block ASH_BLOCK = createBlockRegister("ash_block", new Block(FabricBlockSettings
            .copyOf(Blocks.GRAVEL)
            .strength(0.3F)));

    public static final Block MAGNETIC_IRON_BLOCK = createBlockRegister("magnetic_iron_block", new Block(FabricBlockSettings
            .copyOf(Blocks.IRON_BLOCK)
            .strength(1F)
            .requiresTool()));

    public static final Block THRUSTER_BLOCK = createBlockRegister("thruster_block", new ThrusterBlock(FabricBlockSettings
            .copyOf(Blocks.SLIME_BLOCK)
            .strength(0.2F)
            .nonOpaque()));

    public static final Block COMPACTED_THRUSTER_BLOCK = createBlockRegister("compacted_thruster_block", new CompactedThrusterBlock(FabricBlockSettings
            .copyOf(Blocks.SLIME_BLOCK)
            .strength(0.2F)
            .nonOpaque()));

    //Blocks Item :
    public static final Item ASH_BLOCK_ITEM = ModItems.createItemRegister("ash_block", new BlockItem(ModBlocks.ASH_BLOCK, new FabricItemSettings()));
    public static final Item MAGNETIC_IRON_BLOCK_ITEM = ModItems.createItemRegister("magnetic_iron_block", new BlockItem(ModBlocks.MAGNETIC_IRON_BLOCK, new FabricItemSettings()));
    public static final Item THRUSTER_BLOCK_ITEM = ModItems.createItemRegister("thruster_block", new BlockItem(ModBlocks.THRUSTER_BLOCK, new FabricItemSettings()));
    public static final Item COMPACTED_THRUSTER_BLOCK_ITEM = ModItems.createItemRegister("compacted_thruster_block", new BlockItem(ModBlocks.COMPACTED_THRUSTER_BLOCK, new FabricItemSettings()));

    public static Block createBlockRegister(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(BetterEndGame.MOD_ID, name), block);
    }

    public static void registerModBlocks() {
        BetterEndGame.LOGGER.info("Registering Mod Blocks.");
    }
}
