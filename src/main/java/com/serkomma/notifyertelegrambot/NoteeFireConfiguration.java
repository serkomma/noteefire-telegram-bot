package com.serkomma.notifyertelegrambot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication(exclude = {JdbcTemplateAutoConfiguration.class})
public class NoteeFireConfiguration {
}
