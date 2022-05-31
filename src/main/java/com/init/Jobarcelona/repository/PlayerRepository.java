package com.init.Jobarcelona.repository;

import com.init.Jobarcelona.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long>{

    Player findByReference(int Reference);

}
