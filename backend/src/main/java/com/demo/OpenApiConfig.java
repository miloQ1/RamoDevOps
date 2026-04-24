package com.demo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "API DevOps Demo",
        version = "1.0",
        description = "API Hola Mundo con PostgreSQL"
    )
)
public class OpenApiConfig {
}