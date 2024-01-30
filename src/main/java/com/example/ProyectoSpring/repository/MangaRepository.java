package com.example.ProyectoSpring.repository;

import com.example.ProyectoSpring.entities.Anime;
import com.example.ProyectoSpring.entities.Manga;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MangaRepository extends JpaRepository<Manga, Long> {

}
