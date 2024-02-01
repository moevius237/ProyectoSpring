package com.example.ProyectoSpring.repository;

import com.example.ProyectoSpring.entities.Anime;
import com.example.ProyectoSpring.entities.Manga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AnimeRepository extends JpaRepository<Anime,Long> {
    @Query("Select t FROM Anime t where t.emision = true")
    List<Anime> encontrarAnimesFinalizados();

    List<Anime> findByOrderByTituloDesc();

}
