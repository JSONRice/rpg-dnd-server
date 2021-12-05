package com.example.websockettest.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Damage {
    private Index damageType;
    private String damageDice;

    public Damage() {
    }

    public Damage(Index damageType, String damageDice) {
        this.damageType = damageType;
        this.damageDice = damageDice;
    }
}
