package com.example.ms_catalogo.Service.impl;



import com.example.ms_catalogo.Entity.Categoria;
import com.example.ms_catalogo.Repository.CategoriaRepository;
import com.example.ms_catalogo.Service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;


@Service
public class CategoriaServiceImpl implements CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;


    @Override
    public List<Categoria> listar() {
        return categoriaRepository.findAll();
    }


    @Override
    public Categoria guardar(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }


    @Override
    public Categoria actualizar(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }


    @Override
    public Optional<Categoria> listarPorId(Integer id) {
        return categoriaRepository.findById(id);
    }


    @Override
    public void eliminarPorId(Integer id) {
        categoriaRepository.deleteById(id);
    }
}
