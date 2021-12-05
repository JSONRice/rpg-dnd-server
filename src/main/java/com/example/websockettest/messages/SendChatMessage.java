package com.example.websockettest.messages;

import java.time.LocalDateTime;

/*
{
    "body": " .... ",
    "channelName": "channel:1",
    "timestamp": "2012-08-06T14:50:32.4321"
}
 */
public class SendChatMessage {
    private String body;
    private String channelName;
    private LocalDateTime timestamp;

    public SendChatMessage() {
    }

    public SendChatMessage(String body, String channelName, LocalDateTime timestamp) {
        this.body = body;
        this.channelName = channelName;
        this.timestamp = timestamp;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
