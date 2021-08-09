package com.Restaurantes.Restaurantes.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Restaurantes.Restaurantes.entity.PedidosPendentes;
import com.Restaurantes.Restaurantes.repositorio.PedidosPendentesRepositorio;

@RestController
@RequestMapping("pedidospendentes")
@CrossOrigin(origins={"http://localhost:4200", "http://localhost:8090"})
public class PedidosPendentesController {
	
	@Autowired
	private PedidosPendentesRepositorio pedidosPendentes;
	
	@GetMapping("listar")
	public List<PedidosPendentes>listar(){
		return pedidosPendentes.findAll();
	}

}
