package com.Restaurantes.Restaurantes.ControllersTests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Restaurantes.Restaurantes.controller.ViewController1;
import com.Restaurantes.Restaurantes.repositorio.ViewQuantidadePratosPorPedidoRepositorio;
import com.Restaurantes.Restaurantes.views.ViewQuantidadePratosPorPedido;

import java.util.List;

@SpringBootTest
public class ViewController1Test {

	@Autowired
	ViewQuantidadePratosPorPedidoRepositorio qntPratosPedidoRepositorio;
	
	@Autowired
	ViewController1 viewController1;
	
	@Test
	void testListarQntPratosPorPedido() {
		
		try {
			
			long expected = qntPratosPedidoRepositorio.count();
			List<ViewQuantidadePratosPorPedido> lista = viewController1.ListarQuantidadePratosPorPedido();
			long result = lista.size();
			
			assertThat(result).isEqualTo(expected);
			
		}catch(Exception ex){
			fail("Erro ao Listar Pagamento");	
		}
	}
}
