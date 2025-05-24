package com.minus.mobinogi.domain.skill;

import com.minus.mobinogi.domain.CharacterClass;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SkillRepository extends JpaRepository<Skill, String>, SkillRepositoryDsl {
} 