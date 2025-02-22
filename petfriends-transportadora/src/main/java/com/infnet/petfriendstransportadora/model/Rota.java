package com.infnet.petfriendstransportadora.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor@AllArgsConstructor
@Embeddable
public class Rota {
    private String origem;
    private String destino;
}
