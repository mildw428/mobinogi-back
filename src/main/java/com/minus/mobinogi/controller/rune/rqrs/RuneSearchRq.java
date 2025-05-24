package com.minus.mobinogi.controller.rune.rqrs;

import com.minus.mobinogi.domain.CharacterClass;
import com.minus.mobinogi.domain.ItemGrade;
import com.minus.mobinogi.domain.RuneType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class RuneSearchRq {

    private String q;
    private List<RuneType> types;
    private List<ItemGrade> itemGrades;
    private List<CharacterClass> jobs;

}
