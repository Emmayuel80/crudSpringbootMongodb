package com.example.crud;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {

    public Usuario findByNombre(String nombre);

    public Usuario findById(String id);

    public List<Usuario> findAll();

}