package com.Restaurantes.Restaurantes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="pedido")
public class Pedido {
	
	@Id
	@Column(name="codigopedido")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer CodigoPedido;
	
	@Column(name="codigoprato")
	private Integer CodigoPrato;
	
	@Column(name="codigocliente")
	private Integer CodigoCliente;
	
	@Column (name="quantidade")
	private  Double  Quantidade;
	
	@Column(name="preco")
	private Double Preco;
	
	@Column(name="pronto")
	private Boolean Pronto;
	
	public Integer getCodigoPedido() {
		return CodigoPedido;
	}
	public void setCodigoPedido(Integer codigoPedido) {
		CodigoPedido = codigoPedido;
	}
	public Integer getCodigoPrato() {
		return CodigoPrato;
	}
	public void setCodigoPrato(Integer codigoPrato) {
		CodigoPrato = codigoPrato;
	}
	public Integer getCodigoCliente() {
		return CodigoCliente;
	}
	public void setCodigoCliente(Integer codigoCliente) {
		CodigoCliente = codigoCliente;
	}
	public Double getQuantidade() {
		return Quantidade;
	}
	public void setQuantidade(Double quantidade) {
		Quantidade = quantidade;
	}
	public Double getPreco() {
		return Preco;
	}
	public void setPreco(Double preco) {
		Preco = preco;
	}
	public Boolean getPronto() {
		return Pronto;
	}
	public void setPronto(Boolean pronto) {
		Pronto = pronto;
	}
	
	
	

}
