package com.Restaurantes.Restaurantes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Restaurantes.Restaurantes.entity.Fornecedor;

@Repository
public interface FornecedorRepositorio extends JpaRepository<Fornecedor, Integer>{

}
