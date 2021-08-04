package com.Restaurantes.Restaurantes.ControllersTests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Restaurantes.Restaurantes.controller.ViewController3;
import com.Restaurantes.Restaurantes.repositorio.ViewPratoPorProdutoRepositorio;
import com.Restaurantes.Restaurantes.views.ViewPratoPorProduto;


@SpringBootTest
class ViewControllerTest3 {

	@Autowired
	ViewPratoPorProdutoRepositorio repositorioPratoPorProduto;
	
	@Autowired
	ViewController3 viewController;

	@Test
	void testListarPratoPorPrduto() {
		try {
			
			long expected = repositorioPratoPorProduto.count();
			List<ViewPratoPorProduto> lista = viewController.listarPratoPorProduto();
			long result = lista.size();
			System.err.println("OK");
			assertThat(result).isEqualTo(expected);
			
		} catch( Exception ex) {
			fail("Erro ao Listar Pagamento");	
		}
		
		
	}

}
