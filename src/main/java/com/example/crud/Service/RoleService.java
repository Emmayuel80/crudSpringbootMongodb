package com.example.crud.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.crud.Model.Role;

@Service
public interface RoleService {
    public Role create(Role role);

    public Role delete(String id);

    public List<Role> findAll();

    public Role findById(String id);

    public Role findByNombre(String nombre);

    public Role update(Role role);
}