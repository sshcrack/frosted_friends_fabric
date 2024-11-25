package me.sshcrack.frostedfriends.item.armor;

import me.sshcrack.frostedfriends.ModArmorMaterials;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.registry.entry.RegistryEntry;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimatableManager;
import software.bernie.geckolib.util.GeckoLibUtil;

public abstract class GeneralHelmetItem extends ArmorItem implements GeoItem {
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

    public GeneralHelmetItem(RegistryEntry<ArmorMaterial> material) {
        super(material, Type.HELMET, new Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(ModArmorMaterials.ARMOR_DURABILITY_MULTIPLIER)));
    }


    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {

    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }
}
