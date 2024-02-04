package com.example.ProyectoSpring.controller;

import com.example.ProyectoSpring.entities.Anime;
import com.example.ProyectoSpring.entities.Manga;
import com.example.ProyectoSpring.service.MangaService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
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

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteManga(@PathVariable Long id){
        mangaService.delete(id);
        return new ResponseEntity<>("The manga was deleted", HttpStatus.ACCEPTED);
    }


    @GetMapping("/completed")
    public List<Manga> getCompleted(){
        return mangaService.GetMangasFinalizado();
    }

    @GetMapping("/MismoAutor")
    public List<Manga> getAutor(){
        return mangaService.GetMangaAutor();
    }
    @GetMapping("/Pageable")
    public List<Manga> getManga(@RequestParam(defaultValue = "0") Integer pageno,
                                @RequestParam(defaultValue = "2") Integer pageSize,
                                @RequestParam(required = false , defaultValue = "titulo") String sortBy,
                                @RequestParam(defaultValue = "ASC") Sort.Direction orderBy){
        return mangaService.GetMangaPageable(pageno-1,pageSize,sortBy,orderBy);
    }


    @Override
    public List<Manga> getManga() {
        return null;
    }
}
