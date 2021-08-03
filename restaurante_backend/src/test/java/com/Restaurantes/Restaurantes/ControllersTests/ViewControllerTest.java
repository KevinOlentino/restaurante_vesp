package com.Restaurantes.Restaurantes.ControllersTests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Restaurantes.Restaurantes.controller.ViewController;
import com.Restaurantes.Restaurantes.repositorio.ViewPagamentoClienteRepositorio;
import com.Restaurantes.Restaurantes.views.ViewPagamentoCliente;

@SpringBootTest
class ViewControllerTest {
	
	
	@Autowired
	ViewPagamentoClienteRepositorio repositorioPagamentoCliente;
	
	@Autowired
	ViewController viewController;

	@Test
	void testListarPagamentoCliente() {
		try {
			
			long expected = repositorioPagamentoCliente.count();
			List<ViewPagamentoCliente> lista = viewController.ListarPagamentoCliente();
			long result = lista.size();
			
			assertThat(result).isEqualTo(expected);
			
		} catch( Exception ex) {
			fail("Erro ao Listar Pagamento");	
		}
		
		
	}

}
