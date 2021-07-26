package com.Restaurantes.Restaurantes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Restaurantes.Restaurantes.entity.Prato;

@Repository
public interface PratoRepositorio extends JpaRepository <Prato, Integer> {

}
