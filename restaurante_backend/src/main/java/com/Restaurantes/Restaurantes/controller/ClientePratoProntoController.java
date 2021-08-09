package com.Restaurantes.Restaurantes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Restaurantes.Restaurantes.entity.ClientePratoPronto;
import com.Restaurantes.Restaurantes.repositorio.ClientePratoProntoRepositorio;

@RestController
@RequestMapping("clientepratopronto")
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8090"})
public class ClientePratoProntoController {
	
	@Autowired
	 private ClientePratoProntoRepositorio clientePratoProntoRepositorio;
	 
	 @GetMapping("listar")
		public List<ClientePratoPronto> listarClientePratoPronto(){
			return clientePratoProntoRepositorio.findAll();	
		}
}
