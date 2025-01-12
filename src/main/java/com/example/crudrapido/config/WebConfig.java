package com.example.crudrapido.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Permitir solicitudes desde tu frontend en http://localhost:8081
        registry.addMapping("/api/**")  // Establecer el patrón de URL donde se permite el CORS
                .allowedOrigins("http://localhost:8081")  // El frontend que tiene acceso
                .allowedMethods("GET", "POST", "PUT", "DELETE")  // Los métodos HTTP permitidos
                .allowedHeaders("*")  // Permitir cualquier tipo de encabezado
                .allowCredentials(true);  // Permitir el envío de credenciales (opcional)
    }
}