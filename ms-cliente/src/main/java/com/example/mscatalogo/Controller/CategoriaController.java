package com.example.mscatalogo.Controller;

import com.example.mscatalogo.Entity.Cliente;
import com.example.mscatalogo.Service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class CategoriaController {
    @Autowired
    CategoriaService categoriaService;

    @GetMapping
    public List<Cliente> listar() {
        return categoriaService.listar();
    }

    @GetMapping("/{id}")
    public Optional<Cliente> buscarPorId(@PathVariable Integer id) {
        return categoriaService.buscarPorId(id);
    }

    @PostMapping
    public Cliente guardar(Cliente cliente) {
        return categoriaService.guardar(cliente);
    }

    @PutMapping
    public Cliente actualizar(Cliente cliente) {
        return categoriaService.actualizar(cliente);
    }

    @DeleteMapping
    public String eliminar(@PathVariable Integer id) {
        categoriaService.borrarPorId(id);
        return "Categoria eliminada";
    }
}
