package fr.hytorke.betterendgame.init.items.custom.item;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class MetalDetectorItem extends Item {

    private int oreSelectedIndex = 0;

    private static final Block[] ORE_TYPES = {
            Blocks.COAL_ORE, Blocks.COPPER_ORE, Blocks.IRON_ORE,
            Blocks.GOLD_ORE, Blocks.LAPIS_ORE, Blocks.REDSTONE_ORE, Blocks.DIAMOND_ORE,
            Blocks.EMERALD_ORE
    };

    private static final Block[] ORE_TYPES_DEEPSLATE = {
            Blocks.DEEPSLATE_COAL_ORE, Blocks.DEEPSLATE_COPPER_ORE, Blocks.DEEPSLATE_IRON_ORE,
            Blocks.DEEPSLATE_GOLD_ORE, Blocks.DEEPSLATE_LAPIS_ORE, Blocks.DEEPSLATE_REDSTONE_ORE, Blocks.DEEPSLATE_DIAMOND_ORE,
            Blocks.DEEPSLATE_EMERALD_ORE
    };

    public MetalDetectorItem(Settings settings) {
        super(settings);
    }

    private boolean isTheOre(BlockState state) {
        return state.isOf(ORE_TYPES[oreSelectedIndex]) || state.isOf(ORE_TYPES_DEEPSLATE[oreSelectedIndex]);
    }

    private void outputCoordonates(BlockPos blockPos, PlayerEntity player, Block block) {
        player.sendMessage(Text.literal("Found " + block.asItem().getName().getString() + " at " + " X: " + blockPos.getX() + "; Y: " + blockPos.getY() + "; Z: " + blockPos.getZ()));
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (world.isClient) return TypedActionResult.pass(user.getStackInHand(hand));

        if (user.isSneaking()) {
            oreSelectedIndex = (oreSelectedIndex + 1) % ORE_TYPES.length;

            switch (oreSelectedIndex) {
                case 0 ->  user.sendMessage(Text.translatable("item.betterendgame.metaldetector.coal"), true);
                case 1 ->  user.sendMessage(Text.translatable("item.betterendgame.metaldetector.copper"), true);
                case 2 ->  user.sendMessage(Text.translatable("item.betterendgame.metaldetector.iron"), true);
                case 3 ->  user.sendMessage(Text.translatable("item.betterendgame.metaldetector.gold"), true);
                case 4 ->  user.sendMessage(Text.translatable("item.betterendgame.metaldetector.lapis"), true);
                case 5 ->  user.sendMessage(Text.translatable("item.betterendgame.metaldetector.redstone"), true);
                case 6 ->  user.sendMessage(Text.translatable("item.betterendgame.metaldetector.diamond"), true);
                case 7 ->  user.sendMessage(Text.translatable("item.betterendgame.metaldetector.emerald"), true);
                default -> throw new IllegalStateException("Unexpected value: " + oreSelectedIndex);
            }
        }
        return TypedActionResult.success(user.getStackInHand(hand));
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if (context.getWorld().isClient) return ActionResult.FAIL;

        BlockPos position = context.getBlockPos();
        PlayerEntity player = context.getPlayer();
        boolean found = false;

        for (int i = 0; i <= position.getY() + 64; i++) {
            BlockState state = context.getWorld().getBlockState(position.down(i));

            if (isTheOre(state)) {
                assert player != null;
                outputCoordonates(position.down(i), player, state.getBlock());

                found = true;
                break;
            }
        }

        if (!found) {
            assert player != null;
            player.sendMessage(Text.literal("Couldn't find ore under this block"), true);
            return ActionResult.FAIL;
        }

        return super.useOnBlock(context);
    }
}