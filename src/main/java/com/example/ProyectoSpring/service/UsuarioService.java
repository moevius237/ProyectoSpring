package com.example.ProyectoSpring.service;

import com.example.ProyectoSpring.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public long numero(){
        return usuarioRepository.count();
    }
}
