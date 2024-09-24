package com.infnet.petfriendstransportadora.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor@NoArgsConstructor
public class PedidoDespachadoEvent {

    private Long pedidoId;
    private String enderecoEntrega;
    private String statusTransporte;
}