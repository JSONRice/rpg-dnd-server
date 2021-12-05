package com.example.websockettest.model;

public class LearningClass {
    Integer level;
    String name;
    String spells;
    Integer castLevel;
    Integer spellAttack;
    Integer spellSave;
    String castSource;
    String spellAbility;
    String classHitDice;

    public LearningClass() {
    }

    public LearningClass(Integer level, String name, String spells, Integer castLevel, Integer spellAttack, Integer spellSave, String castSource, String spellAbility, String classHitDice) {
        this.level = level;
        this.name = name;
        this.spells = spells;
        this.castLevel = castLevel;
        this.spellAttack = spellAttack;
        this.spellSave = spellSave;
        this.castSource = castSource;
        this.spellAbility = spellAbility;
        this.classHitDice = classHitDice;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpells() {
        return spells;
    }

    public void setSpells(String spells) {
        this.spells = spells;
    }

    public Integer getCastLevel() {
        return castLevel;
    }

    public void setCastLevel(Integer castLevel) {
        this.castLevel = castLevel;
    }

    public Integer getSpellAttack() {
        return spellAttack;
    }

    public void setSpellAttack(Integer spellAttack) {
        this.spellAttack = spellAttack;
    }

    public Integer getSpellSave() {
        return spellSave;
    }

    public void setSpellSave(Integer spellSave) {
        spellSave = spellSave;
    }

    public String getCastSource() {
        return castSource;
    }

    public void setCastSource(String castSource) {
        this.castSource = castSource;
    }

    public String getSpellAbility() {
        return spellAbility;
    }

    public void setSpellAbility(String spellAbility) {
        this.spellAbility = spellAbility;
    }

    public String getClassHitDice() {
        return classHitDice;
    }

    public void setClassHitDice(String classHitDice) {
        this.classHitDice = classHitDice;
    }

    @Override
    public String toString() {
        return "LearningClass{" +
                "level=" + level +
                ", name='" + name + '\'' +
                ", spells='" + spells + '\'' +
                ", castLevel=" + castLevel +
                ", spellAttack=" + spellAttack +
                ", SpellSave=" + spellSave +
                ", castSource='" + castSource + '\'' +
                ", spellAbility='" + spellAbility + '\'' +
                ", classHitDice='" + classHitDice + '\'' +
                '}';
    }
}
