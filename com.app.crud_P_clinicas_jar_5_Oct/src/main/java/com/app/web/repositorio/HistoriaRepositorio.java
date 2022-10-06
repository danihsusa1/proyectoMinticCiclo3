/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.app.web.repositorio;

import com.app.web.entidad.HistoriasClinicas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ferney
 */
@Repository
public interface HistoriaRepositorio extends JpaRepository<HistoriasClinicas, Long>{
    
}
