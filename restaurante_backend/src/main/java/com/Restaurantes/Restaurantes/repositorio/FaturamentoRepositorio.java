package com.Restaurantes.Restaurantes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Restaurantes.Restaurantes.entity.Faturamento;

@Repository
public interface FaturamentoRepositorio extends JpaRepository <Faturamento, Integer>{

	
}
