package com.example.websockettest.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Auth {

    private String email;
    private String password;

    public Auth(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
