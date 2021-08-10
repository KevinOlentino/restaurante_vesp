package com.Restaurantes.Restaurantes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Restaurantes.Restaurantes.entity.Veiculo;

@Repository
public interface VeiculoRepositorio extends JpaRepository<Veiculo, Integer>{

}
