package com.example.ProyectoSpring.repository;

import com.example.ProyectoSpring.entities.Anime;
import com.example.ProyectoSpring.entities.Manga;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AnimeRepository extends JpaRepository<Anime,Long> {
    @Query("Select t FROM Anime t where t.emision = false")
    List<Anime> encontrarAnimesSinAcabar();
    @Modifying
    @Transactional
    @Query("UPDATE Anime t SET t.titulo = :nuevoTitulo WHERE t.id = :animeID")
    int actualizarTituloPorId(Long animeID, String nuevoTitulo);

    @Query("SELECT a FROM Anime a JOIN a.nota n WHERE n.nota > 5")
    List<Anime> animesAprobados();

    List<Anime> findByOrderByTituloDesc();

}
