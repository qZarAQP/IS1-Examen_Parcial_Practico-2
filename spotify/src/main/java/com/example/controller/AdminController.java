package com.example.controller;

import com.example.domain.Administrador;
import com.example.repository.service.AdminService;
import com.example.repository.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
public class AdminController {
    
    @Autowired
    AdminService adminService;
    private String usero;
    
    @RequestMapping(value = "/login_adm", method = RequestMethod.POST)
    @ResponseBody
    Boolean login_adm(@RequestBody Administrador admin) throws Exception {
        System.out.println("guardando: *******login***"+admin.getNickname()+"**********" );

        //loginService.login(user.usuario, user.password);
        usero=admin.getNickname();
		System.out.println("guardando: ppppppppppp " );

        adminService.login_adm(admin.getNickname(), admin.getPassword());

        return Boolean.TRUE;
    }
    
    

 
    @RequestMapping("/session_adm")
	@ResponseBody
	Administrador session_adm() {
		return adminService.session_adm(usero);
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
