package com.example.ProyectoSpring.controller;

import com.example.ProyectoSpring.entities.Anime;
import com.example.ProyectoSpring.entities.Manga;
import com.example.ProyectoSpring.exception.TasksException;
import com.example.ProyectoSpring.service.AnimeService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.*;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
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


    @GetMapping("/update/{id}/{titulo}")
    public int updateTituloAnime(@PathVariable("id")Long id, @PathVariable("titulo")String titulo){
        return animeService.updateTituloById(id, titulo);
    }

    @GetMapping("/all")
    public List<Anime> getAnimes(){
        return animeService.findAll();
    }

    @GetMapping("/first")
    public List<Anime> getFirstOrderBytituloDesc(){
        return animeService.GetFirstOrdertituloDesc();
    }
    @GetMapping("/aprobados")
    public List<Anime> getAnimeAprobado(){
        return animeService.getAnimeAprobados();
    }
    @PostMapping("/new")
    public ResponseEntity<Anime> newAnime(@RequestBody Anime anime){
        Anime anime1 = animeService.createAnime(anime);
        return new ResponseEntity<>(anime1, HttpStatus.NOT_MODIFIED);
    }

    @GetMapping("/notFinish")
    public List<Anime> NotFinis(){
        return animeService.getAnimeNotFinish();
    }

    @GetMapping("/json")
    public String GetJsonAnime(){
        List<Anime> anime = animeService.findAll();
        String filename = "anime.json";
        try {
            FileWriter fileWriter = new FileWriter(filename);
            String conver = jackson(anime);
            fileWriter.write(conver);
            fileWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return filename;
    }
    private String jackson(List<Anime> animeList){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(animeList);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "error";
        }
    }

    @Override
    public List<Anime> getAnime() {
        return null;
    }
}


