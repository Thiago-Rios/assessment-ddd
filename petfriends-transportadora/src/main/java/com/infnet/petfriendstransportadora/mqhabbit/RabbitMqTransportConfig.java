package com.infnet.petfriendstransportadora.mqhabbit;

import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.RabbitListenerContainerFactory;
import org.springframework.context.annotation.Bean;

@Configuration
@EnableRabbit
public class RabbitMqTransportConfig {
    public static final String EXCHANGE_NAME = "transporte.exchange";
    public static final String QUEUE_NAME = "transporte.queue";
    public static final String ROUTING_KEY = "pedido.despachado.rk";

    @Bean
    Queue transporteQueue() {
        return new Queue(QUEUE_NAME, false);
    }

    @Bean
    TopicExchange transporteExchange() {
        return new TopicExchange(EXCHANGE_NAME);
    }

    @Bean
    Binding transporteBinding(Queue transporteQueue, TopicExchange transporteExchange) {
        return BindingBuilder.bind(transporteQueue).to(transporteExchange).with(ROUTING_KEY);
    }

    @Bean
    public RabbitListenerContainerFactory<?> transporteListenerContainerFactory(ConnectionFactory connectionFactory) {
        SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
        factory.setConnectionFactory(connectionFactory);
        return factory;
    }
}