package com.serkomma.notifyertelegrambot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.serkomma.*")
public class NoteeFireTelegramBotApplication {

    public static void main(String[] args) {
        SpringApplication.run(NoteeFireTelegramBotApplication.class, args);
    }

}
