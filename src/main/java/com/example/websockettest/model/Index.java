package com.example.websockettest.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Index {
    String index;
    String name;
    String url;

    public Index() {
    }

    public Index(String index, String name, String url) {
        this.index = index;
        this.name = name;
        this.url = url;
    }
}

