package com.minus.mobinogi.controller.tiermaker.rqrs;

import com.minus.mobinogi.domain.tiermaker.Tiermaker;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TiermakerDto {

    private String id;
    private String name;
    private String username;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public static TiermakerDto of(Tiermaker tiermaker) {
        return new TiermakerDto(
                tiermaker.getId(),
                tiermaker.getName(),
                tiermaker.getUsername(),
                tiermaker.getCreatedAt(),
                tiermaker.getUpdatedAt()
        );
    }

}
