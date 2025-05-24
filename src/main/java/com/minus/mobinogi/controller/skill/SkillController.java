package com.minus.mobinogi.controller.skill;

import com.minus.mobinogi.application.SkillService;
import com.minus.mobinogi.controller.skill.rqrs.SkillSearchRq;
import com.minus.mobinogi.controller.skill.rqrs.SkillSearchRs;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/skills")
public class SkillController {

    private final SkillService skillService;

    @PostMapping("/search")
    public ResponseEntity<SkillSearchRs> search(@RequestBody SkillSearchRq rq) {
        return ResponseEntity.ok(skillService.search(rq));
    }
}
