package com.init.Jobarcelona.infrastructure;

import com.init.Jobarcelona.domain.Continent;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ContinentRepository extends JpaRepository<Continent, Long> {
}
