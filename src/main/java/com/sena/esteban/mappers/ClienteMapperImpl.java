package com.sena.esteban.mappers;

import org.springframework.stereotype.Component;

import com.sena.esteban.dtos.ClienteDto;
import com.sena.esteban.models.usuarios.Cliente;

@Component
public class ClienteMapperImpl implements ClienteMapper {

    // convertir de Cliente a ClienteDto
    @Override
    public ClienteDto toDto (Cliente cliente) {
      // valida que tenga datos
        if (cliente == null) {
            return null;
        }
        // convertir de cliente a clienteDto
        return ClienteDto.builder()
                // atributos de usuario
                .id(cliente.getId())
                .nomb(cliente.getNom())
                .apell(cliente.getApe())
                .direc(cliente.getDir())


                // atributos de clienteDto
                .tipCli(cliente.getTipoCliente())
                .pts(cliente.getPuntos())
                .build();
    }

        @Override
public Cliente toCliente(ClienteDto clienteDto) {
    // valida que tenga datos
    if (clienteDto == null) {
        return null;
    }
    // convertir de clienteDto a cliente
    return Cliente.builder()
    // atributos de usuario
    .id(clienteDto.getId())
    .nom(clienteDto.getNomb())
    .ape(clienteDto.getApell())
    .dir(clienteDto.getDirec())
    .tel(clienteDto.getTele())
    // atributos de cliente
    .tipoCliente(clienteDto.getTipCli())
    .puntos(clienteDto.getPts())
    .build();
}
}