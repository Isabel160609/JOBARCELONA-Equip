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

   //return reference + price
    @GetMapping(value="/getSimplePlayer/{reference}")
    public ResponseEntity<?> getSimplePlayer(@PathVariable int reference){
        SimplePlayerDto simplePlayerDto = playerService.findSimplePlayers(reference);
        return ResponseEntity.status(200).body(simplePlayerDto);
    }

  //return reference + price
    @GetMapping(value="/getPlayer/{reference}")
    public ResponseEntity<?> getPlayer(@PathVariable int reference){
        PlayerDto PlayerDto = playerService.findPlayer(reference);
        return ResponseEntity.status(200).body(PlayerDto);
    }


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
