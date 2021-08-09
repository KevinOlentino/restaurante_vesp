package com.Restaurantes.Restaurantes.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Restaurantes.Restaurantes.repositorio.ListarClienteOrdemAlfabeticaRepositorio;
import com.Restaurantes.Restaurantes.repositorio.ViewPagamentoClienteRepositorio;
import com.Restaurantes.Restaurantes.repositorio.ViewPratoPorProdutoRepositorio;
import com.Restaurantes.Restaurantes.repositorio.ViewQuantidadePratosPorPedidoRepositorio;
import com.Restaurantes.Restaurantes.views.ListarClienteOrdemAlfabetica;
import com.Restaurantes.Restaurantes.views.ViewPagamentoCliente;
import com.Restaurantes.Restaurantes.views.ViewPratoPorProduto;
import com.Restaurantes.Restaurantes.views.ViewQuantidadePratosPorPedido;

@RestController
@RequestMapping("views")
@CrossOrigin( origins={"http://localhost:4200", "http://localhost:8090","http://localhost:9876"})
public class ViewController {
	
	
	@Autowired
	ViewPagamentoClienteRepositorio repositorioPagamentoCliente;
	@Autowired
	ViewQuantidadePratosPorPedidoRepositorio repositorioQntPratosPorPedido;
	@Autowired
	ViewPratoPorProdutoRepositorio pratoporprodutorepositorio;
	@Autowired
	ListarClienteOrdemAlfabeticaRepositorio clienteOrdemAlfabetica;

	
	@GetMapping("listapagamentocliente")
	public List<ViewPagamentoCliente> ListarPagamentoCliente() {
		return repositorioPagamentoCliente.findAll(Sort.by("nome"));
	}
	
	@GetMapping("listaqntpratosporpedido")
	public List<ViewQuantidadePratosPorPedido> ListarQuantidadePratosPorPedido() {
		return repositorioQntPratosPorPedido.findAll();
	}
	
	@GetMapping("listarpratoporproduto")
	public List<ViewPratoPorProduto>listarPratoPorProduto() {
		return pratoporprodutorepositorio.findAll();
	}
	
	
	@GetMapping("listarclienteordemalfa")
	public List<ListarClienteOrdemAlfabetica> ListarClienteOrdem(){
		return clienteOrdemAlfabetica.findAll(Sort.by("nome"));		
	}
	
	
	
}

	
