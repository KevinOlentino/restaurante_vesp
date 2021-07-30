package com.Restaurantes.Restaurantes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.Restaurantes.Restaurantes.entity.Pedido;
import com.Restaurantes.Restaurantes.repositorio.PedidoRepositorio;

@RestController
@RequestMapping ("pedido")
@CrossOrigin(origins={"http://localhost:9876", "http://localhost:4200"})
public class PedidoController {

	@Autowired
	private PedidoRepositorio  repositorio;
	
	@GetMapping("listar")
	public  List<Pedido> listarpedido(){		
		return repositorio.findAll();
	}
	@PostMapping ("incluir")
    public void incluir (@RequestBody Pedido novoPedido) {
    	repositorio.save(novoPedido);
    	repositorio.flush();
    }    
}
