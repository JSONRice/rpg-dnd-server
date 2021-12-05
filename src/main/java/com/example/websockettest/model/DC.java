package com.example.websockettest.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DC {
    private Index dcType;
    private int dcValue;
    private String successType;

    public DC() {}

    public DC(Index dcType, int dcValue, String successType) {
        this.dcType = dcType;
        this.dcValue = dcValue;
        this.successType = successType;
    }
}
