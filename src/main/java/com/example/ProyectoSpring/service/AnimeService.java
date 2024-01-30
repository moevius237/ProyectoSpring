package com.example.ProyectoSpring.service;

import com.example.ProyectoSpring.entities.Anime;
import com.example.ProyectoSpring.repository.AnimeRepository;

import java.util.List;

public class AnimeService {
    private final AnimeRepository animeRepository;

    public AnimeService(AnimeRepository animeRepository) {
        this.animeRepository = animeRepository;
    }
    public List<Anime>findAll(){
        return animeRepository.findAll();
    }

}
