package me.sshcrack.frostedfriends;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;

public class ModTabs {
    public static final RegistryKey<ItemGroup> FROSTED_FRIENDS_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), FrostedFriends.ref("frosted_friends"));
    public static final ItemGroup FROSTED_FRIENDS_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(/*ModBlocks.SNOW_HEAD_BASIC_1*/Blocks.SNOW))
            .displayName(Text.translatable("item_group.frosted_friends.frosted_friends_tab"))
            .build();

    public static void initialize() {
        Registry.register(Registries.ITEM_GROUP, FROSTED_FRIENDS_KEY, FROSTED_FRIENDS_GROUP);
        ItemGroupEvents.modifyEntriesEvent(FROSTED_FRIENDS_KEY).register(itemGroup -> {
            itemGroup.add(ModBlocks.FRIDGE);
            itemGroup.add(ModItems.PACKED_ICE_CUBES);
            itemGroup.add(ModItems.STEAM_BOTTLE);
            itemGroup.add(ModItems.SNOW_IN_A_BOTTLE);
            itemGroup.add(ModBlocks.PILE_OF_SNOW);
            itemGroup.add(ModBlocks.HEAP_OF_SNOW);
            itemGroup.add(ModBlocks.MOUND_OF_SNOW);
            itemGroup.add(ModItems.CHRISTMAS_HELMET);
            itemGroup.add(ModItems.TOP_HELMET);
            itemGroup.add(ModItems.WOODEN_SNOW_SHOVEL);
            itemGroup.add(ModItems.STONE_SNOW_SHOVEL);
            itemGroup.add(ModItems.IRON_SNOW_SHOVEL);
            itemGroup.add(ModItems.GOLDEN_SNOW_SHOVEL);
            itemGroup.add(ModItems.DIAMOND_SNOW_SHOVEL);
            itemGroup.add(ModItems.NETHERITE_SNOW_SHOVEL);
            itemGroup.add(ModItems.ICE_BUCKET);
            itemGroup.add(ModBlocks.FROSTED_COD);
            itemGroup.add(ModBlocks.FROSTED_PUFFERFISH);
            itemGroup.add(ModBlocks.FROSTED_SALMON);
            // itemGroup.add(ModBlocks.SNOW_CHEST_1);
            // itemGroup.add(ModBlocks.SNOW_HEAD_BASIC_1);
            // itemGroup.add(ModBlocks.SNOW_HEAD_CLASSIC_1);
            // itemGroup.add(ModBlocks.SNOW_HEAD_GOLEM);
            // itemGroup.add(ModBlocks.SNOW_HEAD_CHRISTMAS);
            // itemGroup.add(ModBlocks.SNOW_HEAD_TOP_HAT_DOWN);
            itemGroup.add(ModItems.ICE_CUBES);

        });
    }
}
