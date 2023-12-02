package com.example.crud.Model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class Usuario {
    @Id
    public String id;

    public String nombre;
    public String a_paterno;
    public String a_materno;

    @DbRef
    public List<Role> roles;

    public Usuario() {
    }

    public Usuario(String nombre, String a_paterno, String a_materno, List<Role> roles) {
        this.nombre = nombre;
        this.a_paterno = a_paterno;
        this.a_materno = a_materno;
        this.roles = roles;
    }

    @Override
    public String toString() {
        return String.format(
                "Usuario[id=%s, nombre='%s', a_paterno='%s', a_materno='%s', roles='%s']",
                id, nombre, a_paterno, a_materno, roles);
    }
}