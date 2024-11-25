package me.sshcrack.frostedfriends.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;

public class IceCubesItem extends Item {
    public static FoodComponent FOOD_COMPONENT = new FoodComponent.Builder()
            .nutrition(0)
            .saturationModifier(-0.1F)
            .alwaysEdible()
            .snack()
            .build();

    public IceCubesItem() {
        super((new Settings())
                .food(FOOD_COMPONENT));
    }
}
