package com.Restaurantes.Restaurantes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Restaurantes.Restaurantes.entity.Fornecedor;
import com.Restaurantes.Restaurantes.repositorio.FornecedorRepositorio;

@RestController
@RequestMapping("fornecedor")
@CrossOrigin(origins={"http://localhost:4200", "http://localhost:8090", "http://localhost:9876"})
public class FornecedorController {

	
	@Autowired
	private FornecedorRepositorio fornecedorrepositorio;
	
	@GetMapping("listar")
	public  List<Fornecedor> listar(){
		return fornecedorrepositorio.findAll();
	}
	
	@PostMapping("incluir")
	public void incluir(@RequestBody Fornecedor novoFornecedor) {
		fornecedorrepositorio.save(novoFornecedor);
		fornecedorrepositorio.flush();
	}
	
}
