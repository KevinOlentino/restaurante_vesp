package com.Restaurantes.Restaurantes.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Restaurantes.Restaurantes.entity.Entrega;
import com.Restaurantes.Restaurantes.repositorio.EntregaRepositorio;

@RestController
@RequestMapping("entrega")
@CrossOrigin(origins={"http://localhost:9876", "http://localhost:4200", "http://localhost:8090"})
public class EntregaController {
	
	@Autowired
	private EntregaRepositorio entregaRepositorio;
	
	@PostMapping("incluir")
	public void incluir (@RequestBody Entrega novaEntrega) {
		entregaRepositorio.save(novaEntrega);
		entregaRepositorio.flush();
	}
	
	@GetMapping("listar")
	public List<Entrega> listarentrega(){
		return entregaRepositorio.findAll();
	}
}