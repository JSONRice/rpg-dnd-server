package com.example.websockettest.controllers;

import com.example.websockettest.entity.Character;
import com.example.websockettest.entity.EmptyJsonBody;
import com.example.websockettest.model.Auth;
import com.example.websockettest.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://rpg-dnd-client.herokuapp.com/")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping(path = "/login")
    public @ResponseBody ResponseEntity<Object> authentication(@RequestBody Auth newUser) {
        Character character = loginService.authenticate(newUser.getEmail(), newUser.getPassword());
        if (character != null) {
            return new ResponseEntity<>(character, HttpStatus.OK);    
        } else {
            return new ResponseEntity<>(new EmptyJsonBody(), HttpStatus.UNAUTHORIZED);
        }
    }
}
