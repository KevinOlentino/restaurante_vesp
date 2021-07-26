package com.Restaurantes.Restaurantes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Restaurantes.Restaurantes.entity.Faturamento;
import com.Restaurantes.Restaurantes.repositorio.FaturamentoRepositorio;

@RestController
@RequestMapping("faturamento")
@CrossOrigin(origins="http://localhost:4200")
public class FaturamentoController {
    
	@Autowired
	private FaturamentoRepositorio repositorio;
	
	@GetMapping("listar")
	public List<Faturamento> listarfaturamento(){
		return repositorio.findAll();
		
	}
}
