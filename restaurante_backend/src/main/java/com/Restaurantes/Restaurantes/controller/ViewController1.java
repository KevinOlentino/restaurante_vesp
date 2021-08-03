package com.Restaurantes.Restaurantes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Restaurantes.Restaurantes.repositorio.ViewQuantidadePratosPorPedidoRepositorio;
import com.Restaurantes.Restaurantes.views.ViewQuantidadePratosPorPedido;

@RestController
@RequestMapping("views1")
@CrossOrigin( origins={"http://localhost:4200","http://localhost:9876"})
public class ViewController1 {
	
	@Autowired
	ViewQuantidadePratosPorPedidoRepositorio repositorioQntPratosPorPedido;
	
	@GetMapping("listaqntpratosporpedido")
	public List<ViewQuantidadePratosPorPedido> ListarQuantidadePratosPorPedido() {
		return repositorioQntPratosPorPedido.findAll();
	}
}
