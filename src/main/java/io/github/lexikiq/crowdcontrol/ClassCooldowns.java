package io.github.lexikiq.crowdcontrol;

import lombok.Getter;

public enum ClassCooldowns {
    ENTITY(30),
    POTION(30)
    ;

    private final @Getter int seconds;
    ClassCooldowns(int seconds) {
        this.seconds = seconds;
    }
}