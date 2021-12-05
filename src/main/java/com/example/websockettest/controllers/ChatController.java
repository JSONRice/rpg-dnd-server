package com.example.websockettest.controllers;

import com.example.websockettest.Service.MessageFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageExceptionHandler;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.example.websockettest.model.GameMessage;

import java.text.SimpleDateFormat;
import java.util.Date;


@Controller
@CrossOrigin(origins = "http://localhost:7000")
public class ChatController {
    // allows us to programmatically send a message
    private final SimpMessagingTemplate simpMessagingTemplate;

    ObjectMapper objectMapper = new ObjectMapper();
    MessageFactory msgFactory = new MessageFactory();
    @Autowired
    public ChatController(SimpMessagingTemplate simpMessagingTemplate) {
        this.simpMessagingTemplate = simpMessagingTemplate;
    }

    @MessageMapping("/chat")
    public void processMessageToChat(
            @Payload String message,
            SimpMessageHeaderAccessor sha
    ) { try {
        //System.out.println(message);
        //GameMessage stompMsg = objectMapper.readValue(message, GameMessage.class);
        //String timeStamp = new SimpleDateFormat("MM.dd.HH.mm.ss").format(new Date());
        //String chat = "[" + timeStamp + "]-" + stompMsg.getBody();
        //stompMsg.setBody(chat);
        //String returnMessage = objectMapper.writeValueAsString(stompMsg);
        //My attempt at a Message Handler Factory
        String testString = msgFactory.convertToGameMessage(message).processOutboundGameMessage(sha);
        //
        simpMessagingTemplate.convertAndSend("/topic/chat", testString);
    } catch (Exception e) {
            System.out.println(e);
        }
    }

    //instead of using SimpMessagingTemplate, we can use @SendTo or @SendToUser to determine destination
    @MessageMapping("/messages")
    public void processMessageFromClient (@Payload String message, SimpMessageHeaderAccessor sha) throws Exception {
        //String user = sha.getUser().getName();
        //System.out.println(user);
        //String timeStamp = new SimpleDateFormat("MM.dd.HH.mm.ss").format(new Date());
        //String sendMsg = "[" + timeStamp + "]-" + "From " + user + ":" + message;

        String testString = msgFactory.convertToGameMessage(message).processOutboundGameMessage(sha);
        for (String sender: msgFactory.getDest()){
            simpMessagingTemplate.convertAndSendToUser(sender, "/queue/message", testString);
        }
        // return "This is a user message";
    }

    @MessageMapping("/game-app")
    //@MessageMapping("/game-app/queue")
    public void send(SimpMessageHeaderAccessor sha, @Payload String sendToUser) {
        String message = "Hello from " + sha.getUser().getName();

        simpMessagingTemplate.convertAndSendToUser(sendToUser, "/queue/messages", message);
        //simpMessagingTemplate.convertAndSend("/topic/party", "This is a topic.party message");
    }

    @MessageExceptionHandler
    @SendToUser("/queue/errors")
    public String handleException(Throwable exception) {
        return exception.getMessage();
    }
}
    /*
        From Spring tutorial - It's import to remark that, @SendToUser indicates that the return value of a
        message-handling method should be
        sent as a Message to the specified destination(s) prepended with “/user/{username}“ ???
     */
    /*
    @MessageMapping("/chat")
    @SendTo("/topic/chat")
    public void broadcastNews(@Payload String message) {
        this.simpMessagingTemplate.convertAndSend("/topic/party", message);
    }
    */