package com.minus.mobinogi.domain.tiermaker;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TiermakerRepositoryDsl {

    List<Tiermaker> search(String q);
} 