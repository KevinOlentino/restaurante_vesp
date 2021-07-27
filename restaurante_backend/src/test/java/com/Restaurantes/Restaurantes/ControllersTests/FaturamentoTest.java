package com.Restaurantes.Restaurantes.ControllersTests;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Restaurantes.Restaurantes.controller.FaturamentoController;
import com.Restaurantes.Restaurantes.entity.Faturamento;
import com.Restaurantes.Restaurantes.repositorio.FaturamentoRepositorio;
@SpringBootTest
class FaturamentoTest {
	@Autowired
	private FaturamentoRepositorio repositorio;
	@Autowired
	private FaturamentoController controller;

	@Test
	void testFaturamento() {
		long expectativa;
		long resultado;
		List<Faturamento> faturamento = controller.listarfaturamento();
		
		expectativa = repositorio.count();
		resultado = faturamento.size();
		
		System.out.println("Teste lista dos faturamentos. Expectativa: " + expectativa + "resuldado: " + resultado);
		if (resultado == expectativa) {
			System.out.println("OK");
		}else {
			System.out.println("FALHA");
		}
		assertThat(resultado).isEqualTo(expectativa);
	}

}
