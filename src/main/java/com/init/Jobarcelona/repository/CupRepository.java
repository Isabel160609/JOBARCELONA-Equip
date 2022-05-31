package com.init.Jobarcelona.repository;

import com.init.Jobarcelona.entity.Cup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CupRepository extends JpaRepository<Cup, Long> {
}
