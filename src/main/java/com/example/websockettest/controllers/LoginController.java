package com.example.websockettest.controllers;

import com.example.websockettest.entity.Character;
import com.example.websockettest.entity.EmptyJsonBody;
import com.example.websockettest.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://rpg-dnd-client.herokuapp.com/")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @GetMapping(path = "/login")
    public ResponseEntity<Object> authentication(
            @RequestParam(value = "username") String username,
            @RequestParam(value = "password") String password) {
        Character character = loginService.authenticate(username, password);
        return new ResponseEntity<>(character != null ? character : new EmptyJsonBody(), HttpStatus.OK);
    }
}
