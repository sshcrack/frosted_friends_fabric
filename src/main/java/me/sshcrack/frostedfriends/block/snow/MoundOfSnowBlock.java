package me.sshcrack.frostedfriends.block.snow;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.util.shape.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class MoundOfSnowBlock extends SnowPileable {
    public static final MapCodec<MoundOfSnowBlock> CODEC = Block.createCodec(MoundOfSnowBlock::new);
    public static final VoxelShape SHAPE = createCuboidShape(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

    public MoundOfSnowBlock(Settings settings) {
        super(settings, SHAPE);
    }

    public MoundOfSnowBlock() {
        super(SHAPE);
    }

    @Override
    protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
        return CODEC;
    }

    @Override
    public @Nullable BlockState getHigherVariant() {
        return null;
    }
}
