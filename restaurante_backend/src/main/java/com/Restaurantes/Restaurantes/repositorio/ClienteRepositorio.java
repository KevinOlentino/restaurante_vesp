package com.Restaurantes.Restaurantes.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Restaurantes.Restaurantes.entity.Cliente;

public interface ClienteRepositorio extends JpaRepository<Cliente, Integer> {

   
}
