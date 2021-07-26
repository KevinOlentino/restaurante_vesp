package com.Restaurantes.Restaurantes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Restaurantes.Restaurantes.entity.Pedido;

@Repository
public interface PedidoRepositorio extends JpaRepository<Pedido, Integer>{
  
}
