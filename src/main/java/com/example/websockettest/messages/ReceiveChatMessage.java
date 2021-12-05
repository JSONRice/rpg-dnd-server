package com.example.websockettest.messages;

import java.time.LocalDateTime;

public class ReceiveChatMessage {
    private String body;
    private String source;
    private LocalDateTime timestamp;

    public ReceiveChatMessage() {
    }

    public ReceiveChatMessage(String body, String source, LocalDateTime timestamp) {
        this.body = body;
        this.source = source;
        this.timestamp = timestamp;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
