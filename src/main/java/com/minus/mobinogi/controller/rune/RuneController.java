package com.minus.mobinogi.controller.rune;

import com.minus.mobinogi.application.RuneService;
import com.minus.mobinogi.controller.rune.rqrs.RuneSearchRq;
import com.minus.mobinogi.controller.rune.rqrs.RuneSearchRs;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/runes")
public class RuneController {

    private final RuneService runeService;

    @PostMapping("/search")
    public ResponseEntity<RuneSearchRs> test(@RequestBody RuneSearchRq rq) {
        return ResponseEntity.ok(runeService.search(rq));
    }

}
