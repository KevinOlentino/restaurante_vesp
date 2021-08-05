package com.Restaurantes.Restaurantes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Restaurantes.Restaurantes.views.ViewPagamentoCliente;

@Repository
public interface ViewPagamentoClienteRepositorio extends JpaRepository<ViewPagamentoCliente, Integer> {

	
}

