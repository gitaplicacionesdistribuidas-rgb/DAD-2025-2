package com.example.ms_catalogo.Service;

import com.example.ms_catalogo.Entity.Categoria;


import java.util.List;
import java.util.Optional;


public interface CategoriaService {
    public List<Categoria> listar();
    public Categoria guardar(Categoria categoria);
    public Categoria actualizar(Categoria categoria);
    public Optional<Categoria> listarPorId(Integer id);
    public void eliminarPorId(Integer id);
}
