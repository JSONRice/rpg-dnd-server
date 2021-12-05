package com.example.websockettest.model;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.Map;


public class Character {
    @Id
    public String id;

    Boolean active;
    String backStory;
    String role;
    String name;
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

    public Character() {
    }

    public Character(Boolean active, String backStory, String role, String name, User player, String gender, Stat age, String hair, String eyes, String skin, Stat height, Stat weight, String alignment, Stat size, ArrayList<String> diety, Map<String, Double> race, Integer reach, Stat experience, ArrayList<LearningClass> classes, ArrayList<Attribute> auras, ArrayList<Attribute> senses, Stat hitpoint, Integer damage, Purse purse, ArrayList<Attribute> languages, ArrayList<Attribute> toolProfs, ArrayList<Attribute> weaponProfs, ArrayList<Attribute> armorProfs, ArrayList<Attribute> abilities, ArrayList<Attribute> abilityMods, ArrayList<Skill> skills, ArrayList<Attribute> allSaves, Stat armorClass, Stat initiative, Stat speed, Stat encumbrance, Stat carriedWeight, ArrayList<Inventory> inventories, ArrayList<Spell> spells, ArrayList<Special> specials, ArrayList<Arms> weapons) {
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
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getBackStory() {
        return backStory;
    }

    public void setBackStory(String backStory) {
        this.backStory = backStory;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getPlayer() {
        return player;
    }

    public void setPlayer(User player) {
        this.player = player;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Stat getAge() {
        return age;
    }

    public void setAge(Stat age) {
        this.age = age;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public String getEyes() {
        return eyes;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public Stat getHeight() {
        return height;
    }

    public void setHeight(Stat height) {
        this.height = height;
    }

    public Stat getWeight() {
        return weight;
    }

    public void setWeight(Stat weight) {
        this.weight = weight;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public Stat getSize() {
        return size;
    }

    public void setSize(Stat size) {
        this.size = size;
    }

    public ArrayList<String> getDiety() {
        return diety;
    }

    public void setDiety(ArrayList<String> diety) {
        this.diety = diety;
    }

    public Map<String, Double> getRace() {
        return race;
    }

    public void setRace(Map<String, Double> race) {
        this.race = race;
    }

    public Integer getReach() {
        return reach;
    }

    public void setReach(Integer reach) {
        this.reach = reach;
    }

    public Stat getExperience() {
        return experience;
    }

    public void setExperience(Stat experience) {
        this.experience = experience;
    }

    public ArrayList<Attribute> getAuras() {
        return auras;
    }

    public void setAuras(ArrayList<Attribute> auras) {
        this.auras = auras;
    }

    public ArrayList<Attribute> getSenses() {
        return senses;
    }

    public void setSenses(ArrayList<Attribute> senses) {
        this.senses = senses;
    }

    public Stat getHitpoint() {
        return hitpoint;
    }

    public void setHitpoint(Stat hitpoint) {
        this.hitpoint = hitpoint;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public Purse getPurse() {
        return purse;
    }

    public void setPurse(Purse purse) {
        this.purse = purse;
    }

    public ArrayList<Attribute> getLanguages() {
        return languages;
    }

    public void setLanguages(ArrayList<Attribute> languages) {
        this.languages = languages;
    }

    public ArrayList<Attribute> getToolProfs() {
        return toolProfs;
    }

    public void setToolProfs(ArrayList<Attribute> toolProfs) {
        this.toolProfs = toolProfs;
    }

    public ArrayList<Attribute> getWeaponProfs() {
        return weaponProfs;
    }

    public void setWeaponProfs(ArrayList<Attribute> weaponProfs) {
        this.weaponProfs = weaponProfs;
    }

    public ArrayList<Attribute> getArmorProfs() {
        return armorProfs;
    }

    public void setArmorProfs(ArrayList<Attribute> armorProfs) {
        this.armorProfs = armorProfs;
    }

    public ArrayList<Attribute> getAbilities() {
        return abilities;
    }

    public void setAbilities(ArrayList<Attribute> abilities) {
        this.abilities = abilities;
    }

    public ArrayList<Attribute> getAbilityMods() {
        return abilityMods;
    }

    public void setAbilityMods(ArrayList<Attribute> abilityMods) {
        this.abilityMods = abilityMods;
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<Skill> skills) {
        this.skills = skills;
    }

    public ArrayList<Attribute> getAllSaves() {
        return allSaves;
    }

    public void setAllSaves(ArrayList<Attribute> allSaves) {
        this.allSaves = allSaves;
    }

    public Stat getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(Stat armorClass) {
        this.armorClass = armorClass;
    }

    public Stat getInitiative() {
        return initiative;
    }

    public void setInitiative(Stat initiative) {
        this.initiative = initiative;
    }

    public Stat getSpeed() {
        return speed;
    }

    public void setSpeed(Stat speed) {
        this.speed = speed;
    }

    public Stat getEncumbrance() {
        return encumbrance;
    }

    public void setEncumbrance(Stat encumbrance) {
        this.encumbrance = encumbrance;
    }

    public Stat getCarriedWeight() {
        return carriedWeight;
    }

    public void setCarriedWeight(Stat carriedWeight) {
        this.carriedWeight = carriedWeight;
    }

    public ArrayList<Inventory> getInventories() {
        return inventories;
    }

    public void setInventories(ArrayList<Inventory> inventories) {
        this.inventories = inventories;
    }

    public ArrayList<Spell> getSpells() {
        return spells;
    }

    public void setSpells(ArrayList<Spell> spells) {
        this.spells = spells;
    }

    public ArrayList<LearningClass> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<LearningClass> classes) {
        this.classes = classes;
    }

    public ArrayList<Special> getSpecials() {
        return specials;
    }

    public void setSpecials(ArrayList<Special> specials) {
        this.specials = specials;
    }

    public ArrayList<Arms> getWeapons() { return weapons; }

    public void setWeapons(ArrayList<Arms> weapons) { this.weapons = weapons;}

    @Override
    public String toString() {
        return "Character{" +
                "active=" + active +
                ", backStory='" + backStory + '\'' +
                ", role='" + role + '\'' +
                ", name='" + name + '\'' +
                ", player=" + player +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", hair='" + hair + '\'' +
                ", eyes='" + eyes + '\'' +
                ", skin='" + skin + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", alignment='" + alignment + '\'' +
                ", size=" + size +
                ", diety=" + diety +
                ", race=" + race +
                ", reach=" + reach +
                ", experience=" + experience +
                ", classes=" + classes +
                ", auras=" + auras +
                ", senses=" + senses +
                ", hitpoint=" + hitpoint +
                ", damage=" + damage +
                ", purse=" + purse +
                ", languages=" + languages +
                ", toolProfs=" + toolProfs +
                ", weaponProfs=" + weaponProfs +
                ", armorProfs=" + armorProfs +
                ", abilities=" + abilities +
                ", abilityMods=" + abilityMods +
                ", skills=" + skills +
                ", allSaves=" + allSaves +
                ", armorClass=" + armorClass +
                ", initiative=" + initiative +
                ", speed=" + speed +
                ", encumbrance=" + encumbrance +
                ", carriedWeight=" + carriedWeight +
                ", inventories=" + inventories +
                ", spells=" + spells +
                ", specials=" + specials +
                ", weapons=" + weapons +
                '}';
    }
}
