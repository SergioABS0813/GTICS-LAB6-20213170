package com.example.lab6gtics.Controller;

import com.example.lab6gtics.Repository.DispositivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/profesor")
public class ProfesorController {

    @Autowired
    DispositivoRepository dispositivoRepository;



    @GetMapping(value = {"/listaDispositivos"})
    public String listarDispositivos(Model model) {
        model.addAttribute("listaDispositivos", dispositivoRepository.findAll());
        return "profesor/listaDispositivos";
    }



}
