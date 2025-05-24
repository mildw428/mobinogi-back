package com.minus.mobinogi.application;

import com.minus.mobinogi.controller.title.rqrs.TitleSearchRq;
import com.minus.mobinogi.controller.title.rqrs.TitleSearchRs;
import com.minus.mobinogi.domain.title.Title;
import com.minus.mobinogi.domain.title.TitleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TitleService {

    private final TitleRepository titleRepository;

    public TitleSearchRs search(TitleSearchRq rq) {
        List<Title> titles = titleRepository.search(rq.getQ(), rq.getSearchType(), rq.getIsEquipEffect(), rq.getIsPassiveEffect());
        return new TitleSearchRs(titles);
    }
}