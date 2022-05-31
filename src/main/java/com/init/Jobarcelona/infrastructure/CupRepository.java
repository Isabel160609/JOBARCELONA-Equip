package com.init.Jobarcelona.infrastructure;

import com.init.Jobarcelona.domain.Cup;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CupRepository extends JpaRepository<Cup, Long> {
}
