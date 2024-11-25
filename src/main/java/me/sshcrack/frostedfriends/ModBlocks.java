package me.sshcrack.frostedfriends;

import me.sshcrack.frostedfriends.block.FridgeBlock;
import me.sshcrack.frostedfriends.block.FrozenFishBlock;
import me.sshcrack.frostedfriends.block.snow.HeapOfSnowBlock;
import me.sshcrack.frostedfriends.block.snow.MoundOfSnowBlock;
import me.sshcrack.frostedfriends.block.snow.PileOfSnowBlock;
import me.sshcrack.frostedfriends.block.snowman.SnowHeadTopHat;
import me.sshcrack.frostedfriends.item.IceBucketItem;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModBlocks {
    public static <T extends Block> T reg(String id, T block, boolean registerItem) {
        T regB = Registry.register(Registries.BLOCK, FrostedFriends.ref(id), block);
        if (registerItem) {
            Registry.register(Registries.ITEM, FrostedFriends.ref(id), new BlockItem(regB, new Item.Settings()));
        }

        return regB;
    }

    public static <T extends Block> T regIceBucket(String id, T block) {
        T regB = reg(id, block, false);

        Registry.register(Registries.ITEM, FrostedFriends.ref(id), new IceBucketItem(regB));
        return regB;
    }

    public static final Block FRIDGE = reg("fridge", new FridgeBlock(), true);

    public static final Block FROSTED_COD = regIceBucket("frosted_cod", new FrozenFishBlock(Items.COD.getDefaultStack()));
    public static final Block FROSTED_PUFFERFISH = regIceBucket("frosted_pufferfish", new FrozenFishBlock(Items.PUFFERFISH.getDefaultStack()));
    public static final Block FROSTED_SALMON = regIceBucket("frosted_salmon", new FrozenFishBlock(Items.SALMON.getDefaultStack()));

    public static final PileOfSnowBlock PILE_OF_SNOW = reg("pile_of_snow", new PileOfSnowBlock(), true);
    public static final HeapOfSnowBlock HEAP_OF_SNOW = reg("heap_of_snow", new HeapOfSnowBlock(), true);
    public static final MoundOfSnowBlock MOUND_OF_SNOW = reg("mound_of_snow", new MoundOfSnowBlock(), true);


    // public static final Block SNOW_HEAD_CLASSIC_1 = reg("snow_head_classic_1", new SnowHeadClassic1Block());
    // public static final Block SNOW_HEAD_GOLEM = reg("snow_head_golem", new SnowHeadGolemBlock());
    // public static final Block SNOW_HEAD_CHRISTMAS = reg("snow_head_christmas", new SnowHeadChristmasBlock());

    // public static final Block SNOW_CHEST_1 = reg("snow_chest_1", new SnowChest1Block());
    // public static final Block SNOW_CHEST_2 = reg("snow_chest_2", new SnowChest2Block());

    // public static final Block SNOW_HEAD_MID = reg("snow_head_1", new SnowHead1Block());
    // public static final Block SNOW_HEAD_TOP = reg("snow_head_2", new SnowHead2Block());

    // public static final Block SNOW_HEAD_BASIC_1 = reg("snow_head_basic_1", new SnowHeadBasic1Block());
    // public static final Block SNOW_HEAD_BASIC_2 = reg("snow_head_basic_2", new SnowHeadBasic2Block());
    // public static final Block SNOW_HEAD_BASIC_3 = reg("snow_head_basic_3", new SnowHeadBasic3Block());

    // public static final Block SNOW_HEAD_CLASSIC_2 = reg("snow_head_classic_2", new SnowHeadClassic2Block());
    // public static final Block SNOW_HEAD_CLASSIC_3 = reg("snow_head_classic_3", new SnowHeadClassic3Block());

    // public static final Block SNOW_HEAD_GOLEM_2 = reg("snow_head_golem_2", new SnowHeadGolem2Block());
    // public static final Block SNOW_HEAD_GOLEM_3 = reg("snow_head_golem_3", new SnowHeadGolem3Block());

    // public static final Block SNOW_HEAD_CHRISTMAS_2 = reg("snow_head_christmas_2", new SnowHeadChristmas2Block());
    // public static final Block SNOW_HEAD_CHRISTMAS_3 = reg("snow_head_christmas_3", new SnowHeadChristmas3Block());

    // public static final Block SNOW_HEAD_TOP_HAT_DOWN = reg("snow_head_top_hat", new SnowHeadTopHat());


    // public static final Block SNOW_BASE = reg("snow_base", new SnowBaseBlock()); // snow_base
    // public static final Block SNOW_BASE_BUTTONS = reg("snow_base_buttons", new SnowBase1Block()); // snow_base_1
    // public static final Block SNOW_BASE_BUTTONS_STICKS = reg("snow_base_buttons_sticks", new SnowBase2Block()); // snow_base_2

    public static void initialize() {

    }
}
