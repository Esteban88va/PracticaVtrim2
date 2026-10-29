package com.sena.esteban.mappers;

import com.sena.esteban.dtos.ClienteDto;
import com.sena.esteban.models.usuarios.Cliente;

public interface ClienteMapper {

    // de Cliente a ClienteDto
    ClienteDto toDto(Cliente cliente);

    // de ClienteDto a Cliente
    Cliente toCliente(ClienteDto clienteDto);
}