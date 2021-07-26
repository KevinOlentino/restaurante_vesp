package com.Restaurantes.Restaurantes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="faturamento")
public class Faturamento {
 
	@Id
	@Column(name="codigopedido")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigopedido;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="valorpago")
	private Double valorpago;

	public Integer getCodigopedido() {
		return codigopedido;
	}

	public void setCodigopedido(Integer codigopedido) {
		this.codigopedido = codigopedido;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValorpago() {
		return valorpago;
	}

	public void setValorpago(Double valorpago) {
		this.valorpago = valorpago;
	}
	
	
}
