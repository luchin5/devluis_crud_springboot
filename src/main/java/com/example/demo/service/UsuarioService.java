package com.example.demo.service;
import com.example.demo.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    List<Usuario> listaUsuarios();
    Optional<Usuario> obtenerUsuarioporId(Long id);
    Usuario guardarUsuario(Usuario usuario);
    void eliminarUsuario(Long id);
}
