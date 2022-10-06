/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.web.control;

import com.app.web.dto.ClinicaRegistroDTO;
import com.app.web.servicio.ClinicaServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Ferney
 */

@Controller
@RequestMapping("/registroClinica")
public class RegistroClinicaControlador {
    
    @Autowired
    private ClinicaServicios cservicio;
    
    @ModelAttribute("clinica")
	public ClinicaRegistroDTO retornarNuevaclinicaRegistroDTO() {
		return new ClinicaRegistroDTO();
	}
       
    @GetMapping
    public String mostrarFormularioDeRegistro(){
        return "registroClinica";
    }
    
    @PostMapping
    public String registarNuevaClinica(@ModelAttribute("clinica") ClinicaRegistroDTO registroDTO){
        cservicio.guardarClinica(registroDTO);
        return "redirect:/registroClinica?exito";
            
    }
    
}
