package com.example.controller;

import com.example.domain.Usuario;
import com.example.repository.service.LoginService;
import com.example.repository.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
public class UserController {
	@Autowired
	UserService userService;

  
	
	@RequestMapping(value = "/configuracion_upd", method = RequestMethod.POST)
 	@ResponseBody
 	Boolean configuracion(@RequestBody Usuario user) throws Exception {
	System.out.println("guardando: *********************************" );

		userService.configuracion(user);
 		return Boolean.TRUE;
  	}
	

	



/*
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    Boolean login(@RequestBody Usuario user) throws Exception {
        System.out.println("guardando: *******login***"+user.getNickname()+"**********" );

        //loginService.login(user.usuario, user.password);
        loginService.login(user.getNickname(), user.getPassword());

        return Boolean.TRUE;
    }*/
}
