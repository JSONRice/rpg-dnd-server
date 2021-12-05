package com.example.websockettest.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Action {
    @Getter
    @Setter
    private static class Attack {
        private String name;
        private int count;
        private String type;
    }

    @Getter
    @Setter
    private static class Option {
        private int choose;
        private Attack[][] from;
    }

    @Getter
    @Setter
    private static class Usage {
        private String type;
        private String dice;
        private int minValue;
    }

    @Getter
    @Setter
    private static class AttackOptions {

        @Getter
        @Setter
        private static class From {
            private String name;
            private DC dc;
            private Damage damage;
        }

        private int choose;
        private String type;
        private From[] from;
    }

    private String name;
    private String desc;
    private Option[] options;
    private int attackBonus;
    private Damage[] damage;
    private Usage usage;
    private AttackOptions attackOptions;

    public Action() {
    }
}
