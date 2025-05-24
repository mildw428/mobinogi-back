package com.minus.mobinogi.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ItemGrade {
    COMMON("일반"),
    RARE("레어"),
    ELITE("엘리트"),
    UNIQUE("유니크"),
    EPIC("에픽"),
    LEGENDARY("전설");
    
    private final String displayName;

}
