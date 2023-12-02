package com.example.crud;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, String> {

    public Role findByNombre(String nombre);

    public Role findById(String id);

    public List<Role> findAll();

}