package com.minus.mobinogi.controller.skill.rqrs;

import com.minus.mobinogi.domain.skill.Skill;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter @Setter
@NoArgsConstructor
public class SkillSearchRs {
    private List<SkillDto> skills;

    public SkillSearchRs(List<Skill> skills) {
        this.skills = skills.stream().map(SkillDto::of).toList();
    }
} 