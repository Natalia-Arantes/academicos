package com.nataliaarantes.ordersystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nataliaarantes.ordersystem.model.Pessoa;

@Controller

public class HomeController {
    
    @GetMapping("home")
    public String home(Model model) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Natalia");
        pessoa.setSobrenome("Arantes");
        model.addAttribute("name", pessoa);
        return "index";
    }
}
