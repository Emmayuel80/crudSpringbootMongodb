package com.example.crud.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.Model.Role;
import com.example.crud.Repository.RoleRepository;

import com.example.crud.Service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role create(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public Role delete(String id) {
        Role role = findById(id);
        if (role != null) {
            roleRepository.delete(role);
        }
        return role;
    }

    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public Role findById(String id) {
        return roleRepository.findById(id);
    }

    @Override
    public Role findByNombre(String nombre) {
        return roleRepository.findByNombre(nombre);
    }

    @Override
    public Role update(Role role) {
        return roleRepository.save(role);
    }

}