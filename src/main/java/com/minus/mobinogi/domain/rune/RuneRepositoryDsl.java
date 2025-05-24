package com.minus.mobinogi.domain.rune;

import com.minus.mobinogi.domain.CharacterClass;
import com.minus.mobinogi.domain.ItemGrade;
import com.minus.mobinogi.domain.RuneType;

import java.util.List;

public interface RuneRepositoryDsl {

    List<Rune> search(String q, List<RuneType> runeTypes, List<CharacterClass> jobs, List<ItemGrade> grades);

}
