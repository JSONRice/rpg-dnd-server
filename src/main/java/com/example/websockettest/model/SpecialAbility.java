package com.example.websockettest.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SpecialAbility {

    @Getter
    @Setter
    private static class Usage {
        private String type;
        private int times;
    }

    private String name;
    private String desc;
    private Usage usage;

    public SpecialAbility(String name, String desc, Usage usage) {
        this.name = name;
        this.desc = desc;
        this.usage = usage;
    }

    public SpecialAbility() {}
}
