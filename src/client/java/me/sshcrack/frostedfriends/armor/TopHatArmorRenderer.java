package me.sshcrack.frostedfriends.armor;

import me.sshcrack.frostedfriends.FrostedFriends;
import me.sshcrack.frostedfriends.item.armor.ChristmasHatItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class TopHatArmorRenderer extends GeoArmorRenderer<ChristmasHatItem> {
    public TopHatArmorRenderer() {
        super(new DefaultedItemGeoModel<>(FrostedFriends.ref("armor/top_hat")));
    }
}