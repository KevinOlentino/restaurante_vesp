package com.Restaurantes.Restaurantes.ControllersTests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Restaurantes.Restaurantes.controller.ProdutoController;
import com.Restaurantes.Restaurantes.entity.Produto;
import com.Restaurantes.Restaurantes.entity.ProdutoQuantidade;
import com.Restaurantes.Restaurantes.repositorio.ProdutoRepositorio;


@SpringBootTest
class ProdutoControllerTest {
	
	@Autowired
	private ProdutoRepositorio repositorio;
	@Autowired
	private ProdutoController controller;

	@Test
	void testListarproduto() {
		long expected;
		long result;
		List<Produto> produtos = controller.listarproduto();
		
		expected = repositorio.count();
		result = produtos.size();
		
		System.out.println("Teste de Listar Produtos: Expectativa: " + expected + "resultado: "+ result);
		if (result == expected) {
			System.out.println(" OK");
		}else {
			System.out.println(" FALHA");
		}
		assertThat(result).isEqualTo(expected);
	}
		
	@Test
	void testQuant_produto() {
		try {
			ProdutoQuantidade algo = new ProdutoQuantidade();
			
			float expected = repositorio.count();
			algo = controller.quant_Produto();
			float result = algo.getQuantidade();
			
			System.out.println("Teste de Produtos: esperado: " + expected + "  resultado: " + result);
			assertThat(result).isEqualTo(expected);
		}catch(Exception ex){
			fail("erro ao realizar teste: " + ex.getMessage());
		}
	}

}
