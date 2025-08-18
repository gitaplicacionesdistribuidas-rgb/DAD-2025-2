package com.example.ms_catalogo.Repository;

import com.example.ms_catalogo.Entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
