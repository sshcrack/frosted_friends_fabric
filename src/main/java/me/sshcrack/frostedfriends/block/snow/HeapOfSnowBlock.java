package me.sshcrack.frostedfriends.block.snow;

import me.sshcrack.frostedfriends.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class HeapOfSnowBlock extends SnowPileable {
    public HeapOfSnowBlock() {
        super(VoxelShapes.cuboid(3.0, 0.0, 3.0, 13.0, 10.0, 13.0));
    }

    @Override
    public BlockState getHigherVariant() {
        return ModBlocks.MOUND_OF_SNOW.getDefaultState();
    }
}
