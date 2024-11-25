package me.sshcrack.frostedfriends.block.snowman;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;

public abstract class SnowmanPart extends Block {
    public static final EnumProperty<Position> SNOWMAN_POSITION = EnumProperty.of("position", Position.class);


    public SnowmanPart(Settings settings) {
        super(settings);
        setDefaultState(getDefaultState().with(SNOWMAN_POSITION, Position.BOTTOM));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(SNOWMAN_POSITION);
    }
}
