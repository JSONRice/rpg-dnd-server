package com.example.websockettest.model;

public class Purse {
    Integer platinum;
    Integer gold;
    Integer electrum;
    Integer silver;
    Integer copper;

    public Purse() {
    }

    public Purse(Integer platinum, Integer gold, Integer electrum, Integer silver, Integer copper) {
        this.platinum = platinum;
        this.gold = gold;
        this.electrum = electrum;
        this.silver = silver;
        this.copper = copper;
    }

    public Integer getPlatinum() {
        return platinum;
    }

    public void setPlatinum(Integer platinum) {
        this.platinum = platinum;
    }

    public Integer getGold() {
        return gold;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }

    public Integer getElectrum() {
        return electrum;
    }

    public void setElectrum(Integer electrum) {
        this.electrum = electrum;
    }

    public Integer getSilver() {
        return silver;
    }

    public void setSilver(Integer silver) {
        this.silver = silver;
    }

    public Integer getCopper() {
        return copper;
    }

    public void setCopper(Integer copper) {
        this.copper = copper;
    }
}
