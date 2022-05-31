package com.init.Jobarcelona.controller;

import com.init.Jobarcelona.dto.PlayerDto;
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
    @GetMapping(value="/{reference}")
    public ResponseEntity<?> getSimplePlayer(@PathVariable int reference ){
        SimplePlayerDto simplePlayerDto = playerService.getSimplePlayer(reference);
        return ResponseEntity.status(200).body(simplePlayerDto);
    }


    //List of all data plyers
    @GetMapping(value = "/getall")
    public List<PlayerDto> getAllPlayer(){
        List<PlayerDto> players = playerService.listPlayers();
        return players;

    }

    @GetMapping(value = "/getall-simple")
    public List<SimplePlayer> getAllPlayerSimple(){
        List<SimplePlayer> players = playerService.getAllSimplePlayer;
        return players;

    }

    // update player
    @PutMapping(value="/update/{id}")
    public PlayerDto update(@PathVariable int id, @RequestBody PlayerDto playerDto){
        PlayerDto playerToUpdate = playerService.updatePlayer(id, playerDto);
        return playerDto;
    }

    @DeleteMapping(value = "/delete{id}" )
    public void delete(@PathVariable int id){
        return playerService.delete(id);
    }




}
