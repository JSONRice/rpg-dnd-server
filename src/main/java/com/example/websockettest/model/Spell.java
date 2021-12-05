package com.example.websockettest.model;

import java.util.Arrays;
import java.util.List;

public class Spell {
     String name;
     String type;
     Integer level;
     String castTime;
     Double range;
     String duration;
     Double dc;
     Integer casterLevel;
     List<String> components;
     List<String> schools;
     Integer castsLeft;
     Boolean unlimited;
     String description;
     List<String> traits;

     public Spell(){}

        public Spell(String name, String type, Integer level, String castTime, Double range, String duration, Double dc, Integer casterLevel, List<String> components, List<String> schools, Integer castsLeft, Boolean unlimited, String description, List<String> traits) {
            this.name = name;
            this.type = type;
            this.level = level;
            this.castTime = castTime;
            this.range = range;
            this.duration = duration;
            this.dc = dc;
            this.casterLevel = casterLevel;
            this.components = components;
            this.schools = schools;
            this.castsLeft = castsLeft;
            this.unlimited = unlimited;
            this.description = description;
            this.traits = traits;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getCastTime() {
        return castTime;
    }

    public void setCastTime(String castTime) {
        this.castTime = castTime;
    }

    public Double getRange() {
        return range;
    }

    public void setRange(Double range) {
        this.range = range;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Double getDc() {
        return dc;
    }

    public void setDc(Double dc) {
        this.dc = dc;
    }

    public Integer getCasterLevel() {
        return casterLevel;
    }

    public void setCasterLevel(Integer casterLevel) {
        this.casterLevel = casterLevel;
    }

    public List<String> getComponents() {
        return components;
    }

    public void setComponents(List<String> components) {
        this.components = components;
    }

    public List<String> getSchools() {
        return schools;
    }

    public void setSchools(List<String> schools) {
        this.schools = schools;
    }

    public Integer getCastsLeft() {
        return castsLeft;
    }

    public void setCastsLeft(Integer castsLeft) {
        this.castsLeft = castsLeft;
    }

    public Boolean getUnlimited() {
        return unlimited;
    }

    public void setUnlimited(Boolean unlimited) {
        this.unlimited = unlimited;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getTraits() {
        return traits;
    }

    public void setTraits(List<String> traits) {
        this.traits = traits;
    }

    @Override
    public String toString() {
        return "Spell{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", level=" + level +
                ", castTime='" + castTime + '\'' +
                ", range=" + range +
                ", duration='" + duration + '\'' +
                ", dc=" + dc +
                ", casterLevel=" + casterLevel +
                ", components=" + components +
                ", schools=" + schools +
                ", castsLeft=" + castsLeft +
                ", unlimited=" + unlimited +
                ", description='" + description + '\'' +
                ", traits=" + traits +
                '}';
    }
}
