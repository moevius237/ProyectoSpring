package com.example.ProyectoSpring.service;

import com.example.ProyectoSpring.entities.Anime;
import com.example.ProyectoSpring.entities.Manga;
import com.example.ProyectoSpring.entities.Usuario;
import com.example.ProyectoSpring.repository.AnimeRepository;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration;
import org.springframework.stereotype.Service;

import java.awt.desktop.PreferencesEvent;
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
    public List<Anime> getAnimeAprobados(){
        return animeRepository.animesAprobados();
    }
    public List<Anime>getAnimeNotFinish(){
        return animeRepository.encontrarAnimesSinAcabar();
    }

    public int updateTituloById(Long animeID,String nuevoTitulo){
        return animeRepository.actualizarTituloPorId(animeID,nuevoTitulo);
    }
    public Anime createAnime(Anime anime){
        return animeRepository.save(anime);
    }
}
