package com.example.demo.Repository;

import com.example.demo.Entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoReporsitory extends JpaRepository<Empleado, Long> {
}