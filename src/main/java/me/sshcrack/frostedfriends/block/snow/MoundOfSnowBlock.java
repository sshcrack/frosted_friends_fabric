package me.sshcrack.frostedfriends.block.snow;

import net.minecraft.block.BlockState;
import net.minecraft.util.shape.VoxelShapes;
import org.jetbrains.annotations.Nullable;

public class MoundOfSnowBlock extends SnowPileable {
    public MoundOfSnowBlock() {
        super(VoxelShapes.cuboid(2.0, 0.0, 2.0, 14.0, 12.0, 14.0));
    }

    @Override
    public @Nullable BlockState getHigherVariant() {
        return null;
    }
}
