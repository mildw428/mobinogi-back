package com.minus.mobinogi.controller.title;

import com.minus.mobinogi.application.TitleService;
import com.minus.mobinogi.controller.title.rqrs.TitleSearchRq;
import com.minus.mobinogi.controller.title.rqrs.TitleSearchRs;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/titles")
public class TitleController {

    private final TitleService titleService;

    @PostMapping("/search")
    public ResponseEntity<TitleSearchRs> search(@RequestBody TitleSearchRq rq) {
        return ResponseEntity.ok(titleService.search(rq));
    }
} 