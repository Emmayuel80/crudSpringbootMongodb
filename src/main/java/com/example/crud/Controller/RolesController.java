package com.example.crud.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.example.crud.Model.Role;
import com.example.crud.Service.RoleService;

@RestController
@RequestMapping("/roles")
public class RolesController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    RoleService roleService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Role> getAll() {
        logger.debug("Get all roles");
        return roleService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Role create(@RequestBody Role role) {
        logger.debug("Create role");
        return roleService.create(role);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Role delete(@PathVariable String id) {
        logger.debug("Delete role");
        return roleService.delete(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Role get(@PathVariable String id) {
        logger.debug("Get role by id");
        return roleService.findById(id);
    }

    @RequestMapping(value = "/nombre/{nombre}", method = RequestMethod.GET)
    public Role getByNombre(@PathVariable String nombre) {
        logger.debug("Get role by nombre");
        return roleService.findByNombre(nombre);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Role update(@PathVariable String id, @RequestBody Role role) {
        logger.debug("Update role");
        role.setId(id);
        return roleService.update(role);
    }

}