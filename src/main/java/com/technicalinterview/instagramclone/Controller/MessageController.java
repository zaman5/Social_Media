package com.technicalinterview.instagramclone.Controller;

import com.technicalinterview.instagramclone.Entity.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MessageController {
    @MessageMapping("/message")
    @SendTo("/topic/return-to")
    public Message getContent(@RequestBody Message message){
        try {
            // to profrom processing  as like storing the message in database
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return message;
    }

}
