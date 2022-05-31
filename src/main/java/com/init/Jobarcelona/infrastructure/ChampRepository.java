package com.init.Jobarcelona.infrastructure;

import com.init.Jobarcelona.domain.Champ;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ChampRepository extends JpaRepository<Champ, Long> {
}
