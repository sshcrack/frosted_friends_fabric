package me.sshcrack.frostedfriends.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(BlockItem.class)
public interface BlockItemMixin {
	@Invoker("copyComponentsToBlockEntity")
    static void frosted_friends$copyComponentsToBlockEntity(World world, BlockPos pos, ItemStack stack) {
		throw new AssertionError("Mixin failed to apply");
	}

	@Invoker("placeFromNbt")
	BlockState frosted_friends$placeFromNbt(BlockPos pos, World world, ItemStack stack, BlockState state);
}