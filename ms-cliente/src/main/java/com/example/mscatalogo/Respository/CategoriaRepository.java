package com.example.mscatalogo.Respository;

import com.example.mscatalogo.Entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository  extends JpaRepository<Cliente,Integer> {
}
