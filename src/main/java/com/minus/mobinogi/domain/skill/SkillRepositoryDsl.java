package com.minus.mobinogi.domain.skill;

import com.minus.mobinogi.domain.CharacterClass;

import java.util.List;

public interface SkillRepositoryDsl {
    List<Skill> search(String q, List<CharacterClass> jobs);
} 