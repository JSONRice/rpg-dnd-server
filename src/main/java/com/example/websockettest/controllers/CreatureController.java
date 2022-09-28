package com.example.websockettest.controllers;

import com.example.websockettest.entity.Creature;
import com.example.websockettest.repos.CreatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "https://rpg-dnd-client.herokuapp.com/")
public class CreatureController {

    @Autowired
    private CreatureRepository creatureRepository;

    @GetMapping("/creature")
    public Creature creature(@RequestParam(value = "name") String name) {
        return creatureRepository.findByName(name);
    }

    @GetMapping("/creatures")
    public List<Creature> creatures() {
        return creatureRepository.findAll();
    }
}
