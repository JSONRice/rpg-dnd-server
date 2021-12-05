package com.example.websockettest.model;

public class Stat {
    Double raw;      //non adjusted value
    Double adj;      //adjusted value

    public Stat() {
    }

    public Stat(Double raw, Double adj) {
        this.raw = raw;
        this.adj = adj;
    }

    public Double getRaw() {
        return raw;
    }

    public void setRaw(Double raw) {
        this.raw = raw;
    }

    public Double getAdj() {
        return adj;
    }

    public void setAdj(Double adj) {
        this.adj = adj;
    }

    @Override
    public String toString() {
        return "Stat{" +
                ", raw=" + raw +
                ", adj=" + adj +
                '}';
    }
}
