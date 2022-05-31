package com.init.Jobarcelona.infrastructure;

import com.init.Jobarcelona.domain.Player;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long>{

    Player findByReference(int Reference);

}
