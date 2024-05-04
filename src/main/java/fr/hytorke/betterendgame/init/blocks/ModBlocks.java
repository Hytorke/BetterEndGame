package fr.hytorke.betterendgame.init.blocks;

import fr.hytorke.betterendgame.BetterEndGame;
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

    //
    public static final Block ASH_BLOCK = createBlockRegister("ash_block", new Block(FabricBlockSettings
            .copyOf(Blocks.GRAVEL)
            .strength(0.3F)));

    //Blocks Item
    public static final Item ASH_BLOCK_ITEM = ModItems.createItemRegister("ash_block", new BlockItem(ModBlocks.ASH_BLOCK, new FabricItemSettings()));

    public static Block createBlockRegister(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(BetterEndGame.MOD_ID, name), block);
    }

    public static void registerModBlocks() {
        BetterEndGame.LOGGER.info("Registering Mod Blocks.");
    }
}
