package com.Restaurantes.Restaurantes.controller;

import java.io.Console;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Restaurantes.Restaurantes.entity.Pagamento;
import com.Restaurantes.Restaurantes.repositorio.PagamentoRepositorio;

@RestController
@RequestMapping("pagamento")
@CrossOrigin(origins={"http://localhost:9876", "http://localhost:4200", "http://localhost:8090"})
public class PagamentoController {
	
	
	@Autowired
	private PagamentoRepositorio pagamentoRepositorio;
	
	@PostMapping("incluir")
    public void salvar( @RequestBody Pagamento novoPagamento) {
			this.pagamentoRepositorio.save(novoPagamento);
	        this.pagamentoRepositorio.flush();     
    }
	

	@DeleteMapping("/excluir/{id}")
	public String excluir(@PathVariable("id") int id) {
		
		try {
		
			this.pagamentoRepositorio.deleteById(id);
			this.pagamentoRepositorio.flush();
			return "true";
		} catch (Exception e) {
			return "false";
		}

	}
	
	@GetMapping("listar")
	public List<Pagamento> listar(){
		return this.pagamentoRepositorio.findAll();
	}
	
}
