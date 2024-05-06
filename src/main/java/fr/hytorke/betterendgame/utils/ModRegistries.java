package fr.hytorke.betterendgame.utils;

import fr.hytorke.betterendgame.init.ModItemGroup;
import fr.hytorke.betterendgame.init.amors.ModArmors;
import fr.hytorke.betterendgame.init.blocks.ModBlocks;
import fr.hytorke.betterendgame.init.items.ModItems;

public class ModRegistries {
    public static void registerMod() {
       ModItems.registerModItems();
       ModItemGroup.registerItemGroups();
       ModBlocks.registerModBlocks();
       ModArmors.registerModArmors();
    }
}
