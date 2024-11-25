package me.sshcrack.frostedfriends.item;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;

public class SnowShovelItem extends ShovelItem {
    public SnowShovelItem(ToolMaterials toolMaterial) {
        super(toolMaterial, new Settings());
    }

    @Override
    public float getMiningSpeed(ItemStack stack, BlockState state) {
        var original = super.getMiningSpeed(stack, state);
        if (!state.isOf(Blocks.SNOW)) {
            return original * 0.75f;
        }

        return original;
    }

    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        boolean returnVal = super.postMine(stack, world, state, pos, miner);

        var directions = new Vec3i[]{
                new Vec3i(1, 0, 0),
                new Vec3i(-1, 0, 0),
                new Vec3i(0, 0, 1),
                new Vec3i(0, 0, -1),

                new Vec3i(1, 0, 1),
                new Vec3i(1, 0, -1),

                new Vec3i(-1, 0, -1),
                new Vec3i(-1, 0, 1),
        };

        for (Vec3i direction : directions) {
            BlockPos newPos = pos.add(direction);
            BlockState newState = world.getBlockState(newPos);
            if (newState.isOf(Blocks.SNOW)) {
                world.breakBlock(newPos, true);
            }
        }

        return returnVal;
    }
}
