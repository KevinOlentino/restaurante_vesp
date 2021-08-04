package com.Restaurantes.Restaurantes.ControllersTests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Restaurantes.Restaurantes.controller.ClienteLoginController;
import com.Restaurantes.Restaurantes.entity.ClienteAutorizado;
import com.Restaurantes.Restaurantes.entity.ClienteLogin;

@SpringBootTest
class ClienteLoginControllerTest {

	@Autowired
	private ClienteLoginController clientelogincontroller;
	
	@Test
	void testLogar() {
		
		try {
		ClienteLogin clientelogin = new ClienteLogin();
		clientelogin.setCodCliente(1);
		clientelogin.setSenha("a");
		
		ClienteAutorizado aut = clientelogincontroller.logar(clientelogin);
		
		Boolean expected = true;
		Boolean result = aut.getAutorizado();
		
		System.out.println("Teste de Login: esperado: " + expected + " resultado: " + result);
		assertThat(result).isEqualTo(expected);
		
		}catch(Exception ex){
			fail("erro ao realizar teste: " + ex.getMessage());
		}
	}
}
