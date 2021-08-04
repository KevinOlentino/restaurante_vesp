package com.Restaurantes.Restaurantes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Restaurantes.Restaurantes.repositorio.ViewPratoPorProdutoRepositorio;
import com.Restaurantes.Restaurantes.views.ViewPratoPorProduto;

@RestController
@RequestMapping("views3")
@CrossOrigin( origins={"http://localhost:4200","http://localhost:9876"})
public class ViewController3 {
	
	@Autowired
	ViewPratoPorProdutoRepositorio pratoporprodutorepositorio;
	
	@GetMapping("listarpratoporproduto")
	public List<ViewPratoPorProduto>listarPratoPorProduto() {
		return pratoporprodutorepositorio.findAll();
	}

}
