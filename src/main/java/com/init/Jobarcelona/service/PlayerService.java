package com.init.Jobarcelona.service;

import com.init.Jobarcelona.dto.ChampDto;
import com.init.Jobarcelona.dto.PlayerDto;
import com.init.Jobarcelona.dto.SimplePlayerDto;
import com.init.Jobarcelona.entity.Champ;
import com.init.Jobarcelona.entity.Continent;
import com.init.Jobarcelona.entity.Cup;
import com.init.Jobarcelona.entity.Player;
import com.init.Jobarcelona.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {

@Autowired
private PlayerRepository playerRepository;

@Autowired
private com.init.Jobarcelona.Core.PlayerMapper playerMapper;

    public Player createPlayer(PlayerDto playerDto) {

        Player player = playerMapper.toPlayer(playerDto);

        Champ champ = playerMapper.toChamp(new ChampDto());
        champ = playerDto.getChamp();

        Continent continent = playerMapper.toContinent(new Continent());
        continent = playerDto.getContinent();

        Cup cup = playerMapper.toCup(new Cup());
        cup = playerDto.getCup();

        playerRepository.save(player);

        return player;
        }
        public List<PlayerDto> listPlayers() {
            List<Player> players= playerRepository.findAll();
            List<PlayerDto> playersDto= playerMapper.toPlayerDto(players);
            return playersDto;

        }
        public List<SimplePlayerDto> listSimplePlayers() {

            List<Player> players= playerRepository.findAll();
            List<SimplePlayerDto> SimplePlayersDto= playerMapper.toSimplePlayerDto(players);
            return SimplePlayersDto;

        }
        public SimplePlayerDto findSimplePlayers(int reference) {
            Player player= playerRepository.findByReference(reference);
            SimplePlayerDto playerDto=playerMapper.toSimplePlayerDto(player);
            return playerDto;
        }
        public PlayerDto findPlayer(int reference) {
            Player player= playerRepository.findByReference(reference);
            PlayerDto playerDto=playerMapper.toPlayerDto(player);
            return playerDto;
        }
        public PlayerDto UpdatePlayer(long id, PlayerDto playerDto) {

            Optional<Player> optionalPlayer=playerRepository.findById(id);
            if(optionalPlayer.isPresent()) {
                Player player=optionalPlayer.get();
                Player updatePlayer= playerMapper.toPlayer(playerDto);

                PlayerDto updatePlayerDto =playerMapper.toPlayerDto(updatePlayer);
                return updatePlayerDto;
            }
            else {
                PlayerDto playerDtoEmpty=new PlayerDto();
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
