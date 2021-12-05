package com.example.websockettest.repos;

import com.example.websockettest.entity.Creature;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CreatureRepository extends MongoRepository<Creature, String> {
    public Creature findByName(String name);
    public List<Creature> findAll();
}
