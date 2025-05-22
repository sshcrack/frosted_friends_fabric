package me.sshcrack.frostedfriends.block.snow;

import com.mojang.serialization.MapCodec;
import me.sshcrack.frostedfriends.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.util.shape.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class PileOfSnowBlock extends SnowPileable {
    public static final MapCodec<PileOfSnowBlock> CODEC = Block.createCodec(PileOfSnowBlock::new);
    public static final VoxelShape SHAPE = createCuboidShape(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);

    public PileOfSnowBlock(Settings settings) {
        super(settings, SHAPE);
    }

    public PileOfSnowBlock() {
        super(SHAPE);
    }

    @Override
    protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
        return CODEC;
    }

    @Override
    public @Nullable BlockState getHigherVariant() {
        return ModBlocks.HEAP_OF_SNOW.getDefaultState();
    }
}
