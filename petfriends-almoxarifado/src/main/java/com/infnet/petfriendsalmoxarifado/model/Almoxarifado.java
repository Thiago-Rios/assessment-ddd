package com.infnet.petfriendsalmoxarifado.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@AllArgsConstructor@NoArgsConstructor
@Entity
public class Almoxarifado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String localizacao;

    @Embedded
    private Estoque estoque;
}
