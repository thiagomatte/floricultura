package com.floricultura.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.floricultura.demo.model.Planta;

public interface PlantaRepository extends JpaRepository<Planta, Long>{
    
}
