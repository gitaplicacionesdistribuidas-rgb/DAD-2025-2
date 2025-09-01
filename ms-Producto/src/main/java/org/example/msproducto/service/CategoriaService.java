package org.example.msproducto.service;

import org.example.msproducto.entity.Categoria;
import org.example.msproducto.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository repo;

    public List<Categoria> listar() {
        return repo.findAll();
    }

    public Categoria obtener(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Categoria guardar(Categoria categoria) {
        return repo.save(categoria);
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}