package com.api.xclusive.controller;

import com.api.xclusive.entity.Usuario;
import com.api.xclusive.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController
{
    @Autowired
    UsuarioService usuarioService;
    //CREAR USUARIO
    @PostMapping
    public ResponseEntity<?> registrarUsuario(@RequestBody Usuario usuario)
    {
        try {
            Usuario respuesta = this.usuarioService.registrarUsuario(usuario);
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(respuesta);
        }catch (Exception e)
        {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(e.getMessage());
        }
    }
    //BUSCAR USUARIO
    @GetMapping("/{idUsuario}")
    public  ResponseEntity<?> buscarUsuario(@PathVariable Integer idUsuario)
    {
        try {
            Usuario respuesta = this.usuarioService.buscarUnUsuario(idUsuario);
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(respuesta);
        }catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(e.getMessage());
        }
    }
    //BUSCAR LOS USUARIOS
    @GetMapping
    public ResponseEntity<List<Usuario>> buscarLosUsuarios()
    {
        try {
            List<Usuario> listaUsuarios = this.usuarioService.buscarLosUsuarios();
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(listaUsuarios);
        }catch (Exception e)
        {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);
        }
    }
    @PutMapping
    public ResponseEntity<Usuario> editarUsuario(@PathVariable Integer idUsuario, @RequestBody Usuario usuario)
    {
        try {
            Usuario respuesta = this.usuarioService.editarUsuario(idUsuario, usuario);
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(respuesta);
        }catch (Exception e)
        {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);
        }
    }
    public ResponseEntity<?> eliminarUsuario(@PathVariable Integer idUsuario)
    {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.usuarioService.eliminarUsuario(idUsuario));
        }catch (Exception e)
        {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(e.getMessage());
        }
    }
}
