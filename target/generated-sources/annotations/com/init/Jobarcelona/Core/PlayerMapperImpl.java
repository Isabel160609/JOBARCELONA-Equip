package com.init.Jobarcelona.Core;

import com.init.Jobarcelona.dto.ChampDto;
import com.init.Jobarcelona.dto.ContinentDto;
import com.init.Jobarcelona.dto.CupDto;
import com.init.Jobarcelona.dto.PlayerDto;
import com.init.Jobarcelona.dto.SimplePlayerDto;
import com.init.Jobarcelona.entity.Champ;
import com.init.Jobarcelona.entity.Continent;
import com.init.Jobarcelona.entity.Cup;
import com.init.Jobarcelona.entity.Player;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-31T13:35:07+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
)
@Component
public class PlayerMapperImpl implements PlayerMapper {

    @Override
    public PlayerDto toPlayerDto(Player player) {
        if ( player == null ) {
            return null;
        }

        PlayerDto playerDto = new PlayerDto();

        playerDto.setReference( player.getReference() );
        playerDto.setAge( player.getAge() );
        playerDto.setNation( player.getNation() );
        playerDto.setLeague( player.getLeague() );
        playerDto.setTeam( player.getTeam() );
        playerDto.setGoalsSelection( player.getGoalsSelection() );
        playerDto.setSelectionsNation( player.getSelectionsNation() );
        playerDto.setPosition( player.getPosition() );
        playerDto.setPrice( player.getPrice() );
        playerDto.setChamp( player.getChamp() );
        playerDto.setCup( toCup( player.getCup() ) );
        playerDto.setContinent( toContinent( player.getContinent() ) );

        return playerDto;
    }

    @Override
    public Player toPlayer(PlayerDto playerDTO) {
        if ( playerDTO == null ) {
            return null;
        }

        Player player = new Player();

        player.setReference( playerDTO.getReference() );
        player.setAge( playerDTO.getAge() );
        player.setNation( playerDTO.getNation() );
        player.setLeague( playerDTO.getLeague() );
        player.setTeam( playerDTO.getTeam() );
        player.setGoalsSelection( playerDTO.getGoalsSelection() );
        player.setSelectionsNation( playerDTO.getSelectionsNation() );
        player.setPosition( playerDTO.getPosition() );
        player.setPrice( playerDTO.getPrice() );
        player.setChamp( playerDTO.getChamp() );
        player.setCup( toCup( playerDTO.getCup() ) );
        player.setContinent( toContinent( playerDTO.getContinent() ) );

        return player;
    }

    @Override
    public List<PlayerDto> toPlayerDto(List<Player> players) {
        if ( players == null ) {
            return null;
        }

        List<PlayerDto> list = new ArrayList<PlayerDto>( players.size() );
        for ( Player player : players ) {
            list.add( toPlayerDto( player ) );
        }

        return list;
    }

    @Override
    public SimplePlayerDto toSimplePlayerDto(Player player) {
        if ( player == null ) {
            return null;
        }

        SimplePlayerDto simplePlayerDto = new SimplePlayerDto();

        simplePlayerDto.setReference( player.getReference() );
        simplePlayerDto.setPrice( player.getPrice() );

        return simplePlayerDto;
    }

    @Override
    public Player toPlayer(SimplePlayerDto SimpleplayerDTO) {
        if ( SimpleplayerDTO == null ) {
            return null;
        }

        Player player = new Player();

        player.setReference( SimpleplayerDTO.getReference() );
        player.setPrice( SimpleplayerDTO.getPrice() );

        return player;
    }

    @Override
    public List<SimplePlayerDto> toSimplePlayerDto(List<Player> players) {
        if ( players == null ) {
            return null;
        }

        List<SimplePlayerDto> list = new ArrayList<SimplePlayerDto>( players.size() );
        for ( Player player : players ) {
            list.add( toSimplePlayerDto( player ) );
        }

        return list;
    }

