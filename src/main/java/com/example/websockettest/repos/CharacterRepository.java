package com.example.websockettest.repos;

import com.example.websockettest.entity.Character;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CharacterRepository extends MongoRepository<Character, String> {
    public Character findByUsername(String username);
}
