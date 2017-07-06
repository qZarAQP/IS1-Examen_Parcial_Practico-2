package com.example.controller;

import com.example.domain.Cancion;
import com.example.repository.service.CancionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;

/**
 * Created by Usuario on 27/06/2017.
 */
@Controller
public class CancionController {
    private final Logger logger = LoggerFactory.getLogger(CancionController.class);

    @Autowired
    private CancionService cancionService;

    @RequestMapping("/canciones")
    public String getListaCanciones(Model model) {
        logger.info("getListaCanciones");
        //Collection<Cancion> canciones = cancionService.listarCanciones();
        //model.addAttribute("listaCanciones", canciones);

        return "canciones";
    }
}