package com.Restaurantes.Restaurantes.ControllersTests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Restaurantes.Restaurantes.controller.FuncionarioController;
import com.Restaurantes.Restaurantes.entity.Funcionario;
import com.Restaurantes.Restaurantes.entity.FuncionarioQuantidade;
import com.Restaurantes.Restaurantes.repositorio.FuncionarioRepositorio;

@SpringBootTest
class FuncionarioControllerTest {

	@Autowired
	private FuncionarioRepositorio funcionariorepositorio;
	
	@Autowired
	private FuncionarioController funcionariocontroller;
	
	@Test
	void testListar() {
		try {
			long expected;
			long result;
			List<Funcionario> funcionarios = funcionariocontroller.listarfuncionario();
			
			expected = funcionariorepositorio.count();
			result = funcionarios.size();
			
			System.out.println("Teste de Listar Funcionarios: Expectativa: " + expected + " resultado: "+ result);
			if (result == expected) {
				System.out.println(" OK");
			}else {
				System.out.println(" FALHA");
			}
			assertThat(result).isEqualTo(expected);
		} catch (Exception ex) {
			fail("erro ao realizar teste: " + ex.getMessage());
		}
	}
	
	@Test
	void testQuantidadeFuncionario() {
		try {
			FuncionarioQuantidade algo = new FuncionarioQuantidade();
			
			float expected = funcionariorepositorio.count();
			algo = funcionariocontroller.quantidadefuncionario();
			float result = algo.getQuantidade();
			
			System.out.println("Teste de Funcionarios: esperado: " + expected + "  resultado: " + result);
			assertThat(result).isEqualTo(expected);
		}catch(Exception ex){
			fail("erro ao realizar teste: " + ex.getMessage());
		}
	}
}
