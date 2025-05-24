package com.minus.mobinogi.controller.rune.rqrs;

import com.minus.mobinogi.domain.rune.Rune;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter @Setter
@NoArgsConstructor
public class RuneSearchRs {
    private List<RuneDto> runes;

    public RuneSearchRs(List<Rune> runes) {
        this.runes = runes.stream().map(RuneDto::of).toList();
    }
}
