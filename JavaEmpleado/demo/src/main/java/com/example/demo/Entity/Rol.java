package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "roles")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idroles;

    private String nombre_rol;

    // Constructor
    public Rol(Long idroles, String nombre_rol) {
        this.idroles = idroles;
        this.nombre_rol = nombre_rol;
    }
}