package com.currency.historyservice.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI historyOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("History Service API")
                        .description("APIs de histórico de conversão")
                        .version("v1"));
    }
}
