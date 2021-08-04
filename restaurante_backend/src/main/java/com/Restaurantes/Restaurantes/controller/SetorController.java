package com.Restaurantes.Restaurantes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Restaurantes.Restaurantes.entity.Setor;
import com.Restaurantes.Restaurantes.repositorio.SetorRepositorio;

@RestController
@RequestMapping("setor")
@CrossOrigin(origins={"http://localhost:4200", "http://localhost:9876"})
public class SetorController {

	@Autowired
	private SetorRepositorio setorrepositorio;
	
	@PostMapping("incluir")
	public void incluir(@RequestBody Setor novoSetor) {
		this.setorrepositorio.save(novoSetor);
		this.setorrepositorio.flush();
	}	
	
	@GetMapping("listar")
	public List<Setor> listar(){
		return setorrepositorio.findAll();
	}
}
