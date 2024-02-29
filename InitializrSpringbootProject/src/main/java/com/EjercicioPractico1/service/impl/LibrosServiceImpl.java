/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EjercicioPractico1.service.impl;

import com.EjercicioPractico1.dao.LibrosDao;
import com.EjercicioPractico1.domain.Libros;
import com.EjercicioPractico1.service.LibrosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Asus
 */
@Service
public class LibrosServiceImpl implements LibrosService {
    
    @Autowired
    private LibrosDao LibrosDao;

    @Override
    @Transactional(readOnly=true)
    public List<Libros> getLibros(boolean activos) {
        var lista=LibrosDao.findAll();
        if (activos) {
           lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }
}
