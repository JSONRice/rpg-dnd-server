package com.example.websockettest.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class JsonPojo {
    private String name;
    private Map<String,Double> race = new HashMap<>();
    private List<String> dieties = new ArrayList<>();

    public JsonPojo setTestValues(){
        this.name = "Lumpy";
        race.put("elf",.50);
        race.put("human",.25);
        race.put("gnome",.25);
        dieties.add("Zeus");
        dieties.add("Odin");
        return this;
    }
    /*
    @JsonAnySetter
    public void add(String key, Double value) {
        race.put(key, value);
    }

    @JsonAnyGetter
    public Map<String, Double> getRace() {
        return race;
    }
    */


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getDieties() {
        return dieties;
    }

    public void setDieties(List<String> dieties) {
        this.dieties = dieties;
    }

    public Map<String, Double> getRace() {
        return race;
    }

    public void setRace(Map<String, Double> race) {
        this.race = race;
    }

    @Override
    public String toString() {
        return "TestClassForJackson{" +
                "name='" + name + '\'' +
                ", race=" + race +
                ", dieties=" + dieties +
                '}';
    }
}
