package com.example.demo.controller;

import com.example.demo.entity.Usuario;
import com.example.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")

public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<List<Usuario>> listar(){
        List<Usuario> usuarios = usuarioService.listaUsuarios();

        if(usuarios.isEmpty()){
            throw new RuntimeException("Usuarios no encontrados");
        }

        return ResponseEntity.ok(usuarios);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> obtenerUsuario(@PathVariable Long id){
        Usuario usuario = usuarioService.obtenerUsuarioporId(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
        return ResponseEntity.ok(usuario);
           //     .map(usuario-> ResponseEntity.ok(usuario)) // 200 ok
            //    .orElseGet(() -> ResponseEntity.notFound().build()); // 404 not found
        //return usuarioService.obtenerUsuarioporId(id)
    }

    @PostMapping
    public ResponseEntity<Usuario> crearUsuario(@RequestBody Usuario usuario){
        Usuario usuarioNuevo = usuarioService.guardarUsuario(usuario);//.orElseThrow(()->new RuntimeException("No se pudo crear el objeto"));
        if(usuarioNuevo == null){
            throw new RuntimeException("No se pudo crear el usuario");
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioNuevo); // 201 ok post
    }

    @PutMapping("/{id}")
    public ResponseEntity<Usuario> actualizarUsuario(@PathVariable Long id,@RequestBody Usuario usuario){
        Usuario usuarioexiste = usuarioService.obtenerUsuarioporId(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        usuario.setId(id);
        Usuario usuarioactualizado = usuarioService.guardarUsuario(usuario);
        return ResponseEntity.ok(usuarioactualizado); // 200 ok
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUsuario(@PathVariable Long id){
        Usuario usuario = usuarioService.obtenerUsuarioporId(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
      usuarioService.eliminarUsuario(id);
      return ResponseEntity.noContent().build();
    }
}
