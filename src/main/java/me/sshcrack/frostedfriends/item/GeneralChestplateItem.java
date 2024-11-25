package me.sshcrack.frostedfriends.item;

import me.sshcrack.frostedfriends.ModArmorMaterials;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.registry.entry.RegistryEntry;

public class GeneralChestplateItem extends ArmorItem {
    public GeneralChestplateItem(RegistryEntry<ArmorMaterial> material) {
        super(material, Type.CHESTPLATE, new Settings().maxDamage(Type.CHESTPLATE.getMaxDamage(ModArmorMaterials.ARMOR_DURABILITY_MULTIPLIER)));
    }
}
