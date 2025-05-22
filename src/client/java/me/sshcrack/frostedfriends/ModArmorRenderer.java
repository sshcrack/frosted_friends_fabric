package me.sshcrack.frostedfriends;

import me.sshcrack.frostedfriends.armor.ChristmasHatArmorRenderer;
import me.sshcrack.frostedfriends.armor.TopHatArmorRenderer;
import me.sshcrack.frostedfriends.item.armor.ChristmasHatItem;
import me.sshcrack.frostedfriends.item.armor.TopHatItem;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.animatable.client.GeoRenderProvider;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class ModArmorRenderer {
    public static void initialize() {
        ChristmasHatItem.renderProvider.setValue(new GeoRenderProvider() {
            private GeoArmorRenderer<?> renderer;

            @Override
            public <T extends LivingEntity> @NotNull BipedEntityModel<?> getGeoArmorRenderer(@Nullable T livingEntity, ItemStack itemStack, @Nullable EquipmentSlot equipmentSlot, @Nullable BipedEntityModel<T> original) {
                if (this.renderer == null) // Important that we do this. If we just instantiate  it directly in the field it can cause incompatibilities with some mods.
                    this.renderer = new ChristmasHatArmorRenderer();

                return this.renderer;
            }
        });

        TopHatItem.renderProvider.setValue(new GeoRenderProvider() {
            private GeoArmorRenderer<?> renderer;

            @Override
            public <T extends LivingEntity> @NotNull BipedEntityModel<?> getGeoArmorRenderer(@Nullable T livingEntity, ItemStack itemStack, @Nullable EquipmentSlot equipmentSlot, @Nullable BipedEntityModel<T> original) {
                if (this.renderer == null) // Important that we do this. If we just instantiate  it directly in the field it can cause incompatibilities with some mods.
                    this.renderer = new TopHatArmorRenderer();

                return this.renderer;
            }
        });
    }
}
