package com.example.ProyectoSpring.controller;

import com.example.ProyectoSpring.service.UsuarioService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Anime and Manga Api", description = "Spring application with spting-boot 3.x")
@RestController
@RequestMapping("/usuario")
public class UsuarioRestController{
    public final UsuarioService usuarioService;


    public UsuarioRestController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/count")
    public long NumUsuario(){
        return usuarioService.numero();
    }
}
