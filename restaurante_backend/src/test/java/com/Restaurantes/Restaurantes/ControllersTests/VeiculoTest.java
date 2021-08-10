package com.Restaurantes.Restaurantes.ControllersTests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Restaurantes.Restaurantes.controller.VeiculoController;

import com.Restaurantes.Restaurantes.entity.Veiculo;
import com.Restaurantes.Restaurantes.repositorio.VeiculoRepositorio;

@SpringBootTest
class VeiculoTest {

	@Autowired
	private VeiculoRepositorio veiculorepositorio;
	
	@Autowired
	private VeiculoController veiculocontroller;
	@Test
	void testListar() {
		long expected; 
		long result;
		
		List<Veiculo> veiculos = veiculocontroller.Listar();
		
		expected = veiculorepositorio.count();
		result = veiculos.size();
	
		System.out.print("Teste de Pedidos: esperado:" + expected + " resultado:" + result);
		if (result == expected) {
			System.out.println( "OK");
		} else {
			System.out.println( "FAIL");
		}
		
		assertThat(result).isEqualTo(expected);
	}
	
	@Test
	void testIncluir() {
		Veiculo novo = new Veiculo();
		novo.setCodigo(0);
		novo.setNome("Fiat");
		novo.setPlaca("tegd7");
		novo.setCodigoFuncionario(2);
		
		long expected = veiculorepositorio.count()+1;
		
		veiculorepositorio.save(novo);
		veiculorepositorio.flush();
		
		long result = veiculorepositorio.count();
		
		System.out.print("Teste de Incluir Veiculos: esperado: " + expected + " resultado:" + result);
		if (result == expected) {
			System.out.println( " OK");
		} else {
			System.out.println( " FAIL");
		}
		
		assertThat(result).isEqualTo(expected);
	}
	}

