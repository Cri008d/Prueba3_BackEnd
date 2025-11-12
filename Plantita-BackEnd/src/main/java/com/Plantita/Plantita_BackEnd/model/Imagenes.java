package com.Plantita.Plantita_BackEnd.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Imagenes {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idImg;

    @Column(length = 100, nullable = false)
    private String urlImg;
    
}
