package com.example.websockettest.services;

import com.example.websockettest.entity.Character;
import com.example.websockettest.repos.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class LoginService {

    @Autowired
    private CharacterRepository characterRepository;

    // TODO: figure out a safe place for the credentials (this is obviously temporary)
    private final HashMap<String, String> credentials = new HashMap<>() {{
        put("jsnrice", "My$ig5ecretP@sswd");
        put("rlongo", "D&Dm@s$er4evEr");
    }};

    public Character authenticate(String username, String password) {
        String passwd = credentials.get(username);
        if (password.equals(passwd)) {
            return characterRepository.findByUsername(username);
        }

        return (Character) new Object();
    }
}
