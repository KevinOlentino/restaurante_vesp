package com.Restaurantes.Restaurantes.controller;

import org.springframework.beans.factory.annotation.Autowired;

i


	@SpringBootTest
	public class View4Controller {

		@Autowired
		ViewQuantidadePratosPorPedidoRepositorio qntPratosPedidoRepositorio;
		
		@Autowired
		ViewController1 viewController1;
		
		@Test
		void testListarQntPratosPorPedido() {
			
			try {
				
				long expected = qntPratosPedidoRepositorio.count();
				List<ViewQuantidadePratosPorPedido> lista = viewController1.ListarQuantidadePratosPorPedido();
				long result = lista.size();
				
				assertThat(result).isEqualTo(expected);
				
			}catch(Exception ex){
				fail("Erro ao Listar Pagamento");	
			}
		}
	}
}
