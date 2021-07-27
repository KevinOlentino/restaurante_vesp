package com.Restaurantes.Restaurantes.ControllersTests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Restaurantes.Restaurantes.controller.ClientePratoProntoController;
import com.Restaurantes.Restaurantes.entity.ClientePratoPronto;
import com.Restaurantes.Restaurantes.repositorio.ClientePratoProntoRepositorio;
import java.util.List;

@SpringBootTest
class ClientePratoProntoControllerTest {

	@Autowired
	private ClientePratoProntoRepositorio repositorio;
	
	@Autowired
	private ClientePratoProntoController controlador;
	
	@Test
	void testListar() {
		
		long expected;
		long result;
		
		List<ClientePratoPronto> clientepratoprontos = controlador.listarClientePratoPronto();
		
		expected = repositorio.count();
		result = clientepratoprontos.size();
		
		System.out.print("Teste de Listar Clientes Prato Pronto: esperado:" + expected + " resultado:" + result);
		if (result == expected) {
			System.out.println( " OK");
		} else {
			System.out.println( " FAIL");
		}
		assertThat(result).isEqualTo(expected);
	}

}
