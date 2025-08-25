package com.example.mscatalogo.Service;

import com.example.mscatalogo.Entity.Cliente;

import java.util.List;
import java.util.Optional;

public interface CategoriaService {
    List<Cliente> listar();
    Optional<Cliente> buscarPorId(Integer id);
    Cliente guardar(Cliente cliente);
    Cliente actualizar(Cliente cliente);
    void borrarPorId(Integer id);
}
