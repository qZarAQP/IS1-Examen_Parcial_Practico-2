package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ArtistaController {
    private final Logger logger = LoggerFactory.getLogger(ArtistaController.class);

    @RequestMapping("/artistas")
    public String getListaArtistas(Model model) {
        logger.info("getListaArtistas");
        //Collection<Cancion> canciones = cancionService.listarCanciones();
        //model.addAttribute("listaCanciones", canciones);

        return "artistas";
    }
}
