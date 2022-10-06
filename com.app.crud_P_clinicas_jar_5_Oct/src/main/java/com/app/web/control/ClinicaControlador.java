/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.web.control;

import com.app.web.entidad.Clinicas;
import com.app.web.servicio.ClinicaServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ferney
 */
@Controller
public class ClinicaControlador {
    	@Autowired
	private ClinicaServicios cservicio;
    
        /*@GetMapping(value={"/login"})
	public String IniciarSesion() {
		return "login";
	}
        */
        @GetMapping(value={"/login"})
	public String IniciarSesion() {
		return "login";
	}
        
        @GetMapping(value={"/"})
	public String paginaInicio() {
		return "index";
	}
        
        @GetMapping("/home")
	public String listarClinica( Model modelo) {
                Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		modelo.addAttribute("clinicas", cservicio.obtenerClinicaPorUsername(auth.getName()));
		return "home";
	}
        

}
