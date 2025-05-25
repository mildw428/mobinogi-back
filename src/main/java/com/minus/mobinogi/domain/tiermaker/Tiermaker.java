package com.minus.mobinogi.domain.tiermaker;

import com.minus.mobinogi.utils.LongListConverter;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter @Setter
@Entity
@Table(name = "rune_tiermaker")
@NoArgsConstructor
public class Tiermaker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String name;

    private String username;

    private String password;

    private String ip;

    @Convert(converter = LongListConverter.class)
    private List<Long> waiting;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    @OneToMany(mappedBy = "tiermaker", cascade = CascadeType.ALL)
    private List<Tier> tiers = new ArrayList<>();

}
