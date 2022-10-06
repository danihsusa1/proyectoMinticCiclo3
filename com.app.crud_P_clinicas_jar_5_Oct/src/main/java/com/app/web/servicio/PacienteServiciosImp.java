/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.web.servicio;

import com.app.web.dto.ClinicaRegistroDTO;
import com.app.web.dto.PacienteRegistroDTO;
import com.app.web.entidad.Clinicas;
import com.app.web.entidad.Pacientes;
import com.app.web.entidad.Rol;
import com.app.web.repositorio.PacienteRepositorio;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ferney
 */
@Service
public class PacienteServiciosImp implements PacienteServicios{
        @Autowired
	private ClinicaServicios cservicio;    
    
        @Autowired
	private PacienteRepositorio prepositorio;

	@Override
	public List<Pacientes> listarTodosLosPacientes(String palabraClave) {
		if(palabraClave != null) {
			return prepositorio.findAll(palabraClave);
		}
		return prepositorio.findAll();
	}

	/*@Override
	public Pacientes guardarPaciente(Pacientes paciente) {
		return prepositorio.save(paciente);
	}*/
        
        @Override
        public Pacientes guardarPaciente(PacienteRegistroDTO registroDTO) {
            Authentication auth = SecurityContextHolder.getContext().getAuthentication();    
            Pacientes paciente = new Pacientes(registroDTO.getDocumento(), 
                registroDTO.getNombre(), registroDTO.getApellido(),
                registroDTO.getFechaNacimiento(), registroDTO.getTelefono(),
                registroDTO.getEmail(),registroDTO.getTipoSangre(),
                    registroDTO.getNombreAcudiente(),registroDTO.getTelefonoAcudiente(),
                cservicio.obtenerClinicaPorUsername(auth.getName()));
                return prepositorio.save(paciente);    
    }

        /*        @Override
        public Pacientes guardarPaciente(PacienteRegistroDTO registroDTO) {
            Authentication auth = SecurityContextHolder.getContext().getAuthentication();    
            Pacientes paciente = new Pacientes(registroDTO.getDocumento(), 
                registroDTO.getNombre(), registroDTO.getApellido(),
                registroDTO.getFechaNacimiento(), registroDTO.getTelefono(),
                registroDTO.getEmail(),registroDTO.getTipoSangre(),
                    registroDTO.getNombreAcudiente(),registroDTO.getTelefonoAcudiente());
                return prepositorio.save(paciente);    
    }*/
        
	@Override
	public Pacientes obtenerPacientePorId(Long id) {
		return prepositorio.findById(id).get();
	}

	@Override
	public Pacientes actualizarPaciente(Pacientes paciente) {
		return prepositorio.save(paciente);
	}
	
	@Override
	public void eliminarPaciente(Long id) {
		prepositorio.deleteById(id);
	}

}
