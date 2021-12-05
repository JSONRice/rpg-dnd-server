package com.example.websockettest.model;

import java.util.Arrays;

public class Arms {
    String name;
    String[] category;
    String[] type;
    Double attack;
    String damage;
    Boolean proficient;
    Stat range;
    String special;

    public Arms() {
    }

    public Arms(String name, String[] category, String[] type, Double attack, String damage,
                Boolean proficient, Stat range, String special) {
        this.name = name;
        this.category = category;
        this.type = type;
        this.attack = attack;
        this.damage = damage;
        this.proficient = proficient;
        this.range = range;
        this.special = special;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getCategory() {
        return category;
    }

    public void setCategory(String[] category) {
        this.category = category;
    }

    public String[] getType() {
        return type;
    }

    public void setType(String[] type) {
        this.type = type;
    }

    public Double getAttack() {
        return attack;
    }

    public void setAttack(Double attack) {
        this.attack = attack;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public Boolean getProficient() {
        return proficient;
    }

    public void setProficient(Boolean proficient) {
        this.proficient = proficient;
    }

    public Stat getRange() {
        return range;
    }

    public void setRange(Stat range) {
        this.range = range;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", category=" + Arrays.toString(category) +
                ", type=" + Arrays.toString(type) +
                ", attack=" + attack +
                ", damage='" + damage + '\'' +
                ", proficient=" + proficient +
                ", range=" + range +
                ", special='" + special + '\'' +
                '}';
    }
}
