package com.example.hello.controlador;

import java.util.List;
import com.example.hello.interfaceService.IpersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.hello.modelo.Persona;



@Controller

public class Controlador {

    @Autowired
    private IpersonaService service;

    @GetMapping("/listar")
    public String listar(Model model) {
        List<Persona>personas=service.listar();
        model.addAttribute("personas",personas);
        return "pagina";

    }
}
