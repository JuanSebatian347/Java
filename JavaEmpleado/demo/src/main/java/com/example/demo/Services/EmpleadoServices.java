package com.example.demo.Services;

import com.example.demo.ServicesInterfaces.EmpleadoInterface;
import com.example.demo.Entity.Empleado;
import com.example.demo.Repository.EmpleadoReporsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoServices implements EmpleadoInterface {
    @Autowired
    private EmpleadoReporsitory empleadoRepository;
    @Override
    public List<Empleado> listaEmpleados() {
        List<Empleado> empleados = new ArrayList<>();
        empleadoRepository.findAll().forEach(Empleado::Add);
        return empleadoRepository.findAll();
    }
    @Override
    public Optional<Empleado> listaEmpleadoById(Long id) {

        return empleadoRepository.findById(id);
    }
    @Override
    public int save(Empleado e) {
        Empleado empleado = empleadoRepository.save(e);
        return 1;
    }
    @Override
    public void delete(Long id) {
        empleadoRepository.deleteById(id);
    }
}