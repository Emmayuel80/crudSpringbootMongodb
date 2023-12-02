package com.example.crud.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.crud.Model.Usuario;

@Service
public interface UsuarioService {
    public Usuario create(Usuario usuario);

    public Usuario delete(String id);

    public List<Usuario> findAll();

    public Usuario findById(String id);

    public Usuario findByNombre(String nombre);

    public Usuario update(Usuario usuario);
}