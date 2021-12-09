package com.example.websockettest.services;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class LoginService {

    // TODO: figure out a safe place for the credentials (this is obviously temporary)
    private final HashMap<String, String> credentials = new HashMap<>() {{
        put("jsnrice", "My$ig5ecretP@sswd");
        put("rlongo", "D&Dm@s$er4evEr");
    }};

    public boolean authenticate(String username, String password) {
        String passwd = credentials.get(username);
        return password.equals(passwd);
    }
}
