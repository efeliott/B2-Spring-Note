package com.example.TP2;

import com.example.TP2.service.NoteService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TP2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(TP2Application.class, args);
		NoteService noteService = configurableApplicationContext.getBean(NoteService.class);

	}
}