package com.example.websockettest.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LegendaryAction {
    private String name;
    private String desc;
    private DC dc;
    private Damage[] damage;
}
