package com.Restaurantes.Restaurantes.ControllersTests;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.Restaurantes.Restaurantes.controller.EntregaController;
import com.Restaurantes.Restaurantes.entity.Entrega;
import com.Restaurantes.Restaurantes.repositorio.EntregaRepositorio;

@SpringBootTest
class EntregaTest {
	
	@Autowired
	private EntregaRepositorio entregaRepositorio;
	
	@Autowired
	private EntregaController entregaController;

	@Test
	void listarentrega() {
		long expected;
		long result;
		List<Entrega> entrega = entregaController.listarentrega();
		
		expected = entregaRepositorio.count();
		result = entrega.size();
		
		System.out.println("Teste Listar Entrega: " + expected + " resultado: " + result);
		if (result == expected) {
			System.out.println("Teste Ok.");
		}else {
			System.out.println("Teste FAIL.");
		}
		assertThat(result).isEqualTo(expected);		
	}
	
	@Test
	void incluirentrega() {
		
		Entrega nova = new Entrega();
		nova.setCodigo(0);
		nova.setCodigoCliente(1);
		nova.setEndereco("Um novo endereco");
		
		long expected = entregaRepositorio.count()+1;
		
		entregaRepositorio.save(nova);
		entregaRepositorio.flush();
		
		long result = entregaRepositorio.count();
		
		System.out.println("Teste incluir Entrega: " + expected + "Resultado: " + result);
		if (result == expected) {
			System.out.println("Teste OK.");			
		}else {
			System.out.println("Teste FAIL.");
		}
		assertThat(result).isEqualTo(expected);		
	}
}
