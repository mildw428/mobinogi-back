package com.minus.mobinogi.controller.title.rqrs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class TitleSearchRq {
    private String q;
    private TitleSearchType searchType;
    private Boolean isEquipEffect;
    private Boolean isPassiveEffect;
} 