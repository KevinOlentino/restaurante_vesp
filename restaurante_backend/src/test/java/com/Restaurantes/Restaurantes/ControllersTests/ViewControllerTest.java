package com.Restaurantes.Restaurantes.ControllersTests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.Restaurantes.Restaurantes.controller.ViewController;
import com.Restaurantes.Restaurantes.repositorio.ListarClienteOrdemAlfabeticaRepositorio;
import com.Restaurantes.Restaurantes.repositorio.ViewPagamentoClienteRepositorio;
import com.Restaurantes.Restaurantes.repositorio.ViewPratoPorProdutoRepositorio;
import com.Restaurantes.Restaurantes.repositorio.ViewQuantidadePratosPorPedidoRepositorio;
import com.Restaurantes.Restaurantes.views.ListarClienteOrdemAlfabetica;
import com.Restaurantes.Restaurantes.views.ViewPagamentoCliente;
import com.Restaurantes.Restaurantes.views.ViewPratoPorProduto;
import com.Restaurantes.Restaurantes.views.ViewQuantidadePratosPorPedido;

@SpringBootTest
class ViewControllerTest {
	
	@Autowired
	ViewQuantidadePratosPorPedidoRepositorio qntPratosPedidoRepositorio;
	
	@Autowired
	ListarClienteOrdemAlfabeticaRepositorio repositorioOdemAlfa;
	
	@Autowired
	ViewPagamentoClienteRepositorio repositorioPagamentoCliente;
	
	@Autowired
	ViewController viewController;

	@Test
	void testListarPagamentoCliente() {
		try {
			
			long expected = repositorioPagamentoCliente.count();
			List<ViewPagamentoCliente> lista = viewController.ListarPagamentoCliente();
			long result = lista.size();
			System.out.println("Teste de Listar clientes ordem Alfabetica " + expected + " resultado: "+ result);
			
			assertThat(result).isEqualTo(expected);
			
		} catch( Exception ex) {
			fail("Erro ao Listar Pagamento");	
		}		
	}
	

	@Test
	void testListarOrdemAlfa() {
		try {
			long expected = repositorioOdemAlfa.count();
			List<ListarClienteOrdemAlfabetica> lista = viewController.ListarClienteOrdem();
			long result = lista.size();
			assertThat(result).isEqualTo(expected);
		} catch(Exception ex) {
			fail("Erro ao Listar os Clientes");
		}
	}
	
	@Autowired
	ViewPratoPorProdutoRepositorio repositorioPratoPorProduto;
	
	@Test
	void testListarPratoPorPrduto() {
		try {
			
			long expected = repositorioPratoPorProduto.count();
			List<ViewPratoPorProduto> lista = viewController.listarPratoPorProduto();
			long result = lista.size();
			System.err.println("OK");
			assertThat(result).isEqualTo(expected);
			
		} catch( Exception ex) {
			fail("Erro ao Listar Pagamento");	
		}
		
	}
	
	@Test
	void testListarQntPratosPorPedido() {
		
		try {
			
			long expected = qntPratosPedidoRepositorio.count();
			List<ViewQuantidadePratosPorPedido> lista = viewController.ListarQuantidadePratosPorPedido();
			long result = lista.size();
			
			assertThat(result).isEqualTo(expected);
			
		}catch(Exception ex){
			fail("Erro ao Listar Pagamento");	
		}
	}
	
}
