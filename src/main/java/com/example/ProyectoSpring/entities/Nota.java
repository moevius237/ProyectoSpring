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
@Table(name = "nota")
public class Nota {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "nota")
    private double nota;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "anime")
    private Anime anime;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "manga")
    private Anime manga;

}
