package com.Restaurantes.Restaurantes.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Restaurantes.Restaurantes.entity.Cliente;

public interface ClienteRepositorio extends JpaRepository<Cliente, Integer> {


    @Query("SELECT p FROM cliente p where p.nome like %?1% ")
    public List<Cliente> buscar(String keyword);
    
}
