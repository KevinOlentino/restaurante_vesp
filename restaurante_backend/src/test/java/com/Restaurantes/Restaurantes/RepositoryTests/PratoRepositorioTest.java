package com.Restaurantes.Restaurantes.RepositoryTests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Restaurantes.Restaurantes.repositorio.PratoRepositorio;

@SpringBootTest
class PratoRepositorioTest {

	@Autowired
	private PratoRepositorio repo;
	
	@Test
	void testRepositorio() {
		
		try {
			long expected = 1;
			long result= this.repo.count();
			System.out.println("Teste de Prato Repositorio: esperado >=" + expected + " resultado: " + result);		
			assertThat(result).isGreaterThanOrEqualTo(expected);
		} catch (Exception ex ) {
			fail("Falha ao testar prato repositorio:" + ex.getMessage());
		}
		
	}

}
