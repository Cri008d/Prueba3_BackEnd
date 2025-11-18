package com.Plantita.Plantita_BackEnd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Plantita.Plantita_BackEnd.model.Region;

public interface RegionRepository extends JpaRepository<Region, Integer>{

    List<Region> findByNomRegion(String nomRegion);
    
}
