package com.Restaurantes.Restaurantes.ControllersTests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Restaurantes.Restaurantes.controller.PratoController;
import com.Restaurantes.Restaurantes.entity.Prato;
import com.Restaurantes.Restaurantes.repositorio.PratoRepositorio;

@SpringBootTest
class PratoControllerTest {

	@Autowired
	private PratoRepositorio repositorio;
	
	@Autowired
	private PratoController controlador;
	
	@Test
	void testListar() {
		
		
		long expected;
		long result;
		List<Prato> pratos = controlador.listarprato();
		
		expected = repositorio.count();
		result = pratos.size();
		
		System.out.print("Teste de Listar Pratos: esperado:" + expected + " resultado:" + result);
		if (result == expected) {
			System.out.println( " OK");
		} else {
			System.out.println( " FAIL");
		}
		
		assertThat(result).isEqualTo(expected);

	}
	
	@Test
	void testIncluir() {
		
		Prato novo = new Prato();
		novo.setCodprato(0);
		novo.setDescricao("Mais um prato novo)");
		novo.setPreco(49.90);
		
		long expected = repositorio.count()+1;
		
		repositorio.save(novo);
		repositorio.flush();
		
		long result = repositorio.count();
		
		System.out.print("Teste de Incluir Pratos: esperado:" + expected + " resultado:" + result);
		if (result == expected) {
			System.out.println( " OK");
		} else {
			System.out.println( " FAIL");
		}
		
		assertThat(result).isEqualTo(expected);
		
	}

}
