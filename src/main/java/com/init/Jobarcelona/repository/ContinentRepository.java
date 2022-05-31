package com.init.Jobarcelona.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ContinentRepository extends JpaRepository<ContinentRepository, Long> {
}
