package com.example.demo.Controller;

import com.example.demo.Entity.Rol;
import com.example.demo.ServicesInterfaces.RolInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class RolController {
    @Autowired
    private RolInterface rolServiceImplements;
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("roles", rolServiceImplements.listaRoles());
        return "index";
    }
}
