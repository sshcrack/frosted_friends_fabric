package me.sshcrack.frostedfriends.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class FridgeBlock extends Block {
    public static final VoxelShape SHAPE = VoxelShapes.cuboid(3.0, 0.0, 3.0, 13.0, 26.0, 13.0);

    public FridgeBlock() {
        super(Settings.create()
                .sounds(BlockSoundGroup.STONE)
                .strength(2.0f, 60.0f)
                .luminance(state -> 1)
                .nonOpaque()
                .pistonBehavior(PistonBehavior.BLOCK)
        );
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
