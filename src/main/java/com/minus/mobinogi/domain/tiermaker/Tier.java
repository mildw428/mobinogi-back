package com.minus.mobinogi.domain.tiermaker;

import com.minus.mobinogi.utils.LongListConverter;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@Entity
@Table(name = "rune_tier")
@NoArgsConstructor
public class Tier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @ManyToOne
    @JoinColumn(name = "rune_tiermaker_id")
    private Tiermaker tiermaker;

    private Integer order;

    @Convert(converter = LongListConverter.class)
    private List<Long> runeIds;

}
