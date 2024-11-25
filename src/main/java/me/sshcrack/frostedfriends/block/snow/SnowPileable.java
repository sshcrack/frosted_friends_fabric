package me.sshcrack.frostedfriends.block.snow;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public abstract class SnowPileable extends Block {
    public final VoxelShape SHAPE;

    public SnowPileable(VoxelShape SHAPE) {
        super(Blocks.SNOW_BLOCK.getSettings());
        this.SHAPE = SHAPE;
    }

    @Nullable
    public abstract BlockState getHigherVariant();

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        world.setBlockState(pos, getHigherVariant());
        return super.onUse(state, world, pos, player, hit);
    }
}
