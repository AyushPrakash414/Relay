package controller;

import Entity.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

    @MessageMapping("/SendMessages")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage (ChatMessage messages)
    {
        return messages;
    }

    @GetMapping("chat")
    public String chat()
    {
        return "chat";
    }



}
