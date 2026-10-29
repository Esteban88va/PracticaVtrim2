package com.sena.esteban.servicesImplement;
import org.springframework.stereotype.Service;

import com.sena.esteban.dtos.UsuarioDto;
import com.sena.esteban.mappers.UsuarioMapper;
import com.sena.esteban.models.usuarios.Usuario;
import com.sena.esteban.repositoryes.UsuarioRepository;
import com.sena.esteban.services.UsuarioServices;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor


public class UsuarioServicesImpl implements UsuarioServices {

private final UsuarioRepository usuarioRepository;
    private final UsuarioMapper usuarioMapper;

    @Override
    public UsuarioDto guardar(UsuarioDto usuarioDto) {
        Usuario usuario = usuarioMapper.convierteaEntidad(usuarioDto);
        Usuario usuarioGuardado = usuarioRepository.save(usuario);
        return usuarioMapper.convierteaDto(usuarioGuardado);
    }
}
