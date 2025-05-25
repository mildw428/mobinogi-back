package com.minus.mobinogi.domain.rune;

import com.minus.mobinogi.domain.CharacterClass;
import com.minus.mobinogi.domain.ItemGrade;
import com.minus.mobinogi.domain.RuneType;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.core.types.dsl.CaseBuilder;
import com.querydsl.core.types.dsl.NumberExpression;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.util.List;

import static com.minus.mobinogi.domain.rune.QRune.rune;

public class RuneRepositoryDslImpl extends QuerydslRepositorySupport implements RuneRepositoryDsl {

    public RuneRepositoryDslImpl() {
        super(Rune.class);
    }

    @Override
    public List<Rune> search(String q, List<RuneType> runeTypes, List<CharacterClass> jobs, List<ItemGrade> grades) {
        return from(rune)
                .where(
                        eqQ(q),
                        inType(runeTypes),
                        inJob(jobs),
                        inGrade(grades)
                )
                .orderBy(
                        rune.job.asc(),
                        gradeOrder().asc(),  // 사용자 정의 정렬
                        rune.type.asc()
                )
                .fetch();
    }

    private NumberExpression<Integer> gradeOrder() {
        return new CaseBuilder()
                .when(rune.grade.eq(ItemGrade.LEGENDARY)).then(0)
                .when(rune.grade.eq(ItemGrade.EPIC)).then(1)
                .when(rune.grade.eq(ItemGrade.UNIQUE)).then(2)
                .when(rune.grade.eq(ItemGrade.ELITE)).then(3)
                .when(rune.grade.eq(ItemGrade.RARE)).then(4)
                .when(rune.grade.eq(ItemGrade.COMMON)).then(5)
                .otherwise(6);
    }
    private BooleanExpression eqQ(String q) {
        if(q == null || q.isBlank()) {
            return null;
        }
        return rune.name.containsIgnoreCase(q).or(rune.description.containsIgnoreCase(q));
    }

    private BooleanExpression inType(List<RuneType> runeTypes) {
        if(runeTypes == null || runeTypes.isEmpty()) {
            return null;
        }
        return rune.type.in(runeTypes);
    }

    private BooleanExpression inJob(List<CharacterClass> jobs) {
        if(jobs == null || jobs.isEmpty()) {
            return null;
        }
        return rune.job.in(jobs).or(rune.job.eq(CharacterClass.NONE));
    }

    private BooleanExpression inGrade(List<ItemGrade> grades) {
        if(grades == null || grades.isEmpty()) {
            return null;
        }
        return rune.grade.in(grades);
    }


}
