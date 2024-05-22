package com.floricultura.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.floricultura.demo.model.Adubo;

public interface AduboRepository extends JpaRepository<Adubo, Long>{
    
}
