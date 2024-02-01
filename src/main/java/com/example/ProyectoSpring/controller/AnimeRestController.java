package com.example.ProyectoSpring.controller;

import com.example.ProyectoSpring.entities.Anime;
import com.example.ProyectoSpring.service.AnimeService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Tag(name = "Anime and Manga Api", description = "Spring application with spting-boot 3.x")
@RestController
@RequestMapping("/anime")
public class AnimeRestController implements AnimesApi{

    private final AnimeService animeService;

    public AnimeRestController(AnimeService animeService) {
        this.animeService = animeService;
    }


    @GetMapping("/all")
    public List<Anime> getAnimes(){
        return animeService.findAll();
    }

    @GetMapping("/first")
    public List<Anime> getFirstOrderBytituloDesc(){
        return animeService.GetFirstOrdertituloDesc();
    }


    @Override
    public List<Anime> getAnime() {
        return null;
    }
}


