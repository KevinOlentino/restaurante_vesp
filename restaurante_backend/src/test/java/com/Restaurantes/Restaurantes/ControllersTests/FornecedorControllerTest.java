package com.Restaurantes.Restaurantes.ControllersTests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Restaurantes.Restaurantes.controller.FornecedorController;
import com.Restaurantes.Restaurantes.entity.Fornecedor;
import com.Restaurantes.Restaurantes.repositorio.FornecedorRepositorio;

@SpringBootTest
class FornecedorControllerTest {

	@Autowired
	private FornecedorRepositorio fornecedorrepositorio;
	
	@Autowired
	private FornecedorController fornecedorcontroller;
	
	
	@Test
	void testListarFornecedor() {
	
		try {
			
			long expected;
			long result;
			List<Fornecedor> fornecedores = fornecedorcontroller.listar();
			
			expected = fornecedorrepositorio.count();
			result = fornecedores.size();
			
			System.out.print("Teste de Listar Fornecedores: esperado: " + expected + " resultado: " + result);
			if (result == expected) {
				System.out.println( " OK");
			} else {
				System.out.println( " FAIL");
			}
			
			assertThat(result).isEqualTo(expected);
			
		}catch(Exception ex) {
			fail("erro ao realizar teste: " + ex.getMessage());
		}
	}
	
	@Test
	void testIncluir() {	
		
		try {
		Fornecedor novo = new Fornecedor();
		novo.setCodigo(0);
		novo.setNome("Friboi");
		novo.setTelefone("33269003");
		novo.setCodigoproduto(10);
		
		
		long expected = fornecedorrepositorio.count()+1;
		
		fornecedorrepositorio.save(novo);
		fornecedorrepositorio.flush();
		
		long result = fornecedorrepositorio.count();
		
		System.out.print("Teste de Incluir Fornecedor: esperado: " + expected + " resultado: " + result);
		if (result == expected) {
			System.out.println( " OK");
		} else {
			System.out.println( " FAIL");
		}
		
		assertThat(result).isEqualTo(expected);
		
		} catch(Exception ex) {
			fail("erro ao realizar teste: " + ex.getMessage());
		}
	}
}
