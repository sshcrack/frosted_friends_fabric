package me.sshcrack.frostedfriends;

import me.sshcrack.frostedfriends.item.*;
import me.sshcrack.frostedfriends.item.armor.ChristmasHatItem;
import me.sshcrack.frostedfriends.item.armor.GeneralHelmetItem;
import me.sshcrack.frostedfriends.item.armor.TopHatItem;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModItems {
    public static void initialize() {

    }

    public static Item reg(String id, Item item) {
        return Registry.register(Registries.ITEM, FrostedFriends.ref(id), item);
    }

    public static final Item ICE_BUCKET = Registry.register(Registries.ITEM, FrostedFriends.ref("ice_bucket"), new IceBucketItem(Blocks.ICE));

    public static final Item PACKED_ICE_CUBES = reg("packed_ice_cubes", new Item(new Item.Settings()));
    public static final Item STEAM_BOTTLE = reg("steam_bottle", new Item(new Item.Settings()));
    public static final Item SNOW_IN_A_BOTTLE = reg("snow_in_a_bottle", new SnowInABottleItem());
    public static final Item CHRISTMAS_HELMET = reg("christmas_helmet", new ChristmasHatItem());
    public static final Item TOP_HELMET = reg("top_helmet", new TopHatItem());
    public static final Item WOODEN_SNOW_SHOVEL = reg("wooden_snow_shovel", new SnowShovelItem(ToolMaterials.WOOD));
    public static final Item STONE_SNOW_SHOVEL = reg("stone_snow_shovel", new SnowShovelItem(ToolMaterials.STONE));
    public static final Item IRON_SNOW_SHOVEL = reg("iron_snow_shovel", new SnowShovelItem(ToolMaterials.IRON));
    public static final Item GOLDEN_SNOW_SHOVEL = reg("golden_snow_shovel", new SnowShovelItem(ToolMaterials.GOLD));
    public static final Item DIAMOND_SNOW_SHOVEL = reg("diamond_snow_shovel", new SnowShovelItem(ToolMaterials.DIAMOND));
    public static final Item NETHERITE_SNOW_SHOVEL = reg("netherite_snow_shovel", new SnowShovelItem(ToolMaterials.NETHERITE));

    // public static final Item SNOW_HEAD_BASIC_HELMET = reg("snow_head_basic_helmet", new GeneralHelmetItem(ModArmorMaterials.SNOW));
    // public static final Item SNOW_HEAD_CLASSIC_HELMET = reg("snow_head_classic_helmet", new GeneralHelmetItem(ModArmorMaterials.SNOW));

    // public static final Item SNOW_HEAD_GOLEM_1_HELMET = reg("snow_head_golem_1_helmet", new GeneralHelmetItem(ModArmorMaterials.SNOW));
    // public static final Item SNOW_HEAD_CHRISTMAS_1_HELMET = reg("snow_head_christmas_1_helmet", new GeneralHelmetItem(ModArmorMaterials.SNOW));
    // public static final Item SNOW_HEAD_TOP_HAT_1_HELMET = reg("snow_head_top_hat_1_helmet", new GeneralHelmetItem(ModArmorMaterials.SNOW));

    public static final Item SNOW_BODY_WITHOUT_ARM_CHESTPLATE = reg("snow_body_without_arm_chestplate", new GeneralChestplateItem(ModArmorMaterials.SNOW));
    public static final Item SNOW_BODY_CHESTPLATE = reg("snow_body_chestplate", new GeneralChestplateItem(ModArmorMaterials.SNOW));
    public static final Item ICE_CUBES = reg("ice_cubes", new IceCubesItem());


}
