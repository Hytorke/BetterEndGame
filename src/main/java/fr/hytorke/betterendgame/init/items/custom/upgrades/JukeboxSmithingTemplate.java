package fr.hytorke.betterendgame.init.items.custom.upgrades;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenTexts;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class JukeboxSmithingTemplate extends Item {
    public JukeboxSmithingTemplate(Settings settings) {
        super(settings);
    }

    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("item.betterendgame.jukebox_smithing_template_template.tooltip.titleText").formatted(Formatting.GRAY));
        tooltip.add(ScreenTexts.EMPTY);
        tooltip.add(Text.translatable("items.betterendgame.applies_to_text.tooltip").formatted(Formatting.GRAY));
        tooltip.add(ScreenTexts.space().append(Text.translatable("item.betterendgame.jukebox_smithing_template_template.tooltip.applies_to").formatted(Formatting.BLUE)));
        tooltip.add(Text.translatable("items.betterendgame.ingredients_text.tooltip").formatted(Formatting.GRAY));
        tooltip.add(ScreenTexts.space().append(Text.translatable("item.betterendgame.jukebox_smithing_template_template.tooltip.ingredient").formatted(Formatting.BLUE)));
    }
}

