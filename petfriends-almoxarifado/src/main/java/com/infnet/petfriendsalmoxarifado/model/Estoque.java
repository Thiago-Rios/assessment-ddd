package com.infnet.petfriendsalmoxarifado.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor@AllArgsConstructor
@Embeddable
public class Estoque {
    private int quantidade;
    private String unidadeMedida;
}
