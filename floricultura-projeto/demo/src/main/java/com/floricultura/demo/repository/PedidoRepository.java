package com.floricultura.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.floricultura.demo.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{
    
}
