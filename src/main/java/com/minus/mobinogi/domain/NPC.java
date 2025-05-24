package com.minus.mobinogi.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum NPC {
    NORA("노라", MabinogiRegion.TIR_CHONAILL),
    DEIAN("데이안", MabinogiRegion.TIR_CHONAILL),
    DILYS("딜리스", MabinogiRegion.TIR_CHONAILL),
    LASSA("라사", MabinogiRegion.TIR_CHONAILL),
    REYNALD("레이널드", MabinogiRegion.TIR_CHONAILL),
    MALCOLM("말콤", MabinogiRegion.TIR_CHONAILL),
    MAVEN("메이븐", MabinogiRegion.TIR_CHONAILL),
    ALISA("알리사", MabinogiRegion.TIR_CHONAILL),
    CAITIN("케이틴", MabinogiRegion.TIR_CHONAILL),
    FERGUS("퍼거스", MabinogiRegion.TIR_CHONAILL),
    DUNCAN("던컨", MabinogiRegion.TIR_CHONAILL),
    ELVIN("엘빈", MabinogiRegion.DUGALD_AISLE),
    TRACY("트레이시", MabinogiRegion.DUGALD_AISLE),
    GLYNIS("글리니스", MabinogiRegion.DUNBARTON),
    NERYS("네리스", MabinogiRegion.DUNBARTON),
    MANUS("마누스", MabinogiRegion.DUNBARTON),
    WALTER("발터", MabinogiRegion.DUNBARTON),
    STEWART("스튜어트", MabinogiRegion.DUNBARTON),
    SIMON("시몬", MabinogiRegion.DUNBARTON),
    ARANWEN("아란웬", MabinogiRegion.DUNBARTON),
    AIRA("아이라", MabinogiRegion.DUNBARTON),
    JEROME("제롬", MabinogiRegion.DUNBARTON),
    JAMIE("제이미", MabinogiRegion.DUNBARTON),
    CALLIX("칼릭스", MabinogiRegion.DUNBARTON),
    FLORA("플로라", MabinogiRegion.DUNBARTON),
    ARMIS("아르미스", MabinogiRegion.COLHEN),
    CEARA("케아라", MabinogiRegion.COLHEN),
    CONNOR("코너", MabinogiRegion.COLHEN),
    KILLIAN("킬리언", MabinogiRegion.COLHEN);
    
    private final String displayName;
    private final MabinogiRegion region;

}
