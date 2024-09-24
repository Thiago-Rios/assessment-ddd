package com.infnet.petfriendstransportadora.service;

import com.infnet.petfriendstransportadora.event.PedidoDespachadoEvent;
import com.infnet.petfriendstransportadora.mqhabbit.RabbitMqTransportConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class TransporteEventHandler {
    @RabbitListener(queues = RabbitMqTransportConfig.QUEUE_NAME)
    public void handlePedidoDespachado(PedidoDespachadoEvent event) {
        // Lógica para processar o evento
        System.out.println("Recebido evento de despacho de pedido: " + event.getPedidoId());
    }
}