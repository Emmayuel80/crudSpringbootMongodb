package com.example.crud;

import org.springframework.data.annotation.Id;

public class Role {

    @Id
    public String id;

    public String nombre;

    public Role() {
    }

    public Role(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return String.format(
                "Role[id=%s, nombre='%s']",
                id, nombre);
    }

}