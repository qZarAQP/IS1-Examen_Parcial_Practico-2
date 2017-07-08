package com.example.controller;

import com.example.domain.Cancion;
import com.example.domain.Usuario;
import com.example.repository.service.CancionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServletRequest;
import java.util.Collection;
import java.util.List;


@Controller
public class CancionController {
    private final Logger logger = LoggerFactory.getLogger(CancionController.class);

    @Autowired
    private CancionService cancionService;

    @RequestMapping("/canciones")
    public String getListaCanciones(Model model, HttpServletRequest request) {
        logger.info("getListaCanciones");
        Usuario usuario = (Usuario) request.getSession().getAttribute("userSession");
        logger.debug("ID DE USUARIO " + usuario.getId());
        List<Cancion> canciones = cancionService.listarCancionesPorUsuario(usuario.getId());
        model.addAttribute("listaCanciones", canciones);

        return "canciones";
    }
}