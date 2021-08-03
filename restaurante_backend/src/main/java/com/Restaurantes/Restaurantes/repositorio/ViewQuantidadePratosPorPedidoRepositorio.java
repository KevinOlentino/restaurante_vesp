package com.Restaurantes.Restaurantes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Restaurantes.Restaurantes.views.ViewQuantidadePratosPorPedido;

@Repository
public interface ViewQuantidadePratosPorPedidoRepositorio extends JpaRepository<ViewQuantidadePratosPorPedido, Integer>{

}
