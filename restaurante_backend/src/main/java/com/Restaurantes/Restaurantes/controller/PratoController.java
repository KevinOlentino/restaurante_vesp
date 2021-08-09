package com.Restaurantes.Restaurantes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.Restaurantes.Restaurantes.entity.Prato;
import com.Restaurantes.Restaurantes.repositorio.PratoRepositorio;
 

@RestController
@RequestMapping("prato")
@CrossOrigin(origins={"http://localhost:4200", "http://localhost:8090", "http://localhost:9876"})
public class PratoController {
     
	@Autowired
	private PratoRepositorio repositorio;
	
	@GetMapping("listar")
	public  List<Prato> listarprato(){		
		return repositorio.findAll();
	}
	
	@PostMapping("incluir")
	public void incluir(@RequestBody Prato novoPrato) {
		
		repositorio.save(novoPrato);
		repositorio.flush();
	}
}
