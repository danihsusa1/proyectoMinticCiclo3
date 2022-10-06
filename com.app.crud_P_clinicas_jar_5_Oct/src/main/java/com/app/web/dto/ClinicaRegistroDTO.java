/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.web.dto;

/**
 *
 * @author Ferney
 */
public class ClinicaRegistroDTO {
    
    private Long id;
    private long nit;
    private String razon_social;
    private String email;
    private String direccion;
    private String username;
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public long getNit() {
        return nit;
    }

    public void setNit(long nit) {
        this.nit = nit;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ClinicaRegistroDTO(long nit, String razon_social, String email, String direccion, String username, String password) {
        this.nit = nit;
        this.razon_social = razon_social;
        this.email = email;
        this.direccion = direccion;
        this.username = username;
        this.password = password;
    }

    public ClinicaRegistroDTO(String username) {
        this.username = username;
    }

    public ClinicaRegistroDTO() {
    }
    
    
    
    
    
}
