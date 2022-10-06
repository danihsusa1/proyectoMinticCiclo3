/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.app.web.servicio;

import com.app.web.dto.PacienteRegistroDTO;
import com.app.web.entidad.Pacientes;
import java.util.List;

/**
 *
 * @author Ferney
 */
public interface PacienteServicios {
    
    	public List<Pacientes> listarTodosLosPacientes(String palabraClave); 
	
	//public Pacientes guardarPaciente(Pacientes paciente);
        public Pacientes guardarPaciente(PacienteRegistroDTO registroDTO);
	
	public Pacientes obtenerPacientePorId(Long id);
	
	public Pacientes actualizarPaciente(Pacientes paciente);

	public void eliminarPaciente(Long id);
}
