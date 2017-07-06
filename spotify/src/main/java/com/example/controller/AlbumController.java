package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AlbumController {
    private final Logger logger = LoggerFactory.getLogger(AlbumController.class);

    @RequestMapping("/albumes")
    public String getListaAlbumes(Model model) {
        logger.info("getListaAlbumes");
        //Collection<Cancion> canciones = cancionService.listarCanciones();
        //model.addAttribute("listaCanciones", canciones);

        return "albumes";
    }
}
