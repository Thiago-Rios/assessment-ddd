package com.infnet.petfriendsalmoxarifado.service;

import com.infnet.petfriendsalmoxarifado.event.PedidoCriadoEvent;
import com.infnet.petfriendsalmoxarifado.mqrabbit.RabbitMqAlmoxarifadoConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class PedidoEventHandler {
    @RabbitListener(queues = RabbitMqAlmoxarifadoConfig.QUEUE_NAME)
    public void handlePedidoCriado(PedidoCriadoEvent event) {
        // Aqui ficarão as lógicas para o processamento do evento
        System.out.println("Recebido evento de novo pedido: " + event.getPedidoId());
    }
}