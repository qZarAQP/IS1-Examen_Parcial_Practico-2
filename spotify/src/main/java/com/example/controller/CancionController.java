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
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;


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
    

	///******Metodos de Cancion**********
	@RequestMapping("/songs")
  	@ResponseBody
  	Collection<Cancion> listarCanciones() {
		Collection<Cancion> c=cancionService.listarCanciones();
        System.out.println("guardando: *******login***"+c.size()+"**********" );

  	return c;
  	}
}