package com.currency.historyservice.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ConversionHistoryConsumer {

    @RabbitListener(queues = "conversion.history.queue")
    public void consume(String payload) {
        // Boilerplate inicial de consumo; implementação detalhada em etapa futura.
    }
}
