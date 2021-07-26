package com.Restaurantes.Restaurantes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pedidos_pendentes")
public class PedidosPendentes {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="codigopedido")
	private Integer codigopedido;
	@Column(name="codigoprato")
	private Integer codigoprato;
	@Column(name="codigocliente")
	private Integer codigocliente;
	@Column(name="quantidade")
	private Integer quantidade;
	@Column(name="preco")
	private Double preco;
	@Column(name="pronto")
	private Integer pronto;
	public Integer getCodigopedido() {
		return codigopedido;
	}
	public void setCodigopedido(Integer codigopedido) {
		this.codigopedido = codigopedido;
	}
	public Integer getCodigoprato() {
		return codigoprato;
	}
	public void setCodigoprato(Integer codigoprato) {
		this.codigoprato = codigoprato;
	}
	public Integer getCodigocliente() {
		return codigocliente;
	}
	public void setCodigocliente(Integer codigocliente) {
		this.codigocliente = codigocliente;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Integer getPronto() {
		return pronto;
	}
	public void setPronto(Integer pronto) {
		this.pronto = pronto;
	}
	
}
