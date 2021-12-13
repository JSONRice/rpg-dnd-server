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
    ArrayList<Attribute> toolProfs;
    ArrayList<Attribute> weaponProfs;
    ArrayList<Attribute> armorProfs;
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

    public Character() {
    }

    public Character(Boolean active, String backStory, String role, String name, User player, String gender, Stat age, String hair, String eyes, String skin, Stat height, Stat weight, String alignment, Stat size, ArrayList<String> diety, Map<String, Double> race, Integer reach, Stat experience, ArrayList<LearningClass> classes, ArrayList<Attribute> auras, ArrayList<Attribute> senses, Stat hitpoint, Integer damage, Purse purse, ArrayList<Attribute> languages, ArrayList<Attribute> toolProfs, ArrayList<Attribute> weaponProfs, ArrayList<Attribute> armorProfs, ArrayList<Attribute> abilities, ArrayList<Attribute> abilityMods, ArrayList<Skill> skills, ArrayList<Attribute> allSaves, Stat armorClass, Stat initiative, Stat speed, Stat encumbrance, Stat carriedWeight, ArrayList<Inventory> inventories, ArrayList<Spell> spells, ArrayList<Special> specials, ArrayList<Arms> weapons, ArrayList<Arms> defenses, String username) {
        this.active = active;
        this.backStory = backStory;
        this.role = role;
        this.name = name;
        this.player = player;
        this.gender = gender;
        this.age = age;
        this.hair = hair;
        this.eyes = eyes;
        this.skin = skin;
        this.height = height;
        this.weight = weight;
        this.alignment = alignment;
        this.size = size;
        this.diety = diety;
        this.race = race;
        this.reach = reach;
        this.experience = experience;
        this.classes = classes;
        this.auras = auras;
        this.senses = senses;
        this.hitpoint = hitpoint;
        this.damage = damage;
        this.purse = purse;
        this.languages = languages;
        this.toolProfs = toolProfs;
        this.weaponProfs = weaponProfs;
        this.armorProfs = armorProfs;
        this.abilities = abilities;
        this.abilityMods = abilityMods;
        this.skills = skills;
        this.allSaves = allSaves;
        this.armorClass = armorClass;
        this.initiative = initiative;
        this.speed = speed;
        this.encumbrance = encumbrance;
        this.carriedWeight = carriedWeight;
        this.inventories = inventories;
        this.spells = spells;
        this.specials = specials;
        this.weapons = weapons;
        this.defenses = defenses;
        this.username = username;
    }
}
