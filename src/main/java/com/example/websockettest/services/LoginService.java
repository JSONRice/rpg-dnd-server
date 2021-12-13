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

    /**
     * Returns null if the password of the user doesn't match the password provided. This can
     * happen if the user doesn't exist or if the two don't match
     *
     * @param username to match against
     * @param password to match against
     * @return can be null or a Character
     */
    public Character authenticate(String username, String password) {
        String passwd = credentials.get(username);
        if (password.equals(passwd)) {
            return characterRepository.findByUsername(username);
        }

        return null;
    }
}
