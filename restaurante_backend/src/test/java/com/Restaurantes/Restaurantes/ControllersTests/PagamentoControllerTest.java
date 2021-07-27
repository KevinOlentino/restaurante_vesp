package com.Restaurantes.Restaurantes.ControllersTests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Restaurantes.Restaurantes.entity.Pagamento;
import com.Restaurantes.Restaurantes.repositorio.PagamentoRepositorio;

@SpringBootTest
class PagamentoControllerTest {
	
	@Autowired
	private PagamentoRepositorio pagamentorepositorio;

	@Test
	void testeIncluirPagamento() {
		
		try {
		Pagamento novopagamento = new Pagamento();
		novopagamento.setCodigopagamento(0);
		novopagamento.setCodigocliente(1);
		novopagamento.setCodigopedido(3);
		novopagamento.setValorpago(9.99);
		
		long expected = pagamentorepositorio.count()+1;
		
		pagamentorepositorio.save(novopagamento);
		pagamentorepositorio.flush();
		
		long result = pagamentorepositorio.count();
		
		System.out.print("Teste de Incluir Pagamentos: esperado:" + expected + " resultado:" + result);
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
