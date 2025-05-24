package com.minus.mobinogi.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RuneType {
    WEAPON("무기"),
    ARMOR("방어구"),
    ACCESSORY("장신구"),
    EMBLEM("엠블럼"),
    ;

    private final String displayName;

}
