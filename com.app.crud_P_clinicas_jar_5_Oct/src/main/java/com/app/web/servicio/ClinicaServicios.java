/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.app.web.servicio;

import com.app.web.dto.ClinicaRegistroDTO;
import com.app.web.entidad.Clinicas;
import java.util.List;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 *
 * @author Ferney
 */
public interface ClinicaServicios extends UserDetailsService{
    public List<Clinicas> listarTodasLasClinicas(); 
    public Clinicas guardarClinica(ClinicaRegistroDTO registroDTO);
    public Clinicas obtenerClinicaPorId(Long id);
    public Clinicas obtenerClinicaPorUsername(String username);
    //public Clinicas actualizarClinica(Clinicas clinica); 
    //public void eliminarClinica(Long id);
}
