package com.minus.mobinogi.application;

import com.minus.mobinogi.controller.rune.rqrs.RuneSearchRq;
import com.minus.mobinogi.controller.rune.rqrs.RuneSearchRs;
import com.minus.mobinogi.domain.rune.Rune;
import com.minus.mobinogi.domain.rune.RuneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RuneService {

    private final RuneRepository runeRepository;

    public RuneSearchRs search(RuneSearchRq rq) {
        List<Rune> runes = runeRepository.search(rq.getQ(),rq.getTypes(),rq.getJobs(),rq.getItemGrades());

        return new RuneSearchRs(runes);
    }
}
