package com.Restaurantes.Restaurantes.ControllersTests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Restaurantes.Restaurantes.controller.PratoController;
import com.Restaurantes.Restaurantes.controller.UtilController;
import com.Restaurantes.Restaurantes.entity.Pedido;
import com.Restaurantes.Restaurantes.entity.Prato;
import com.Restaurantes.Restaurantes.repositorio.ClienteRepositorio;
import com.Restaurantes.Restaurantes.repositorio.PedidoRepositorio;
import com.Restaurantes.Restaurantes.repositorio.PratoRepositorio;

@SpringBootTest
class UtilControllerTest {

	@Autowired
	private UtilController utilcontroller;
	
	@Autowired
	private ClienteRepositorio clienterepositorio;
	
	@Autowired
	private PedidoRepositorio pedidoRepositorio;
	
	@Autowired
	private PratoRepositorio pratorep;
	@Autowired
	private PratoController pratocont;
	
	@Autowired
	private UtilController utilcont;
	
	@Autowired
	private PedidoRepositorio pedidorepositorio;

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
				
			//SomaPrecoPedido total = somaprecoPedidoRepositorio.findById(1).get();
			//double expected = Math.round(total.getSoma()*100.0)/100.0;
			
			double expected = 0;
			double soma = 0;
			
			List<Pedido> pedidos = pedidoRepositorio.findAll();
			
			for( Pedido p : pedidos) {
				soma += p.getPreco();
			}
			
			expected = Math.round( soma * 100.0)/100.0;
			double result = Math.round( utilcontroller.totalPedidos()*100.0)/100.0;
			
			System.out.println("Teste de valor total de pedidos: esperado: " + expected + " resultado: " + result);
			assertThat(result).isEqualTo(expected);
						
		}catch(Exception ex){
			fail("erro ao realizar teste: " + ex.getMessage());
		}
	}
	
	
	@Test
	void testpi() {
		double expected;
		double result;
		
		expected = 3.14159;
		result = utilcont.pi();
		System.out.println("O valor de pí tem que ser: " + expected + " e o resultado foi: " + result);
		if (expected == result) {
			System.out.println("O valor de pí está correto.");
		}else {
			System.out.print("O valor de pí não está correto.");
		}
		assertThat(result).isEqualTo(expected);
	}
	
	@Test
	void testListarPratos() {
		long expected;
		long result;
		List<Prato> pratos = pratocont.listarprato();
		
		expected = pratorep.count();
		result = pratos.size();
		System.out.println("A quantidade de pratos é: " + expected + " e a quantidade listada é: " + result);
		if (expected == result) {
			System.out.println("Quantidade correta.");
		}else {
			System.out.println("FALHA");
		}
		assertThat(result).isEqualTo(expected);
		
	}
	
	
	
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
	
	@Test
	void testVelocidade() {
		double expected;
		double result;
		
		expected = utilcont.velocidade(100, 1);
		result = 100;
		System.out.println("A velocidade esperada é: " + expected + " e o resultado foi: " + result);
		assertThat(result).isEqualTo(expected);
	}
	
	@Test
	void testfaturamento() {
		double expected;
		double result;
		
		expected = 625.02;
		result = utilcont.totalFaturamento();
		assertThat(result).isEqualTo(expected);
	}
	
}
