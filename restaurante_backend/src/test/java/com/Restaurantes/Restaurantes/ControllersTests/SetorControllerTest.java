package com.Restaurantes.Restaurantes.ControllersTests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Restaurantes.Restaurantes.controller.SetorController;
import com.Restaurantes.Restaurantes.entity.Setor;
import com.Restaurantes.Restaurantes.repositorio.SetorRepositorio;

@SpringBootTest
class SetorControllerTest {

	@Autowired
	private SetorRepositorio setorrespositorio;
	
	@Autowired
	private SetorController setorcontroller;
	
	@Test
	void testlistar() {
		
		try {
			long expected;
			long result;
			List<Setor> setores = setorcontroller.listar();
			
			expected = setorrespositorio.count();
			result = setores.size();
			assertThat(result).isEqualTo(expected);
			
		}catch(Exception ex) {
			fail("erro ao realizar teste: " + ex.getMessage());
		}
	}

	@Test
	void testincluir() {
		try {
			
			Setor novo = new Setor();
			novo.setCodigosetor(0);
			novo.setNome("Limpeza");
			
			long expected = setorrespositorio.count()+1;
			
			setorrespositorio.save(novo);
			setorrespositorio.flush();
			
			long result = setorrespositorio.count();
			
			assertThat(result).isEqualTo(expected);
			
		}catch (Exception ex) {
			fail("erro ao realizar teste: " + ex.getMessage());
		}
	}
}
