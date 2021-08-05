package com.Restaurantes.Restaurantes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Restaurantes.Restaurantes.entity.Cliente;

public interface ClienteRepositorio extends JpaRepository<Cliente, Integer> {

   
}
