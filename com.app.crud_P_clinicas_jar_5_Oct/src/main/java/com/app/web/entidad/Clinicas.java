/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.web.entidad;

import java.util.Collection;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Ferney
 */
@Entity
@Table (name="clinicas")
public class Clinicas {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
        
    @Column(name = "nit", nullable = false, length = 80, unique = true)
    private long nit;
	
    @Column(name = "razon_social", nullable = false, length = 80)
    private String razon_social;
    
    @Column(name = "email", nullable = false, length = 80)
    private String email;
	
    @Column(name = "direccion", nullable = false, length = 150)
    private String direccion;
	
    @Column(name = "username", nullable = false, length = 80, unique = true)
    private String username;
    
    @Column(name = "password", nullable = false, length = 80)
    private String password;
    
    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(
                    name = "clinicas_roles",
                    joinColumns = @JoinColumn(name = "clinica_id",referencedColumnName = "id"),
                    inverseJoinColumns = @JoinColumn(name = "rol_id",referencedColumnName = "id")
                    )
    private Collection<Rol> roles;

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

    public Collection<Rol> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Rol> roles) {
        this.roles = roles;
    }

    public Clinicas() {
    }

    public Clinicas(Long id, long nit, String razon_social, String email, String direccion, String username, String password, Collection<Rol> roles) {
        this.id = id;
        this.nit = nit;
        this.razon_social = razon_social;
        this.email = email;
        this.direccion = direccion;
        this.username = username;
        this.password = password;
        this.roles = roles;
    }

    public Clinicas(long nit, String razon_social, String email, String direccion, String username, String password, Collection<Rol> roles) {
        this.nit = nit;
        this.razon_social = razon_social;
        this.email = email;
        this.direccion = direccion;
        this.username = username;
        this.password = password;
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "Clinicas{" + "id=" + id + ", nit=" + nit + ", razon_social=" + razon_social + ", email=" + email + ", direccion=" + direccion + ", username=" + username + ", password=" + password + ", roles=" + roles + '}';
    }



    
}
