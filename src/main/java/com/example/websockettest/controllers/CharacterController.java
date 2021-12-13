package com.example.websockettest.controllers;

import com.example.websockettest.entity.Character;
import com.example.websockettest.repos.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://rpg-dnd-client.herokuapp.com/")
public class CharacterController {

    @Autowired
    private CharacterRepository characterRepository;

    @GetMapping("/character")
    public Character greeting(@RequestParam(value = "username") String username) {
        return characterRepository.findByUsername(username);
    }
}
