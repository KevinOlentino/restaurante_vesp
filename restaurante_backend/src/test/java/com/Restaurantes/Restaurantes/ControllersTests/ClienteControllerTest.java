package com.Restaurantes.Restaurantes.ControllersTests;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Restaurantes.Restaurantes.controller.ClienteController;
import com.Restaurantes.Restaurantes.entity.Cliente;
import com.Restaurantes.Restaurantes.repositorio.ClienteRepositorio;
@SpringBootTest
class ClienteControllerTest {
	@Autowired
	private ClienteRepositorio repositorio;
	@Autowired
	private ClienteController controller;
	
	@Test
	void testListar() {
		long expectativa;
		long resultado;
		List<Cliente> clientes = controller.listar();
		
		expectativa = repositorio.count();
		resultado = clientes.size();
		
		System.out.println("Teste de Listar Clientes: Expectativa:" + expectativa + "resultado: "+ resultado);
		if (resultado == expectativa) {
			System.out.println("OK");
		}else {
			System.out.println("FALHA");
		}
		assertThat(resultado).isEqualTo(expectativa);
	}
		
	@Test
	void testIncluir() {
		Cliente novo = new Cliente();
		novo.setCodigocliente(0);
		novo.setNome("Outro cliente");
		novo.setEmail("email@email.com");
		novo.setSenha("12541254");
		
		long expectativa = repositorio.count()+1;
		repositorio.save(novo);
		repositorio.flush();
		
		long resultado = repositorio.count();
		System.out.println("Testando inclusão de clientes. Expectativa: " + expectativa + "resuldado: " + resultado);
		if (resultado == expectativa) {
			System.out.println("OK");
		}else {
			System.out.println("FALHA");
		}
		assertThat(resultado).isEqualTo(expectativa);
	}	
}
