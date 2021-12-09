package com.example.websockettest.controllers;

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
    public String authentication(
            @RequestParam(value = "username", required = true) String username,
            @RequestParam(value = "password", required = true) String password) {
        boolean res = loginService.authenticate(username, password);
        if (res) {
            return "valid";
        } else {
            return "invalid";
        }
    }
}
