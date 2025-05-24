package com.minus.mobinogi.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CharacterClass {

    NONE("NONE"),

    // 전사 계열
    WARRIOR("전사"),
    GREAT_SWORD_WARRIOR("대검전사"),
    SWORD_MASTER("검술사"),
    
    // 궁수 계열
    ARCHER("궁수"),
    ARBALIST("석궁사수"),
    LONG_BOW_MAN("장궁병"),
    
    // 마법사 계열
    MAGE("마법사"),
    FIRE_MAGE("화염술사"),
    ICE_MAGE("빙결술사"),
    
    // 힐러 계열
    HEALER("힐러"),
    PRIEST("사제"),
    MONK("수도사"),
    
    // 음유시인 계열
    BARD("음유시인"),
    DANCER("댄서"),
    BATTLE_MUSICIAN("악사"),

    // 도적 계열
    THIEF("도적"),
    DUAL_BLADE("듀얼블레이드"),
    FIGHTER("격투가"),
    ;

    private final String displayName;

}
