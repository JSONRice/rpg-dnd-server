package com.example.websockettest.Service;

import com.example.websockettest.model.*;
import com.example.websockettest.model.Character;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;

import java.io.File;
import java.io.IOException;
import java.util.Base64;
import java.util.List;


public class MessageFactory {
    private String strMessage;
    private GameMessage inMessage;
    private GameMessage outMessage;
    private SimpMessageHeaderAccessor sha;
    private List<String> dest;
    private String type;

    ObjectMapper objMapper = new ObjectMapper();

    public MessageFactory() {
    }

    public MessageFactory convertToGameMessage(String stringMessage){
        try {
            this.inMessage = objMapper.readValue(stringMessage, GameMessage.class);
            this.dest = inMessage.getDest();
            this.type = inMessage.getType();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return this;
    }

    public String processOutboundGameMessage(SimpMessageHeaderAccessor sha) throws IOException {
        this.sha = sha;
        this.outMessage = new GameMessage(inMessage);
        switch( this.type){
            case "party":
                outMessage.addSystemTime();
                return convertMessageToString(outMessage);
            case "private":
                String sender = sha.getUser().getName();
                outMessage.addSystemTime(sender);
                return convertMessageToString(outMessage);
            case "action":
            case "character":
                return convertMessageToString(outMessage);
            case "image":
                return convertImagesToString(outMessage);
            case "lore":
            default: return null;
        }
    }

    private String convertImagesToString(GameMessage msg) throws IOException {
        File mapFile = new File("C:\\development\\maps\\testwebmap.jpg");
        byte[] fileContent = FileUtils.readFileToByteArray(mapFile);
        String encodedString = Base64.getEncoder().encodeToString(fileContent);
        msg.setData(encodedString);
        String strMsg = objMapper.writeValueAsString(msg);
        return strMsg;
    }

    public String convertMessageToString(GameMessage msg){
        String strMsg = "";
        String strObj = "";
        try {
            if(!this.type.equals("character")) {

                strMsg = objMapper.writeValueAsString(msg);
            } else {
                Character charObj = objMapper.readValue(new File("C:\\projects\\rpg-ui\\src\\data\\rollo.json"), Character.class);
                strObj = objMapper.writeValueAsString(charObj);
                msg.setData(strObj);
                strMsg = objMapper.writeValueAsString(msg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            return strMsg;
        }
    }

    /*Getters and Setters */

    public String getStrMessage() {
        return strMessage;
    }

    public void setStrMessage(String strMessage) {
        this.strMessage = strMessage;
    }

    public GameMessage getInMessage() {
        return inMessage;
    }

    public void setInMessage(GameMessage inMessage) {
        this.inMessage = inMessage;
    }

    public List<String> getDest() {
        return dest;
    }

    public void setDest(List<String> dest) {
        this.dest = dest;
    }
}
