package me.sshcrack.frostedfriends.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class SnowInABottleItem extends Item {
    public SnowInABottleItem() {
        super(new Settings()
                .maxCount(1));
    }

    @Override
    public boolean hasRecipeRemainder() {
        return true;
    }

    @Override
    public ItemStack getRecipeRemainder(ItemStack stack) {
        return new ItemStack(Items.GLASS_BOTTLE);
    }
}
