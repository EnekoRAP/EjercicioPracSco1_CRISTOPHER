/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.EjercicioPractico1.service;

import com.EjercicioPractico1.domain.Libros;
import java.util.List;

/**
 *
 * @author Asus
 */
public interface LibrosService {
    // Se obtiene un listado de categorias en un List
    public List<Libros> getLibros(boolean activos);
}
