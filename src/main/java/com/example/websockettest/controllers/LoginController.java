package com.example.websockettest.controllers;

import com.example.websockettest.entity.Character;
import com.example.websockettest.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;

    @GetMapping(path = "/login")
    public Character authentication(
            @RequestParam(value = "username") String username,
            @RequestParam(value = "password") String password) {
        return loginService.authenticate(username, password);
    }
}
