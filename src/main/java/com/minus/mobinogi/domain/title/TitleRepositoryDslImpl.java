package com.minus.mobinogi.domain.title;

import com.minus.mobinogi.controller.title.rqrs.TitleSearchType;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.BooleanExpression;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.util.List;

import static com.minus.mobinogi.domain.title.QTitle.title;

public class TitleRepositoryDslImpl extends QuerydslRepositorySupport implements TitleRepositoryDsl {

    public TitleRepositoryDslImpl() {
        super(Title.class);
    }

    @Override
    public List<Title> search(String q, TitleSearchType searchType, Boolean isEquipEffect, Boolean isPassiveEffect) {
        return from(title)
                .where(
                        eqQ(q, searchType),
                        inEffect(isEquipEffect,isPassiveEffect)
                        )
                .fetch();
    }

    private BooleanExpression inEffect(Boolean isEquipEffect, Boolean isPassiveEffect) {
        BooleanExpression expression = null;

        if (Boolean.TRUE.equals(isEquipEffect)) {
            expression = title.equipEffect.isNotEmpty().and(title.equipEffect.ne("?"));
        }
        if (Boolean.TRUE.equals(isPassiveEffect)) {
            expression = title.passiveEffect.isNotEmpty().and(title.passiveEffect.ne("?"));
        }
        if(Boolean.TRUE.equals(isEquipEffect) && Boolean.TRUE.equals(isPassiveEffect)) {
            expression = title.equipEffect.isNotEmpty().and(title.equipEffect.ne("?"))
                    .and(title.passiveEffect.isNotEmpty().and(title.passiveEffect.ne("?")));
        }
        return expression;
    }

    private BooleanExpression eqQ(String q, TitleSearchType searchType) {
        if(q == null || q.isBlank()) {
            return null;
        }

        BooleanExpression expression = null;

        Integer num;
        try {
            num = Integer.parseInt(q);
        } catch (NumberFormatException e) {
            num = -1;
        }

        switch (searchType) {
            case NUM -> expression = title.num.eq(num);
            case NAME -> expression = title.name.containsIgnoreCase(q);
            case EFFECT -> expression = title.equipEffect.containsIgnoreCase(q).or(title.passiveEffect.containsIgnoreCase(q));
            case CONDITIONS -> expression = title.conditions.containsIgnoreCase(q);
            case ALL -> expression = title.num.eq(num)
                    .or(title.name.containsIgnoreCase(q))
                    .or(title.equipEffect.containsIgnoreCase(q))
                    .or(title.passiveEffect.containsIgnoreCase(q))
                    .or(title.conditions.containsIgnoreCase(q));
        }
        return expression;
    }
} 