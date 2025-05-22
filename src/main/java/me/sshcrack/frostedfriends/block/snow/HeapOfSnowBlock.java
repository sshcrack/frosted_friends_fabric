package me.sshcrack.frostedfriends.block.snow;

import com.mojang.serialization.MapCodec;
import me.sshcrack.frostedfriends.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.util.shape.VoxelShape;

public class HeapOfSnowBlock extends SnowPileable {
    public static final MapCodec<HeapOfSnowBlock> CODEC = Block.createCodec(HeapOfSnowBlock::new);
    public static final VoxelShape SHAPE = createCuboidShape(3.0, 0.0, 3.0, 13.0, 10.0, 13.0);

    public HeapOfSnowBlock(Settings settings) {
        super(settings, SHAPE);
    }

    public HeapOfSnowBlock() {
        super(SHAPE);
    }

    @Override
    public BlockState getHigherVariant() {
        return ModBlocks.MOUND_OF_SNOW.getDefaultState();
    }

    @Override
    protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
        return CODEC;
    }
}
