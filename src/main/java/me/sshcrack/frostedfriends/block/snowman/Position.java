package me.sshcrack.frostedfriends.block.snowman;

import net.minecraft.util.StringIdentifiable;

public enum Position implements StringIdentifiable {
        TOP,
        MIDDLE,
        BOTTOM;

        @Override
        public String asString() {
            return switch (this) {
                case TOP -> "top";
                case MIDDLE -> "middle";
                case BOTTOM -> "bottom";
            };
        }
    }