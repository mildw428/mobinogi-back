package com.minus.mobinogi.domain.tiermaker;

import com.minus.mobinogi.domain.CharacterClass;
import com.minus.mobinogi.domain.skill.Skill;
import com.querydsl.core.types.dsl.BooleanExpression;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.util.List;

import static com.minus.mobinogi.domain.tiermaker.QTiermaker.tiermaker;

public class TiermakerRepositoryDslImpl extends QuerydslRepositorySupport implements TiermakerRepositoryDsl {

    public TiermakerRepositoryDslImpl() {
        super(Tiermaker.class);
    }

    @Override
    public List<Tiermaker> search(String q) {
        return from(tiermaker)
                .where(
                        eqQ(q)
                )
                .orderBy(tiermaker.id.desc())
                .fetch();
    }


    private BooleanExpression eqQ(String q) {
        if(q == null || q.isBlank()) {
            return null;
        }
        return tiermaker.name.containsIgnoreCase(q);
    }


}
