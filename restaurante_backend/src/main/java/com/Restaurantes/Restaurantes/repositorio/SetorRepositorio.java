package com.Restaurantes.Restaurantes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Restaurantes.Restaurantes.entity.Setor;

@Repository
public interface SetorRepositorio extends JpaRepository<Setor, Integer>{

}
