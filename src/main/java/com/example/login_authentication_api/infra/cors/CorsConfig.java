package com.example.login_authentication_api.infra.cors;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:4200")  // Angular est bien autorisé ?
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // OPTIONS est bien ajouté ?
                .allowedHeaders("*")  // Autoriser tous les headers
                .allowCredentials(true);  // Autoriser les cookies/tokens
    }
}
