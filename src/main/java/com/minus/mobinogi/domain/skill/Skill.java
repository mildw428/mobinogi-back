package com.minus.mobinogi.domain.skill;

import com.minus.mobinogi.domain.CharacterClass;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Table(name = "skill")
@NoArgsConstructor
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;

    @Enumerated(EnumType.STRING)
    private CharacterClass job;

    private String type;

    private String description;

    private String tags;

    private String runes;

}
