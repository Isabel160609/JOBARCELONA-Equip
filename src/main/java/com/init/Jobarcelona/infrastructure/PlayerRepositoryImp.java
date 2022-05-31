package com.init.Jobarcelona.infrastructure;

import com.init.Jobarcelona.domain.Player;

import org.springframework.stereotype.Service;

@Service
public class PlayerRepositoryImp {

    private final PlayerRepository playerRepository;

    public PlayerRepositoryImp(final PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;

    }

    public Player findByReference(int Reference) {
        return this.playerRepository.findByReference(Reference);
    }

}
