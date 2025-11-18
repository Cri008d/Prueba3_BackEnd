package com.Plantita.Plantita_BackEnd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Plantita.Plantita_BackEnd.model.Comuna;
import java.util.List;


public interface ComunaRepository extends JpaRepository<Comuna, Integer>{
    
    List<Comuna> findByNomComuna(String nomComuna);
}
