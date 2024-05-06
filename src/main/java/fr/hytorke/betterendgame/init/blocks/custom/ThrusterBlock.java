package fr.hytorke.betterendgame.init.blocks.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ThrusterBlock extends Block {
    public ThrusterBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if (entity instanceof PlayerEntity player && !world.isClient) {
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 2, 15, true, false));
        }
        super.onSteppedOn(world, pos, state, entity);
    }
}
