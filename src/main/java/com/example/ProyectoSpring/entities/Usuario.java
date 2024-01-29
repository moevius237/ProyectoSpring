package com.example.ProyectoSpring.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private boolean visto;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "anime_id")
    private Anime anime;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "manga_id")
    private Manga manga;
}
