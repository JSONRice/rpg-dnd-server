package com.example.websockettest.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class StompMapMessage extends GameMessage {
}
