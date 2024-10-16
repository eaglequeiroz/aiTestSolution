package com.burningeagle.aiTestSolution;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AiTestSolutionApplication {

	public static void main(String[] args) {
		SpringApplication.run(AiTestSolutionApplication.class, args);
	}

	@Bean
	public ChatClient openAIChatClient(OpenAiChatModel chatModel){
		return ChatClient.create(chatModel);
	}

}
