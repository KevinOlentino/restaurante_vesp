package com.Restaurantes.Restaurantes.ControllersTests;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.Restaurantes.Restaurantes.controller.PedidoController;
import com.Restaurantes.Restaurantes.entity.Pedido;
import com.Restaurantes.Restaurantes.repositorio.PedidoRepositorio;


@SpringBootTest
class PedidoControllerTest {

	@Autowired
	private PedidoRepositorio repositorio;
	
	@Autowired
	private PedidoController controlador;
	
	@Test
	void testListar() {
		long expected; 
		long result;
		
		List<Pedido> pedidos = controlador.listarpedido();
		
		expected = repositorio.count();
		result = pedidos.size();
	
		System.out.print("Teste de Pedidos: esperado:" + expected + " resultado:" + result);
		if (result == expected) {
			System.out.println( "OK");
		} else {
			System.out.println( "FAIL");
		}
		
		assertThat(result).isEqualTo(expected);
		
	}
	
	@Test
	void testIncluir() {
		
		Pedido novo = new Pedido();
		novo.setCodigoPedido(0);
		novo.setCodigoPrato(3);
		novo.setCodigoCliente(3);
		novo.setQuantidade(1.6);
		novo.setPreco(20.30);
		novo.setPronto(true);
		
		long expected = repositorio.count()+1;
		
		repositorio.save(novo);
		repositorio.flush();
		
		long result = repositorio.count();
		
		System.out.print("Teste de Incluir Pedidios: esperado: " + expected + " resultado:" + result);
		if (result == expected) {
			System.out.println( " OK");
		} else {
			System.out.println( " FAIL");
		}
		
		assertThat(result).isEqualTo(expected);
		
	}

}
