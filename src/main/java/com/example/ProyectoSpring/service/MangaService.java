package com.example.ProyectoSpring.service;

import com.example.ProyectoSpring.entities.Manga;
import com.example.ProyectoSpring.repository.MangaRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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

    public List<Manga> GetMangasFinalizado(){
        return mangaRepository.encontrarMangasFinalizado();
    }
    public void delete(long id){
        mangaRepository.deleteById(id);
    }
    public List<Manga> GetMangaAutor(){
        return mangaRepository.encontrarMangasAutor();
    }

    public List<Manga> GetMangaPageable(Integer pageNo, Integer pageSize, String sortBY, Sort.Direction orderby){
        Pageable pageable = PageRequest.of(pageNo,pageSize,Sort.by(orderby,sortBY));
        return mangaRepository.findAll(pageable).getContent();
    }
}
