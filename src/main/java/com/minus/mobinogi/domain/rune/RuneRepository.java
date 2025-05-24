package com.minus.mobinogi.domain.rune;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RuneRepository extends JpaRepository<Rune, Long>, RuneRepositoryDsl {

}
