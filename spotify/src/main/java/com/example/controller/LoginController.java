package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.domain.Usuario;
import com.example.repository.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping("/")
	public String inicio(Model model) {
		Usuario usuario = new Usuario();
		
		model.addAttribute("userForm", usuario);
		return "/WEB-INF/view/user_login.jsp";
	}
	
	@RequestMapping(value ="/login", method = RequestMethod.POST)
	public String login(@ModelAttribute("userForm") Usuario user) {
		try {
			Boolean resp = loginService.login(user.getNickname(), user.getPassword());
			
			if(resp) 
				 return "/WEB-INF/view/artista.jsp";			
			else
				return "/WEB-INF/view/cancion.jsp";
		}catch(Exception e) {
			
		}
		return null;
	}

}
