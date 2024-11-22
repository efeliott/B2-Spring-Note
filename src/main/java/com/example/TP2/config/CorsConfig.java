package com.example.TP2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/**")
                        .allowedOrigins("http://localhost:5173") // Autorise le front-end React
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Autorise les méthodes HTTP
                        .allowedHeaders("*") // Autorise tous les headers
                        .allowCredentials(true); // Autorise les cookies ou credentials si nécessaires
            }
        };
    }
}