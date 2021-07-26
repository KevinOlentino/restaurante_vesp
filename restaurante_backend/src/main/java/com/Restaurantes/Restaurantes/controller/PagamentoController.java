package com.Restaurantes.Restaurantes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Restaurantes.Restaurantes.entity.Pagamento;
import com.Restaurantes.Restaurantes.repositorio.PagamentoRepositorio;

@RestController
@RequestMapping("pagamento")
@CrossOrigin(origins = "http://localhost:4200")
public class PagamentoController {
	@Autowired
	private PagamentoRepositorio pagamentoRepositorio;
	
	@PostMapping("incluir")
    public void salvar( @RequestBody Pagamento novoPagamento) {
			System.out.println(novoPagamento.getCodigopedido());
			System.out.println(novoPagamento.getCodigocliente());
			this.pagamentoRepositorio.save(novoPagamento);
	        this.pagamentoRepositorio.flush();     
    }
}
