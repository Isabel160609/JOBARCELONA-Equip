package com.init.Jobarcelona.controller;

import com.init.Jobarcelona.dto.PlayerDto;
import com.init.Jobarcelona.dto.SimplePlayerDto;
import com.init.Jobarcelona.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/jobarcelona")

public class PlayerController {
    @Autowired
    PlayerService playerService;

    @GetMapping(value="/test")
    public String hello(){
        return "Hello testing jobarcelona 2022";
    }


    // return reference + price
   // @GetMapping(value="/")
    //public ResponseEntity<?> getSimplePlayer( ){
     //   SimplePlayerDto simplePlayerDto = playerService.listSimplePlayers();
     //   return ResponseEntity.status(200).body(simplePlayerDto);
   // }


    //List of all data plyers
    @GetMapping(value = "/getall")
    public List<PlayerDto> getAllPlayer(){
        List<PlayerDto> players = playerService.listPlayers();
        return players;

    }

    @GetMapping(value = "/getall-simple")
    public List<SimplePlayerDto> getAllPlayerSimple(){
        List<SimplePlayerDto> players = playerService.listSimplePlayers();
        return players;

    }

    // update player
    @PutMapping(value="/update/{id}")
    public PlayerDto update(@PathVariable int id, @RequestBody PlayerDto playerDto){
        PlayerDto playerToUpdate = playerService.UpdatePlayer(id, playerDto);
        return playerDto;
    }

    @DeleteMapping(value = "/delete{id}" )
    public void delete(@PathVariable int id){
        playerService.deletePlayer(id);
    }

}