    @Override
    public ChampDto toSimpleChampDto(Champ champ) {
        if ( champ == null ) {
            return null;
        }

        ChampDto champDto = new ChampDto();

        champDto.setGoal_champ( champ.getGoal_champ() );
        champDto.setAssist_champ( champ.getAssist_champ() );
        champDto.setOwn_goal_champ( champ.getOwn_goal_champ() );
        champDto.setYellow_card_champ( champ.getYellow_card_champ() );
        champDto.setSecond_yellow_card_champ( champ.getSecond_yellow_card_champ() );
        champDto.setRed_car_champ( champ.getRed_car_champ() );

        return champDto;
    }

    @Override
    public Champ toChamp(ChampDto champDTO) {
        if ( champDTO == null ) {
            return null;
        }

        Champ champ = new Champ();

        champ.setGoal_champ( champDTO.getGoal_champ() );
        champ.setAssist_champ( champDTO.getAssist_champ() );
        champ.setOwn_goal_champ( champDTO.getOwn_goal_champ() );
        champ.setYellow_card_champ( champDTO.getYellow_card_champ() );
        champ.setSecond_yellow_card_champ( champDTO.getSecond_yellow_card_champ() );
        champ.setRed_car_champ( champDTO.getRed_car_champ() );

        return champ;
    }

    @Override
    public ContinentDto toContinentDto(Continent continent) {
        if ( continent == null ) {
            return null;
        }

        ContinentDto continentDto = new ContinentDto();

        continentDto.setGoal_continent( continent.getGoal_continent() );
        continentDto.setAssist_continent( continent.getAssist_continent() );
        continentDto.setOwn_goal_continent( continent.getOwn_goal_continent() );
        continentDto.setYellow_card_continent( continent.getYellow_card_continent() );
        continentDto.setSecond_yellow_card_continent( continent.getSecond_yellow_card_continent() );
        continentDto.setRed_card_continent( continent.getRed_card_continent() );

        return continentDto;
    }

    @Override
    public Continent toContinent(Continent continent) {
        if ( continent == null ) {
            return null;
        }

        Continent continent1 = new Continent();

        continent1.setId( continent.getId() );
        continent1.setGoal_continent( continent.getGoal_continent() );
        continent1.setAssist_continent( continent.getAssist_continent() );
        continent1.setOwn_goal_continent( continent.getOwn_goal_continent() );
        continent1.setYellow_card_continent( continent.getYellow_card_continent() );
        continent1.setSecond_yellow_card_continent( continent.getSecond_yellow_card_continent() );
        continent1.setRed_card_continent( continent.getRed_card_continent() );

        return continent1;
    }

    @Override
    public CupDto toCupDto(Cup cup) {
        if ( cup == null ) {
            return null;
        }

        CupDto cupDto = new CupDto();

        cupDto.setGoal_cup( cup.getGoal_cup() );
        cupDto.setAssist_cup( cup.getAssist_cup() );
        cupDto.setOwn_goal_cup( cup.getOwn_goal_cup() );
        cupDto.setYellow_card_cup( cup.getYellow_card_cup() );
        cupDto.setSecond_yellow_card( cup.getSecond_yellow_card() );
        cupDto.setRed_card_cup( cup.getRed_card_cup() );

        return cupDto;
    }

    @Override
    public Cup toCup(Cup cup) {
        if ( cup == null ) {
            return null;
        }

        Cup cup1 = new Cup();

        cup1.setId( cup.getId() );
        cup1.setGoal_cup( cup.getGoal_cup() );
        cup1.setAssist_cup( cup.getAssist_cup() );
        cup1.setOwn_goal_cup( cup.getOwn_goal_cup() );
        cup1.setYellow_card_cup( cup.getYellow_card_cup() );
        cup1.setSecond_yellow_card( cup.getSecond_yellow_card() );
        cup1.setRed_card_cup( cup.getRed_card_cup() );

        return cup1;
    }
}
