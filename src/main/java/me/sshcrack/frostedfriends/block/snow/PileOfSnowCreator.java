package me.sshcrack.frostedfriends.block.snow;

import me.sshcrack.frostedfriends.ModBlocks;
import me.sshcrack.frostedfriends.ModItems;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

public class PileOfSnowCreator implements UseBlockCallback {
    @Override
    public ActionResult interact(PlayerEntity player, World world, Hand hand, BlockHitResult result) {
        if (player.isSpectator())
            return ActionResult.PASS;
        if (player.getActiveHand() != hand || !player.isSneaking())
            return ActionResult.PASS;


        BlockPos pos = result.getBlockPos();
        BlockState state = world.getBlockState(pos);
        if(!state.isOf(Blocks.SNOW))
            return ActionResult.PASS;

        if (!world.canPlayerModifyAt(player, pos) || !world.canPlace(state, pos, ShapeContext.absent()))
            return ActionResult.PASS;

        world.emitGameEvent(null, GameEvent.BLOCK_DESTROY, pos);
        world.setBlockState(pos, ModBlocks.PILE_OF_SNOW.getDefaultState());
        return ActionResult.success(world.isClient);
    }
}
