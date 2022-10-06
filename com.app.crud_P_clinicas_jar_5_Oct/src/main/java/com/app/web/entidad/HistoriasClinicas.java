/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.web.entidad;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Ferney
 */

@Entity
@Table (name="historiasclinicas")
public class HistoriasClinicas {
    @Id    
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column (name = "referencia")
    private long referencia;
    
    @Column(name = "fecha_consulta", nullable = false, length = 80)
    private String fechaConsulta;
    
    @Column(name = "altura", nullable = false, length = 80)
    private float altura;
    
    @Column(name = "peso", nullable = false, length = 80)
    private float peso;
    
    @Column(name = "temperatura", nullable = false, length = 80)
    private float temperatura; 
    
    @Column(name = "tension", nullable = false, length = 80)
    private float tension;
    
    @Column(name = "diagnostico", nullable = false, length = 500)
    private String diagnostico;
    
    @JoinColumn(name ="id_paciente")
    @ManyToOne(cascade = CascadeType.ALL)
    private Pacientes paciente;

    public long getReferencia() {
        return referencia;
    }

    public void setReferencia(long referencia) {
        this.referencia = referencia;
    }

    public String getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(String fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getTension() {
        return tension;
    }

    public void setTension(float tension) {
        this.tension = tension;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Pacientes getPaciente() {
        return paciente;
    }

    public void setPaciente(Pacientes paciente) {
        this.paciente = paciente;
    }

    public HistoriasClinicas() {
    }

    public HistoriasClinicas(long referencia, String fechaConsulta, float altura, float peso, float temperatura, float tension, String diagnostico, Pacientes paciente) {
        this.referencia = referencia;
        this.fechaConsulta = fechaConsulta;
        this.altura = altura;
        this.peso = peso;
        this.temperatura = temperatura;
        this.tension = tension;
        this.diagnostico = diagnostico;
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "HistoriasClinicas{" + "referencia=" + referencia + ", fechaConsulta=" + fechaConsulta + ", altura=" + altura + ", peso=" + peso + ", temperatura=" + temperatura + ", tension=" + tension + ", diagnostico=" + diagnostico + ", paciente=" + paciente + '}';
    }
    
    
    
}
