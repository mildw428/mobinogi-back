package com.minus.mobinogi.application;

import com.minus.mobinogi.controller.skill.rqrs.SkillSearchRq;
import com.minus.mobinogi.controller.skill.rqrs.SkillSearchRs;
import com.minus.mobinogi.domain.skill.Skill;
import com.minus.mobinogi.domain.skill.SkillRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SkillService {

    private final SkillRepository skillRepository;

    public SkillSearchRs search(SkillSearchRq rq) {
        List<Skill> skills = skillRepository.search(rq.getQ(), rq.getJobs());
        return new SkillSearchRs(skills);
    }
} 