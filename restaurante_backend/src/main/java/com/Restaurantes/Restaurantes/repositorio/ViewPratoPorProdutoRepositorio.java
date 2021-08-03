package com.Restaurantes.Restaurantes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Restaurantes.Restaurantes.views.ViewPratoPorProduto;

@Repository
public interface ViewPratoPorProdutoRepositorio extends JpaRepository<ViewPratoPorProduto, Integer> {

}
