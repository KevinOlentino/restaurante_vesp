package com.Restaurantes.Restaurantes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Restaurantes.Restaurantes.views.ListarClienteOrdemAlfabetica;

@Repository
public interface ListarClienteOrdemAlfabeticaRepositorio extends JpaRepository<ListarClienteOrdemAlfabetica, Integer> {

}
