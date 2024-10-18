package com.example.demo.Controller;

import com.example.demo.Entity.Empleado;
import com.example.demo.Entity.Rol;
import com.example.demo.Services.EmpleadoServices;
import com.example.demo.ServicesInterfaces.EmpleadoInterface;
import com.example.demo.ServicesInterfaces.RolInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Controller
public class EmpleadoController {
    @Autowired
    private EmpleadoInterface empleadoServiceImplements;
    @Autowired
    private RolInterface rolServiceImplements;

    // Método para mostrar los datos
    @GetMapping("/empleados")
    public String index(Model model) {
        model.addAttribute("roles", rolServiceImplements.listaRoles());
        model.addAttribute("empleados", empleadoServiceImplements.listaEmpleados());
        return "index";
    }
    @GetMapping("/")
    public String listarEmpleados(Model model) {
        List<Empleado> empleados = EmpleadoServices.();
        model.addAttribute("empleados", empleados);
        return "EmpleadosList";
    }

    // metodo para save
    @GetMapping("/save")
    public String saveEmpleado(@Validated Empleado empleado, Model model) {
        empleadoServiceImplements.save(empleado);
        return "redirect:empleados";
    }

    // metodo para actualizar
    @GetMapping("/editarEmpleado{id}")
    public String editarEmpleado(@PathVariable long id, Model model) {
        Optional<Empleado> empleado = empleadoServiceImplements.listaEmpleadoById(id);
        model.addAttribute("empleado", empleado);

        return "editarEmpleado";
    }
}
