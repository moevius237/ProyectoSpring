package com.example.ProyectoSpring.service;

import com.example.ProyectoSpring.controller.MangaRestController;
import com.example.ProyectoSpring.entities.Anime;
import com.example.ProyectoSpring.entities.Manga;
import com.example.ProyectoSpring.repository.MangaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MangaService {

    private final MangaRepository mangaRepository;

    public MangaService(MangaRepository mangaService) {
        this.mangaRepository = mangaService;
    }
    public List<Manga> findAll(){
        return mangaRepository.findAll();
    }
    public void deletebyTittle(String text){

    }
    public List<Manga> GetFirstOrdertituloDesc(){
        return mangaRepository.findByOrderByTituloDesc();
    }
}
