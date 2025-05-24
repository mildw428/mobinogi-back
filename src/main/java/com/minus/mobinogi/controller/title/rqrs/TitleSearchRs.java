package com.minus.mobinogi.controller.title.rqrs;

import com.minus.mobinogi.domain.title.Title;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter @Setter
@NoArgsConstructor
public class TitleSearchRs {
    private List<TitleDto> titles;

    public TitleSearchRs(List<Title> titles) {
        this.titles = titles.stream().map(TitleDto::of).toList();
    }
} 