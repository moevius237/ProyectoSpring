package com.example.ProyectoSpring.repository;

import com.example.ProyectoSpring.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long > {

}
