package com.example.websockettest.entity;

import com.example.websockettest.model.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Map;

@Getter
@Setter
@Document(collection = "players")
public class Character {
    @Id
    public String id;

    Boolean active;
    String backStory;
    String role;
    String name;
    String username;
    User player;
    String gender;
    Stat age;
    String hair;
    String eyes;
    String skin;
    Stat height;
    Stat weight;
    String alignment;
    Stat size;
    ArrayList<String> diety;
    Map<String,Double> race;
    Integer reach;
    Stat experience;
    ArrayList<LearningClass> classes;
    ArrayList<Attribute> auras;
    ArrayList<Attribute> senses;
    Stat hitpoint;
    Integer damage;
    Purse purse;
    ArrayList<Attribute> languages;
    ArrayList<String> toolProfs;
    ArrayList<String> weaponProfs;
    ArrayList<String> armorProfs;
    ArrayList<Attribute> abilities;
    ArrayList<Attribute> abilityMods;
    ArrayList<Skill> skills;
    ArrayList<Attribute> allSaves;
    Stat armorClass;
    Stat initiative;
    Stat speed;
    Stat encumbrance;
    Stat carriedWeight;
    ArrayList<Inventory> inventories;
    ArrayList<Spell> spells;
    ArrayList<Special> specials;
    ArrayList<Arms> weapons;
    ArrayList<Arms> defenses;
}
