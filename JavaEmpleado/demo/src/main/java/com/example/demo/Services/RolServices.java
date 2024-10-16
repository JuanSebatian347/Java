package com.example.demo.Services;

import com.example.demo.ServicesInterfaces.RolInterface;
import com.example.demo.Entity.Rol;
import com.example.demo.Repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RolServices implements RolInterface {
    @Autowired
    private RolRepository rolRepository;

    @Override
    public List<Rol> listaRoles() {
        return rolRepository.findAll();
    }
}