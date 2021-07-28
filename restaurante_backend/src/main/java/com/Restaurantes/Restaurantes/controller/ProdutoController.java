package com.Restaurantes.Restaurantes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Restaurantes.Restaurantes.entity.Produto;
import com.Restaurantes.Restaurantes.repositorio.ProdutoRepositorio;


@RestController
@RequestMapping ("produto")
@CrossOrigin(origins="http://localhost:4200")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepositorio  repositorio;
	
	@GetMapping("listar")
	public  List<Produto> listarproduto(){		
		return repositorio.findAll();
	}
	@GetMapping("qtd_produto")
	public int quant_Produto() {
		return (int) this.repositorio.count();
	}
		
}
