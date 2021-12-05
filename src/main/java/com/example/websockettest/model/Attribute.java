package com.example.websockettest.model;

public class Attribute {
    String name;
    String type;
    Stat stat;

    public Attribute() {
    }

    public Attribute(String name, String type, Stat stat) {
        this.name = name;
        this.type = type;
        this.stat = stat;
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

    public Stat getStat() {
        return stat;
    }

    public void setStat(Stat stat) {
        this.stat = stat;
    }

    @Override
    public String toString() {
        return "Attribute{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", stat=" + stat +
                '}';
    }
}
