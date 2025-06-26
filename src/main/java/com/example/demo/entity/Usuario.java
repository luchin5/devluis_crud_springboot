package com.example.demo.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombres;
    private String correos;

    // GETTERS Y SETTERS DEL MODEL USUARIO
    public Long getId(){
        return this.id;
    }
    public String getNombres(){
        return this.nombres;
    }
    public String getCorreos(){
        return this.correos;
    }

    public void setId(Long id){
        this.id = id;
    }
    public void setNombres(String nombres){
        this.nombres = nombres;
    }
    public void setCorreos(String correos){
        this.correos = correos;
    }
}
