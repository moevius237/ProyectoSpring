package com.example.ProyectoSpring.repository;

import com.example.ProyectoSpring.entities.Anime;
import com.example.ProyectoSpring.entities.Manga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MangaRepository extends JpaRepository<Manga, Long> {
    @Query("Select t FROM Manga t where t.emision = true")
    List<Manga> encontrarMangasFinalizado();

    List<Manga> findByOrderByTituloDesc();

    @Query("SELECT t FROM Manga t JOIN Manga t2 ON t.autor = t2.autor WHERE t.id <> t2.id")
    List<Manga> encontrarMangasAutor();
}

