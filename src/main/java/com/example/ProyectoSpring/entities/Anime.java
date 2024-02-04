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
@Table(name = "anime")
public class Anime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column()
    private String autor;

    @Column()
    private String genero;

    @Column(nullable = false)
    private boolean emision;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "nota_id")
    private Nota nota;

}
