package com.minus.mobinogi.domain.title;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Table(name = "titles")
@NoArgsConstructor
public class Title {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer num;
    private String name;
    private String equipEffect;
    private String passiveEffect;
    private String conditions;

}
