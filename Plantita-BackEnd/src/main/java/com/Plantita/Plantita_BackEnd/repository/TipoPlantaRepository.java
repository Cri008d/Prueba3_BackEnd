package com.Plantita.Plantita_BackEnd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Plantita.Plantita_BackEnd.model.TipoPlanta;
import java.util.List;


public interface TipoPlantaRepository extends JpaRepository<TipoPlanta, Integer>{
    
    List<TipoPlanta> findByNombre(String nombre);
}
