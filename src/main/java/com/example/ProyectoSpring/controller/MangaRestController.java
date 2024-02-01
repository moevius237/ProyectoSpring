package com.example.ProyectoSpring.controller;

import com.example.ProyectoSpring.entities.Anime;
import com.example.ProyectoSpring.entities.Manga;
import com.example.ProyectoSpring.service.MangaService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Anime and Manga Api", description = "Spring application with spting-boot 3.x")
@RestController
@RequestMapping("/manga")
public class MangaRestController implements MangasApi{
    private final MangaService mangaService;

    public MangaRestController(MangaService mangaService) {
        this.mangaService = mangaService;
    }

    @GetMapping("/all")
    public List<Manga> getAnimes(){
        return mangaService.findAll();
    }

    @GetMapping("/first")
    public List<Manga> getFirstOrderBytituloDesc(){
        return mangaService.GetFirstOrdertituloDesc();
    }


    public List<Manga> getManga() {
        return null;
    }
}
