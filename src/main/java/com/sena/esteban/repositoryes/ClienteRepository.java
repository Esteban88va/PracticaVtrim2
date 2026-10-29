package com.sena.esteban.repositoryes;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.esteban.models.usuarios.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
