package me.sshcrack.frostedfriends.block.snow;

import me.sshcrack.frostedfriends.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.util.shape.VoxelShapes;
import org.jetbrains.annotations.Nullable;

public class PileOfSnowBlock extends SnowPileable {
    public PileOfSnowBlock() {
        super(VoxelShapes.cuboid(4.0, 0.0, 4.0, 12.0, 8.0, 12.0));
    }

    @Override
    public @Nullable BlockState getHigherVariant() {
        return ModBlocks.HEAP_OF_SNOW.getDefaultState();
    }
}
