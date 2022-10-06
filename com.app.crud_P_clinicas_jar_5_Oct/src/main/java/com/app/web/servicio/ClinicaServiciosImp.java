/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.web.servicio;

import com.app.web.dto.ClinicaRegistroDTO;
import com.app.web.entidad.Clinicas;
import com.app.web.entidad.Rol;
import com.app.web.repositorio.ClinicaRepositorio;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ferney
 */
@Service
public class ClinicaServiciosImp implements ClinicaServicios{
    @Autowired
    private ClinicaRepositorio crepositorio;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    
    @Override
    public Clinicas guardarClinica(ClinicaRegistroDTO registroDTO) {
        Clinicas clinica = new Clinicas(registroDTO.getNit(), 
                registroDTO.getRazon_social(), registroDTO.getEmail(),
                registroDTO.getDireccion(), registroDTO.getUsername(), 
                passwordEncoder.encode(registroDTO.getPassword()),
                Arrays.asList(new Rol("ROLE_USER")));
	return crepositorio.save(clinica);    
    }
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
            Clinicas clinica = crepositorio.findByUsername(username);
            if(clinica == null) {
                    throw new UsernameNotFoundException("Usuario o password inválidos");
            }
            return new User(clinica.getUsername(), clinica.getPassword(), mapearAutoridadesRoles(clinica.getRoles()));
    }

    private Collection<? extends GrantedAuthority> mapearAutoridadesRoles(Collection<Rol> roles){
            return roles.stream().map(role -> new SimpleGrantedAuthority(role.getNombre())).collect(Collectors.toList());
    }
   
    @Override
    public List<Clinicas> listarTodasLasClinicas() {
        return crepositorio.findAll();
    }

    @Override
    public Clinicas obtenerClinicaPorId(Long id) {
            return crepositorio.findById(id).get();
    }
    
    @Override
    public Clinicas obtenerClinicaPorUsername(String username) {
            return crepositorio.findByUsername(username);
    }

    
    /*@Override
    public Clinicas actualizarClinica(Clinicas clinica) {
            return crepositorio.save(clinica);
    }

    @Override
    public void eliminarClinica(Long id) {
            crepositorio.deleteById(id);
    }*/

}
