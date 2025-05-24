package com.minus.mobinogi.domain.rune;

import com.minus.mobinogi.domain.CharacterClass;
import com.minus.mobinogi.domain.ItemGrade;
import com.minus.mobinogi.domain.RuneType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Table(name = "runes")
@NoArgsConstructor
public class Rune {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private RuneType type;

    @Enumerated(EnumType.STRING)
    private CharacterClass job;

    private String name;

    @Enumerated(EnumType.STRING)
    private ItemGrade grade;

    private String description;

}
