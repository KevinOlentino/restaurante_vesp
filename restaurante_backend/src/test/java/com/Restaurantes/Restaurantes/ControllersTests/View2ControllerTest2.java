package com.Restaurantes.Restaurantes.ControllersTests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.Restaurantes.Restaurantes.controller.View2Controller;
import com.Restaurantes.Restaurantes.repositorio.ListarClienteOrdemAlfabeticaRepositorio;
import com.Restaurantes.Restaurantes.views.ListarClienteOrdemAlfabetica;

@SpringBootTest
class View2ControllerTest2 {
	
	@Autowired
	ListarClienteOrdemAlfabeticaRepositorio repositorioOdemAlfa;
	
	@Autowired
	View2Controller view2Controller;
	
	@Test
	void testListarOrdemAlfa() {
		try {
			long expected = repositorioOdemAlfa.count();
			List<ListarClienteOrdemAlfabetica> lista = view2Controller.ListarClienteOrdem();
			long result = lista.size();
			assertThat(result).isEqualTo(expected);
		} catch(Exception ex) {
			fail("Erro ao Listar os Clientes");
		}
	}

}
