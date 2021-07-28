package com.Restaurantes.Restaurantes.ControllersTests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Restaurantes.Restaurantes.controller.UtilController;
import com.Restaurantes.Restaurantes.repositorio.ClienteRepositorio;

@SpringBootTest
class UtilControllerTest1 {

	@Autowired
	private UtilController utilcontroller;
	
	@Autowired
	private ClienteRepositorio clienterepositorio;
	
	@Test
	void testSomar() {
		
		try {
		double a = 2;
		double b = 3;
		double expected = 5;
		
		double result = utilcontroller.somar(a, b);
		System.out.println("Teste de somar: esperado: " + expected + " resultado: " + result);
		assertThat(result).isEqualTo(expected);
		
		} catch(Exception ex) {
			fail("erro ao realizar teste: " + ex.getMessage());
		}
	}
	
	@Test
	void testQuantCliente() {
		
		try {
			int expected = (int) clienterepositorio.count();
			int result = utilcontroller.quant_cliente();
			
			System.out.println("Teste da quantidade de clientes: esperado: " + expected + " resultado: " + result);
			assertThat(result).isEqualTo(expected);
			
		}catch(Exception ex){
			fail("erro ao realizar teste: " + ex.getMessage());
		}
	}
	
	@Test
	void testTotalPedidos() {
		
		try {
				
			double expected = 2466.40;
			double result = Math.round( utilcontroller.totalPedidos()*100.0)/100.0;
			
			System.out.println("Teste de valor total de pedidos: esperado: " + expected + " resultado: " + result);
			assertThat(result).isEqualTo(expected);
						
		}catch(Exception ex){
			fail("erro ao realizar teste: " + ex.getMessage());
		}
	}
}
