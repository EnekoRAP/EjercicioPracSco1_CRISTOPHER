/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.EjercicioPractico1.dao;

import com.EjercicioPractico1.domain.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Asus
 */
public interface ClientesDao extends JpaRepository <Clientes,Long> {
    
}
