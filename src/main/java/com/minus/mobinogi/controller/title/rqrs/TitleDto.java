package com.minus.mobinogi.controller.title.rqrs;

import com.minus.mobinogi.domain.title.Title;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class TitleDto {
    private Long id;
    private Integer num;
    private String name;
    private String equipEffect;
    private String passiveEffect;
    private String conditions;

    public static TitleDto of(Title title) {
        return new TitleDto(
                title.getId(),
                title.getNum(),
                title.getName(),
                title.getEquipEffect(),
                title.getPassiveEffect(),
                title.getConditions()
        );
    }
} 