package com.example.ProyectoSpring.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@ToString
@Setter
@Getter
@Entity
@Table(name = "manga")
public class Manga {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String autor;

    @Column(nullable = false)
    private String genero;

    @Column(nullable = false)
    private boolean emision;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "nota_id")
    private Nota nota;



}
// INSERT INTO anime(titulo,autor,genero,emision) VALUES (Zipang,Kawaguchi Kaiji,historico,false)
