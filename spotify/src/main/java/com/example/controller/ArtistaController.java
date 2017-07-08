package com.example.controller;

import java.sql.Date;
import java.time.Instant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.Administrador;
import com.example.domain.Artista;
import com.example.repository.ArtistRepository;
import com.example.repository.service.ArtistService;


@Controller
public class ArtistaController {
	
	ArtistService artistService;
    private final Logger logger = LoggerFactory.getLogger(ArtistaController.class);

    @RequestMapping("/artistas")
    public String getListaArtistas(Model model) {
        logger.info("getListaArtistas");
        //Collection<Cancion> canciones = cancionService.listarCanciones();
        //model.addAttribute("listaCanciones", canciones);

        return "artistas";
    }
    
    
    

    @RequestMapping(value = "/registraArtista", method = RequestMethod.POST)
    @ResponseBody
    Boolean registraArtista(@RequestBody Artista artist) throws Exception {
        System.out.println("guardando: *******artist***"+artist.getNickname()+"**********" );
		Artista s1 =new Artista(artist.getNickname(),artist.getNickname()+"@ucsp",1000000,Date.from(Instant.EPOCH),artist.getNickname(),artist.getNickname());

        System.out.println("guardando: *******artisbfdbdft***"+s1.getNickname()+"**********" );

        artistService.registraArtista(s1);

        return Boolean.TRUE;
    }
    
}
