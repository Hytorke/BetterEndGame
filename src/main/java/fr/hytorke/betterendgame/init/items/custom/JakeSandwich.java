package fr.hytorke.betterendgame.init.items.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;

public class JakeSandwich extends Item {
    public JakeSandwich(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("item.betterendgame.jake_sandwich.tooltip.0"));
        tooltip.add(Text.translatable("item.betterendgame.jake_sandwich.tooltip.1"));
        tooltip.add(Text.translatable("item.betterendgame.jake_sandwich.tooltip.2"));
    }
}