package com.Restaurantes.Restaurantes.ControllersTests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Restaurantes.Restaurantes.controller.ProdutoController;
import com.Restaurantes.Restaurantes.entity.Produto;
import com.Restaurantes.Restaurantes.repositorio.ProdutoRepositorio;


@SpringBootTest
class ProdutoControllerTest {
	
	@Autowired
	private ProdutoRepositorio repositorio;
	@Autowired
	private ProdutoController controller;

	@Test
	void testListar() {
		long expected;
		long result;
		List<Produto> produtos = controller.listarproduto();
		
		expected = repositorio.count();
		result = produtos.size();
		
		System.out.println("Teste de Listar Produtos: Expectativa:" + expected + "resultado: "+ result);
		if (result == expected) {
			System.out.println("OK");
		}else {
			System.out.println("FALHA");
		}
		assertThat(result).isEqualTo(expected);
	}
		
	@Test
	void testIncluir() {
		Produto novo = new Produto();
		novo.setCodigo(0);
		novo.setNome("Agrotoxico");
		novo.setPreco(17.90);
		novo.setQuantidade(2);
		
		long expected = repositorio.count()+1;
		repositorio.save(novo);
		repositorio.flush();
		
		long result = repositorio.count();
		System.out.println("Testando inclusão de clientes. Expectativa: " + expected + "resuldado: " + result);
		if (result == expected) {
			System.out.println(" OK");
		}else { 
			System.out.println(" FAIL");
		}
		assertThat(result).isEqualTo(expected);
	}	

}
