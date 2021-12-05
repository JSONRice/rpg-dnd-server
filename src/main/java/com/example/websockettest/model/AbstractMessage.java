package com.example.websockettest.model;

import lombok.*;

import java.util.List;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AbstractMessage {
    private Long id;
    private String type;
    private Object body;
    private List<String> dest;
    private Map<String, Object> options;
}
