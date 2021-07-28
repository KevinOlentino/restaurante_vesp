package com.Restaurantes.Restaurantes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Restaurantes.Restaurantes.entity.Faturamento;
import com.Restaurantes.Restaurantes.entity.Pedido;
import com.Restaurantes.Restaurantes.repositorio.ClienteRepositorio;
import com.Restaurantes.Restaurantes.repositorio.FaturamentoRepositorio;
import com.Restaurantes.Restaurantes.repositorio.PedidoRepositorio;
import com.Restaurantes.Restaurantes.repositorio.PratoRepositorio;

@RestController
@RequestMapping("util")
public class UtilController {
	
	@Autowired
	private ClienteRepositorio clirepo;
	@Autowired
	private PratoRepositorio prarepo;
	@Autowired
	private PedidoRepositorio pedrepo;
	@Autowired
	private FaturamentoRepositorio fatrepo;

	@PostMapping("somar")
	public double somar( double a, double b) {
		double r;
		r = a + b;
		return r;
	}

	@GetMapping("pi")
	public double pi() {
		return 3.14159;
	}
	
	@PostMapping("delta")
	public double bx1( double a, double b, double c) {
		double delta = (b*b) - 4 * a * c;
		return delta;
	}
	
	@GetMapping("qtd_clientes")
	public int quant_cliente() {
		return (int) this.clirepo.count();
	}
			
	@GetMapping("qtd_pratos")
	public int quant_prato() {
		return (int) prarepo.count();
	}
			
	@GetMapping("qtd_pedidos")
	public int quant_pedido() {
		return (int) pedrepo.count();
	}

	@GetMapping("totalpedidos")
	public double totalPedidos() {
		
		Double soma = 0.00;
		List<Pedido> pedidos = pedrepo.findAll();
		for(Pedido p: pedidos) {
			soma += p.getPreco();
		}
		
		return soma;
	}
	

	@GetMapping("totalfaturamento")
	public Double totalFaturamento() {
		
		double soma = 0;
		List<Faturamento> faturamentos = fatrepo.findAll();
		for(Faturamento f: faturamentos) {
			soma += f.getValorpago();
		}
		return soma;
	}
	
	@GetMapping("velocidade")
	public Double velocidade(double espaco, double tempo) {
		double velocidade = 0;
		velocidade = espaco / tempo;
		return velocidade;
	}

}
