/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.app.web.repositorio;

import com.app.web.entidad.Pacientes;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ferney
 */
@Repository
public interface PacienteRepositorio extends JpaRepository<Pacientes, Long>{
    
    @Query(value ="SELECT * FROM usuarios u WHERE (u.nombre LIKE %?1% OR u.apellido LIKE %?1%)", nativeQuery = true)
	public List<Pacientes> findAll(String palabraClave);

}
