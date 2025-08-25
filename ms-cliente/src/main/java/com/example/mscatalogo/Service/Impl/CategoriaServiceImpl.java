package com.example.mscatalogo.Service.Impl;

import com.example.mscatalogo.Entity.Cliente;
import com.example.mscatalogo.Respository.CategoriaRepository;
import com.example.mscatalogo.Service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaServiceImpl implements CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;
    @Override
    public List<Cliente> listar() {
        return categoriaRepository.findAll();
    }

    @Override
    public Optional<Cliente> buscarPorId(Integer id) {
        return categoriaRepository.findById(id);
    }

    @Override
    public Cliente guardar(Cliente cliente) {
        return categoriaRepository.save(cliente);
    }

    @Override
    public Cliente actualizar(Cliente cliente) {
        return categoriaRepository.save(cliente);
    }

    @Override
    public void borrarPorId(Integer id) {
    categoriaRepository.deleteById(id);
    }
}
