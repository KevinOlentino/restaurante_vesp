package com.Restaurantes.Restaurantes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Restaurantes.Restaurantes.repositorio.ViewPagamentoClienteRepositorio;
import com.Restaurantes.Restaurantes.views.ViewPagamentoCliente;

@RestController
@RequestMapping("views")
@CrossOrigin( origins={"http://localhost:4200","http://localhost:9876"})
public class ViewController {
	
	
	@Autowired
	ViewPagamentoClienteRepositorio repositorioPagamentoCliente;
	
	
	@GetMapping("listapagamentocliente")
	public List<ViewPagamentoCliente> ListarPagamentoCliente() {
		return repositorioPagamentoCliente.findAll();
	}
	
	
}
