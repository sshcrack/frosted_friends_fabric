package me.sshcrack.frostedfriends.item.armor;

import me.sshcrack.frostedfriends.ModArmorMaterials;
import org.apache.commons.lang3.mutable.MutableObject;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.client.DeferredGeoRenderProvider;
import software.bernie.geckolib.animatable.client.GeoRenderProvider;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimatableManager;
import software.bernie.geckolib.util.GeckoLibUtil;

import java.util.function.Consumer;

public class TopHatItem extends GeneralHelmetItem implements GeoItem {
    public static MutableObject<GeoRenderProvider> renderProvider = new MutableObject<>(null);

    public TopHatItem() {
        super(ModArmorMaterials.TOP_HELMET);
    }

    @Override
    public void createGeoRenderer(Consumer<GeoRenderProvider> consumer) {
        consumer.accept((DeferredGeoRenderProvider) () -> renderProvider);
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {

    }
}
