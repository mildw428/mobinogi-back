package com.minus.mobinogi.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MabinogiRegion {
    TIR_CHONAILL("티르코네일"),
    DUGALD_AISLE("두갈드아일"),
    DUNBARTON("던바튼"),
    ICE_GORGE("얼음 협곡"),
    COLHEN("콜헨"),
    ;

    private final String displayName;

}
