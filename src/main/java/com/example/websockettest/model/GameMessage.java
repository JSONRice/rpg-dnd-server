package com.example.websockettest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GameMessage{
    private Long id;
    private String type;
    private String data;
    private List<String> dest;


    public GameMessage (GameMessage msg){
        this.id = msg.getId();
        this.type = msg.getType();
        this.data = msg.getData();
        this.dest = msg.getDest();
    }

    public void addSystemTime(){
        String timeStamp = new SimpleDateFormat("MM.dd.HH.mm.ss").format(new Date());
        String chat = "[" + timeStamp + "]-" + this.getData();
        this.setData(chat);
    }

    public void addSystemTime(String sender){
        String timeStamp = new SimpleDateFormat("MM.dd.HH.mm.ss").format(new Date());
        String chat = "[" + timeStamp + "]-" + "From " + sender + ": " + this.getData();
        this.setData(chat);
    }

}
