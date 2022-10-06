/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.web.entidad;

import java.util.Date;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;


/**
 *
 * @author Ferney
 */
@Entity
@Table (name="pacientes")
public class Pacientes {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "documento", nullable = false, length = 80, unique = true)
    private long documento;
	
    @Column(name = "nombre", nullable = false, length = 80)
    private String nombre;
    
    @Column(name = "apellido", nullable = false, length = 80)
    private String apellido;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "fecha_nacimiento", nullable = false, length = 80)
    private Date fechaNacimiento;
	
    @Column(name = "telefono", nullable = false, length = 80)
    private long telefono;
    
    @Column(name = "email", nullable = false, length = 80)
    private String email;
    
    @Column(name = "tipo_sangre", nullable = false, length = 80)
    private String tipoSangre;
    
    @Column(name = "nombre_acudiente", nullable = false, length = 80)
    private String nombreAcudiente;

    @Column(name = "telefono_acudiente", nullable = false, length = 80)
    private long telefonoAcudiente;
    
    @JoinColumn(name ="id_clinica")
    @ManyToOne(fetch = FetchType.LAZY, optional=false)
    private Clinicas clinica;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getNombreAcudiente() {
        return nombreAcudiente;
    }

    public void setNombreAcudiente(String nombreAcudiente) {
        this.nombreAcudiente = nombreAcudiente;
    }

    public long getTelefonoAcudiente() {
        return telefonoAcudiente;
    }

    public void setTelefonoAcudiente(long telefonoAcudiente) {
        this.telefonoAcudiente = telefonoAcudiente;
    }

    public Clinicas getClinica() {
        return clinica;
    }

    public void setClinica(Clinicas clinica) {
        this.clinica = clinica;
    }

    public Pacientes(Long id, long documento, String nombre, String apellido, Date fechaNacimiento, long telefono, String email, String tipoSangre, String nombreAcudiente, long telefonoAcudiente, Clinicas clinica) {
        this.id = id;
        this.documento= documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.email = email;
        this.tipoSangre = tipoSangre;
        this.nombreAcudiente = nombreAcudiente;
        this.telefonoAcudiente = telefonoAcudiente;
        this.clinica = clinica;
    }

    public Pacientes(long documento, String nombre, String apellido, Date fechaNacimiento, long telefono, String email, String tipoSangre, String nombreAcudiente, long telefonoAcudiente, Clinicas clinica) {
        this.documento= documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.email = email;
        this.tipoSangre = tipoSangre;
        this.nombreAcudiente = nombreAcudiente;
        this.telefonoAcudiente = telefonoAcudiente;
        this.clinica = clinica;
    }

    /*public Pacientes(long documento, String nombre, String apellido, Date fechaNacimiento, long telefono, String email, String tipoSangre, String nombreAcudiente, long telefonoAcudiente) {
        this.documento= documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.email = email;
        this.tipoSangre = tipoSangre;
        this.nombreAcudiente = nombreAcudiente;
        this.telefonoAcudiente = telefonoAcudiente;
    }*/
    
    
    public Pacientes() {
    }

    @Override
    public String toString() {
        return "Pacientes{" + "id=" + id + ", documento=" + documento + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento + ", telefono=" + telefono + ", email=" + email + ", tipoSangre=" + tipoSangre + ", nombreAcudiente=" + nombreAcudiente + ", telefonoAcudiente=" + telefonoAcudiente + ", clinica=" + clinica + '}';
    }

    

 
}
