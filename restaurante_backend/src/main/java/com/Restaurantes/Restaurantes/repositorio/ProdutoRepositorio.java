package com.Restaurantes.Restaurantes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Restaurantes.Restaurantes.entity.Produto;

public interface ProdutoRepositorio  extends JpaRepository<Produto, Integer> {

}
