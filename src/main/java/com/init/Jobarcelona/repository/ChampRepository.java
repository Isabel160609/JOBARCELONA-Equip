package com.init.Jobarcelona.repository;

import com.init.Jobarcelona.entity.Champ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ChampRepository extends JpaRepository<Champ, Long> {
}
