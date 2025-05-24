package com.minus.mobinogi.domain.skill;

import com.minus.mobinogi.domain.CharacterClass;
import com.querydsl.core.types.dsl.BooleanExpression;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.util.List;

import static com.minus.mobinogi.domain.skill.QSkill.skill;

public class SkillRepositoryDslImpl extends QuerydslRepositorySupport implements SkillRepositoryDsl {

    public SkillRepositoryDslImpl() {
        super(Skill.class);
    }

    @Override
    public List<Skill> search(String q, List<CharacterClass> jobs) {
        return from(skill)
                .where(
                        eqQ(q),
                        inJob(jobs)
                ).fetch();
    }

    private BooleanExpression eqQ(String q) {
        if(q == null || q.isBlank()) {
            return null;
        }
        return skill.name.containsIgnoreCase(q)
                .or(skill.runes.containsIgnoreCase(q))
                .or(skill.description.containsIgnoreCase(q));
    }

    private BooleanExpression inJob(List<CharacterClass> jobs) {
        if(jobs == null || jobs.isEmpty()) {
            return null;
        }
        return skill.job.in(jobs);
    }
} 