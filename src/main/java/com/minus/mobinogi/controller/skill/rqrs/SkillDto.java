package com.minus.mobinogi.controller.skill.rqrs;

import com.minus.mobinogi.domain.CharacterClass;
import com.minus.mobinogi.domain.skill.Skill;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SkillDto {
    private String id;
    private String name;
    private CharacterClass job;
    private String type;
    private String description;
    private String tags;
    private String runes;

    public static SkillDto of(Skill skill) {
        return new SkillDto(
                skill.getId(),
                skill.getName(),
                skill.getJob(),
                skill.getType(),
                skill.getDescription(),
                skill.getTags(),
                skill.getRunes()
        );
    }
} 