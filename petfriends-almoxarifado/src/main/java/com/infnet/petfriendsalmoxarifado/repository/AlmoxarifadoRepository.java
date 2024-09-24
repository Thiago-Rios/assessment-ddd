package com.infnet.petfriendsalmoxarifado.repository;

import com.infnet.petfriendsalmoxarifado.model.Almoxarifado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlmoxarifadoRepository extends JpaRepository<Almoxarifado, Long> {
}
