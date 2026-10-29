package com.sena.esteban.repositoryes;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.esteban.models.usuarios.Trabajador;

public interface TrabajadorRepository extends JpaRepository<Trabajador, Long> {

}
