package com.minus.mobinogi.controller.rune.rqrs;

import com.minus.mobinogi.domain.CharacterClass;
import com.minus.mobinogi.domain.ItemGrade;
import com.minus.mobinogi.domain.RuneType;
import com.minus.mobinogi.domain.rune.Rune;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class RuneDto {
    private Long id;
    private RuneType type;
    private CharacterClass job;
    private String name;
    private ItemGrade grade;
    private String description;

    public static RuneDto of(Rune rune) {
        return new RuneDto(
                rune.getId(),
                rune.getType(),
                rune.getJob(),
                rune.getName(),
                rune.getGrade(),
                rune.getDescription()
        );

    }

}
