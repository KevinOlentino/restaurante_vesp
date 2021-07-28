package com.Restaurantes.Restaurantes.ControllersTests;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.Restaurantes.Restaurantes.controller.PratoController;
import com.Restaurantes.Restaurantes.controller.UtilController;
import com.Restaurantes.Restaurantes.entity.Prato;
import com.Restaurantes.Restaurantes.repositorio.PratoRepositorio;

@SpringBootTest
public class UtilControllerTest2 {
	@Autowired
	private PratoRepositorio pratorep;
	@Autowired
	private PratoController pratocont;
	
	@Autowired
	private UtilController utilcont;
	
	@Test
	void utilTest2() {
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
	void util2Test2() {
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
}
