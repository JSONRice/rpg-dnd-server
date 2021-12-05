package com.example.websockettest.entity;

import com.example.websockettest.model.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "creatures")
public class Creature {
    @Id
    public String id;

    private String index;
    private String name;
    private String size;
    private String type;
    private String subtype;
    private String alignment;
    private String armorClass;
    private String hitPoints;
    private String hitDice;
    private Speed speed;
    private String[] access;
    private String recordType;
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private Proficiency[] proficiencies;
    private String[] damageVulnerabilities;
    private String[] damageResistances;
    private String[] damageImmunities;
    private String[] conditionImmunities;
    private Senses senses;
    private String languages;
    private int challengeRating;
    private int xp;
    private SpecialAbility[] specialAbilities;
    private Action[] actions;
    private LegendaryAction[] legendaryActions;
}
