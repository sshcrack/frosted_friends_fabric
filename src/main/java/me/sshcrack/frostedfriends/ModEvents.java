package me.sshcrack.frostedfriends;

import me.sshcrack.frostedfriends.block.snow.PileOfSnowCreator;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;

public class ModEvents {
    public static void initialize() {
        UseBlockCallback.EVENT.register(new PileOfSnowCreator());
    }
}
