package com.init.Jobarcelona.application;

import java.util.List;
import java.util.Optional;

import com.init.Jobarcelona.core.mappers.PlayerMapper;
import com.init.Jobarcelona.core.mappers.dtos.PlayerDto;
import com.init.Jobarcelona.core.mappers.dtos.SimplePlayerDto;
import com.init.Jobarcelona.domain.Player;
import com.init.Jobarcelona.infrastructure.PlayerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerApplicationImp {

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private PlayerMapper playerMapper;

    public PlayerDto createPlayer(PlayerDto playerDto) {
        Player player = playerMapper.toPlayer(playerDto);
        PlayerDto newPlayer = playerMapper.toPlayerDto(this.playerRepository.save(player));
        return newPlayer;
    }

    public List<PlayerDto> listPlayers() {
        List<Player> players = playerRepository.findAll();
        List<PlayerDto> playersDto = playerMapper.toPlayerDto(players);
        return playersDto;

    }

    public List<SimplePlayerDto> listSimplePlayers() {
        List<Player> players = playerRepository.findAll();
        List<SimplePlayerDto> SimplePlayersDto = playerMapper.toSimplePlayerDto(players);
        return SimplePlayersDto;
    }

    public SimplePlayerDto findSimplePlayers(int reference) {
        Player player = playerRepository.findByReference(reference);
        SimplePlayerDto playerDto = playerMapper.toSimplePlayerDto(player);
        return playerDto;
    }

    public PlayerDto findPlayer(int reference) {
        Player player = playerRepository.findByReference(reference);
        PlayerDto playerDto = playerMapper.toPlayerDto(player);
        return playerDto;
    }

    public PlayerDto UpdatePlayer(long id, PlayerDto playerDto) {
        Optional<Player> optionalPlayer = playerRepository.findById(id);
        if (optionalPlayer.isPresent()) {
            Player player = optionalPlayer.get();
            Player updatePlayer = playerMapper.toPlayer(playerDto);

            PlayerDto updatePlayerDto = playerMapper.toPlayerDto(updatePlayer);
            return updatePlayerDto;
        } else {
            PlayerDto playerDtoEmpty = new PlayerDto();
            return playerDtoEmpty;
        }
    }

    public void deletePlayer(long id) {
        Optional<Player> optionalPlayer = playerRepository.findById(id);
        if (optionalPlayer.isPresent()) {
            playerRepository.deleteById(id);
        }
    }
}
