package com.Restaurantes.Restaurantes.ControllersTests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Restaurantes.Restaurantes.controller.UtilController;
import com.Restaurantes.Restaurantes.repositorio.PedidoRepositorio;


@SpringBootTest
class UtilControllerTest3 {
	
	@Autowired
	private PedidoRepositorio pedidorepositorio;
	@Autowired
	private UtilController utilcontroller;
	
	@Test
	void testDelta() {
		
		try {
			UtilController teste = new UtilController();
			double result = teste.bx1(2, 8, -24);
			double expected = 256;
			
			System.out.println("Resultado do delta: esperado: " + expected + " resultado: " + result);
			assertThat(result).isEqualTo(expected);
			
		}catch(Exception ex){
			fail("erro ao realizar teste: " + ex.getMessage());
		}	
	}
	
	@Test
	void testQuant_pedido() {
		
		try {
			long expected = pedidorepositorio.count();
			long result = utilcontroller.quant_pedido();
			
			System.out.println("Teste de Pedidos: esperado: " + expected + "  resultado: " + result);
			assertThat(result).isEqualTo(expected);
		}catch(Exception ex){
			fail("erro ao realizar teste: " + ex.getMessage());
		}
	}
}
