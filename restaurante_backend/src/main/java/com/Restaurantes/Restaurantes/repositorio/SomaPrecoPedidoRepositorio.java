package com.Restaurantes.Restaurantes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Restaurantes.Restaurantes.views.SomaPrecoPedido;

@Repository
public interface SomaPrecoPedidoRepositorio extends JpaRepository<SomaPrecoPedido, Integer>{

}
