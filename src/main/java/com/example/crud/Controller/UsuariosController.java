package com.example.crud.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.example.crud.Model.Usuario;
import com.example.crud.Service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UsuarioService usuarioService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Usuario> getAll() {
        logger.debug("Get all usuarios");
        return usuarioService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Usuario create(@RequestBody Usuario usuario) {
        logger.debug("Create usuario");
        return usuarioService.create(usuario);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Usuario delete(@PathVariable String id) {
        logger.debug("Delete usuario");
        return usuarioService.delete(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Usuario get(@PathVariable String id) {
        logger.debug("Get usuario by id");
        return usuarioService.findById(id);
    }

    @RequestMapping(value = "/nombre/{nombre}", method = RequestMethod.GET)
    public Usuario getByNombre(@PathVariable String nombre) {
        logger.debug("Get usuario by nombre");
        return usuarioService.findByNombre(nombre);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Usuario update(@PathVariable String id, @RequestBody Usuario usuario) {
        logger.debug("Update usuario");
        usuario.setId(id);
        return usuarioService.update(usuario);
    }

}