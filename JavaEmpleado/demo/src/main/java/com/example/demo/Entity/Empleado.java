package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "empleados")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idempleados;

    private String empleado_nombres;
    private String empleado_apellidos;
    private String telefono;
    private String correo_electronico;
    private String direccion_residencia;

    @ManyToOne
    @JoinColumn(name = "idroles")
    private Rol roles;

    // Constructor
    public Empleado(Long idempleados, String empleado_nombres, String empleado_apellidos, String telefono, String correo_electronico, String direccion_residencia, Rol roles) {
        this.idempleados = idempleados;
        this.empleado_nombres = empleado_nombres;
        this.empleado_apellidos = empleado_apellidos;
        this.telefono = telefono;
        this.correo_electronico = correo_electronico;
        this.direccion_residencia = direccion_residencia;
        this.roles = roles;
    }
}