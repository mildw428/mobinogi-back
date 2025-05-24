package com.minus.mobinogi.controller.skill.rqrs;

import com.minus.mobinogi.domain.CharacterClass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class SkillSearchRq {
    private String q;
    private List<CharacterClass> jobs;
} 