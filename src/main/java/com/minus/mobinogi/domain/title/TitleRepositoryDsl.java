package com.minus.mobinogi.domain.title;

import com.minus.mobinogi.controller.title.rqrs.TitleSearchType;

import java.util.List;

public interface TitleRepositoryDsl {
    List<Title> search(String q, TitleSearchType searchType, Boolean isEquipEffect, Boolean isPassiveEffect);
} 