package com.example.demo.repository;
import com.example.demo.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends  JpaRepository<Usuario,Long>{

    // PUEDO CREAR METODOS PERSONALIZADOS QUE SERIAN EQUIVALENTES A SENTENCIAS SQL PROPIAS
    // PARA MANEJAR CASOS MÁS ESPECIFICOS O COMPLEJOS
}
