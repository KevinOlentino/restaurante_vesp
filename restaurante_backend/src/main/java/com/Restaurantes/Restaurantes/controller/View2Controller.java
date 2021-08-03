package com.Restaurantes.Restaurantes.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Restaurantes.Restaurantes.repositorio.ListarClienteOrdemAlfabeticaRepositorio;
import com.Restaurantes.Restaurantes.views.ListarClienteOrdemAlfabetica;

@RestController
@RequestMapping("view2")
@CrossOrigin(origins={"http://localhost:4200","http://localhost:9876"})
public class View2Controller {
	
	@Autowired
	ListarClienteOrdemAlfabeticaRepositorio clienteOrdemAlfabetica;
	
	@GetMapping("listarclienteordemalfa")
	public List<ListarClienteOrdemAlfabetica> ListarClienteOrdem(){
		return clienteOrdemAlfabetica.findAll(Sort.by("nome"));		
	}
}
