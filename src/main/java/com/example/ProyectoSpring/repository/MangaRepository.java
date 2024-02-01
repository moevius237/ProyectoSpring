package com.example.ProyectoSpring.repository;

import com.example.ProyectoSpring.entities.Anime;
import com.example.ProyectoSpring.entities.Manga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MangaRepository extends JpaRepository<Manga, Long> {
    @Query("Select t FROM Manga t where t.emision = true")
    List<Anime> encontrarMangasFinalizado();

    List<Manga> findByOrderByTituloDesc();

}

