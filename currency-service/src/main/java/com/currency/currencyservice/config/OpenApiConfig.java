package com.currency.currencyservice.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI currencyOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Currency Service API")
                        .description("APIs para conversão de moedas")
                        .version("v1"));
    }
}
