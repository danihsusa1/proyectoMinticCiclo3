/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.app.web.repositorio;

import com.app.web.entidad.Clinicas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ferney
 */
//JpaRepository<class,type @ID>
@Repository
public interface ClinicaRepositorio extends JpaRepository<Clinicas, Long>{
    
    //@Query(value ="SELECT * FROM clinicas u WHERE (u.usernamr = ?1)", nativeQuery = true)
    public Clinicas findByUsername(String username);
}
