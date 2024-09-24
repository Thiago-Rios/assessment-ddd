package com.infnet.petfriendsalmoxarifado.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor@NoArgsConstructor
public class PedidoCriadoEvent {

    private Long pedidoId;
    private String status;
    private String produtos;
    private LocalDate dataCriacao;
}