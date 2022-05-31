package com.init.Jobarcelona.repository;

import com.init.Jobarcelona.entity.Continent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ContinentRepository extends JpaRepository<Continent, Long> {
}
