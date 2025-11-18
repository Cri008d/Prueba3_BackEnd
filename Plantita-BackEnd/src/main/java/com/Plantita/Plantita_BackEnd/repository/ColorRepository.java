package com.Plantita.Plantita_BackEnd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Plantita.Plantita_BackEnd.model.Color;

public interface ColorRepository extends JpaRepository<Color, Integer>{

    List<Color> findByCodigo(String codigo);

    List<Color> findByNomColor(String nomColor);
    
}
