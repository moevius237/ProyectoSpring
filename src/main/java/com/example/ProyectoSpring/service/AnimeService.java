package com.example.ProyectoSpring.service;

import com.example.ProyectoSpring.entities.Anime;
import com.example.ProyectoSpring.repository.AnimeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimeService {
    private final AnimeRepository animeRepository;

    public AnimeService(AnimeRepository animeRepository) {
        this.animeRepository = animeRepository;
    }
    public List<Anime>findAll(){
        return animeRepository.findAll();
    }

    public List<Anime> GetFirstOrdertituloDesc(){
        return animeRepository.findByOrderByTituloDesc();
    }

}
