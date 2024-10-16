package com.burningeagle.aiTestSolution.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/chat")
public class OpenAiChatController {

    private final ChatClient chatClient;

    public OpenAiChatController(@Qualifier("openAIChatClient") ChatClient chatClient){
        this.chatClient = chatClient;
    }

    @GetMapping("/openai")
    public String openai(@RequestBody String prompt){
        return chatClient.prompt()
                .user(prompt)
                .call()
                .content();
    }
}
