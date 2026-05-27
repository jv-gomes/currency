package com.currency.currencyservice.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    public static final String CONVERSION_HISTORY_QUEUE = "conversion.history.queue";

    @Bean
    public Queue conversionHistoryQueue() {
        return new Queue(CONVERSION_HISTORY_QUEUE, true);
    }
}
