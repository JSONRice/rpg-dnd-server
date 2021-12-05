package com.example.websockettest.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Speed {
    private String walk;
    private String fly;
    private String swim;

    public Speed() {
    }

    public Speed(String walk, String fly, String swim) {
        this.walk = walk;
        this.fly = fly;
        this.swim = swim;
    }
}
