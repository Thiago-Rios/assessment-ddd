package com.infnet.petfriendstransportadora.repository;

import com.infnet.petfriendstransportadora.model.Transporte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransporteRepository extends JpaRepository<Transporte, Long> {
}