package com.example.demo.ServicesInterfaces;

import com.example.demo.Entity.Empleado;
import java.util.List;
import java.util.Optional;

public interface EmpleadoInterface {
    public List<Empleado> listaEmpleados();

    public Optional<Empleado> listaEmpleadoById(Long id);

    public int save(Empleado empleado);

    public void delete(Long id);
}
