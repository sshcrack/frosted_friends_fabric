package me.sshcrack.frostedfriends.item;

import me.sshcrack.frostedfriends.mixin.BlockItemMixin;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

public class IceBucketItem extends BlockItem {
    public IceBucketItem(Block block) {
        super(block, new Settings()
                .maxCount(1));
    }

    @Override
    public ActionResult place(ItemPlacementContext ctx) {
        if (!this.getBlock().isEnabled(ctx.getWorld().getEnabledFeatures()))
            return ActionResult.FAIL;

        if (!ctx.canPlace())
            return ActionResult.FAIL;

        BlockState placementState = this.getPlacementState(ctx);
        if (placementState == null)
            return ActionResult.FAIL;

        if (!this.place(ctx, placementState))
            return ActionResult.FAIL;


        BlockPos pos = ctx.getBlockPos();
        World world = ctx.getWorld();
        PlayerEntity player = ctx.getPlayer();
        ItemStack currStack = ctx.getStack();
        BlockState currState = world.getBlockState(pos);

        if (currState.isOf(placementState.getBlock())) {
            currState = ((BlockItemMixin) (this)).frosted_friends$placeFromNbt(pos, world, currStack, currState);
            this.postPlacement(pos, world, player, currStack, currState);

            BlockItemMixin.frosted_friends$copyComponentsToBlockEntity(world, pos, currStack);
            currState.getBlock().onPlaced(world, pos, currState, player, currStack);
            if (player instanceof ServerPlayerEntity) {
                Criteria.PLACED_BLOCK.trigger((ServerPlayerEntity) player, pos, currStack);
            }
        }

        BlockSoundGroup soundGroup = currState.getSoundGroup();
        world.playSound(
                player,
                pos,
                this.getPlaceSound(currState),
                SoundCategory.BLOCKS,
                (soundGroup.getVolume() + 1.0F) / 2.0F,
                soundGroup.getPitch() * 0.8F
        );
        world.emitGameEvent(GameEvent.BLOCK_PLACE, pos, GameEvent.Emitter.of(player, currState));

        if (player == null || player.isCreative())
            return ActionResult.success(world.isClient);

        currStack.decrementUnlessCreative(1, player);
        if (currStack.isEmpty()) {
            ItemStack outputStack = new ItemStack(Items.BUCKET);

            if (!player.getInventory().insertStack(outputStack))
                player.dropItem(outputStack, false);
        }

        return ActionResult.success(world.isClient);
    }
}
