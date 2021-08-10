package com.Restaurantes.Restaurantes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Restaurantes.Restaurantes.entity.Veiculo;
import com.Restaurantes.Restaurantes.repositorio.VeiculoRepositorio;

@RestController
@RequestMapping("veiculo")
@CrossOrigin(origins={"http://localhost:9876", "http://localhost:4200", "http://localhost:8090"})
public class VeiculoController {
	
	@Autowired
	private VeiculoRepositorio veiculorespositorio;
	
	@GetMapping("listar")
	public List<Veiculo> Listar() {
		return veiculorespositorio.findAll();
	}

	
	@PostMapping("incluir")
	public void Incluir(@RequestBody Veiculo novoVeiculo) {
		veiculorespositorio.save(novoVeiculo);
		veiculorespositorio.flush();
	}
	
}
