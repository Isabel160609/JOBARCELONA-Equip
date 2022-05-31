package com.init.Jobarcelona.controller;

import java.util.List;

import com.init.Jobarcelona.application.PlayerApplicationImp;
import com.init.Jobarcelona.core.mappers.dtos.PlayerDto;
import com.init.Jobarcelona.core.mappers.dtos.SimplePlayerDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/jobarcelona")

public class PlayerController {

    private final PlayerApplicationImp playerService;

    @Autowired
    public PlayerController(final PlayerApplicationImp playerService) {
        this.playerService = playerService;
    }

    @PostMapping(value = "/create")
    public ResponseEntity<?> create(@RequestBody PlayerDto playerDto) {
        PlayerDto data = playerService.createPlayer(playerDto);
        return ResponseEntity.status(201).body(data);
    }

    @GetMapping(value = "/getPlayer/{reference}")
    public ResponseEntity<?> getPlayer(@PathVariable int reference) {
        PlayerDto data = playerService.findPlayer(reference);
        return ResponseEntity.status(200).body(data);
    }

    @GetMapping(value = "/getSimplePlayer/{reference}")
    public ResponseEntity<?> getSimplePlayer(@PathVariable int reference) {
        SimplePlayerDto data = playerService.findSimplePlayers(reference);
        return ResponseEntity.status(200).body(data);
    }

    @GetMapping(value = "/getall")
    public ResponseEntity<?> getAllPlayer() {
        List<PlayerDto> data = playerService.listPlayers();
        return ResponseEntity.status(200).body(data);
    }

    @GetMapping(value = "/getall-simple")
    public ResponseEntity<?> getAllPlayerSimple() {
        List<SimplePlayerDto> data = playerService.listSimplePlayers();
        return ResponseEntity.status(200).body(data);

    }

    @PutMapping(value = "/update/{id}")
    public ResponseEntity<?> update(@PathVariable int id, @RequestBody PlayerDto playerDto) {
        PlayerDto data = playerService.UpdatePlayer(id, playerDto);
        return ResponseEntity.status(200).body(data);
    }

    @DeleteMapping(value = "/delete{id}")
    public ResponseEntity<?> delete(@PathVariable int id) {
        playerService.deletePlayer(id);
        return ResponseEntity.ok().build();
    }

}
