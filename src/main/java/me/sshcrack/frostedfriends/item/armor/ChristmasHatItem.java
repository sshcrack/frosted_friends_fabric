package me.sshcrack.frostedfriends.item.armor;

import me.sshcrack.frostedfriends.ModArmorMaterials;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.decoration.ArmorStandEntity;
import org.apache.commons.lang3.mutable.MutableObject;
import software.bernie.geckolib.animatable.client.DeferredGeoRenderProvider;
import software.bernie.geckolib.animatable.client.GeoRenderProvider;
import software.bernie.geckolib.animation.AnimatableManager;
import software.bernie.geckolib.animation.AnimationController;
import software.bernie.geckolib.animation.PlayState;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.constant.DefaultAnimations;

import java.util.function.Consumer;

public class ChristmasHatItem extends GeneralHelmetItem {
    public static MutableObject<GeoRenderProvider> renderProvider = new MutableObject<>(null);

    @Override
    public void createGeoRenderer(Consumer<GeoRenderProvider> consumer) {
        consumer.accept((DeferredGeoRenderProvider) () -> renderProvider);
    }

    public ChristmasHatItem() {
        super(ModArmorMaterials.CHRISTMAS_HAT);
    }


    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>(this, 20, state -> {
            // Apply our generic idle animation.
            // Whether it plays or not is decided down below.
            state.setAnimation(DefaultAnimations.WALK);

            // Let's gather some data from the state to use below
            // This is the entity that is currently wearing/holding the item
            Entity entity = state.getData(DataTickets.ENTITY);

            // We'll just have ArmorStands always animate, so we can return here
            if (entity instanceof ArmorStandEntity || !(entity instanceof LivingEntity owner))
                return PlayState.CONTINUE;


            // Play the animation if the full set is being worn, otherwise stop
            return owner.isSprinting() ? PlayState.CONTINUE : PlayState.STOP;
        }));
    }
}
