/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EjercicioPractico1.controller;

import com.EjercicioPractico1.service.ClientesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Asus
 */

@Controller
@Slf4j
@RequestMapping("/clientes")
public class ClientesController {
    
    private ClientesService clientesService;
    @Autowired
    @GetMapping("/listado")
    public String inicio(Model model) {
        var clientes = clientesService.getClientes(false);
        model.addAttribute("clientes", clientes);
        model.addAttribute("totalClientes", clientes.size());
        return "/clientes/listado";
    }
}
