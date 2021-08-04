package com.Restaurantes.Restaurantes.views;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="somadepagamentosporpedidos")
public class ViewSomaDePagamentosPorPedidos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cododigopedido")
	private Integer codigopedido;
	@Column(name="somadepagamento")
	private double somadepagamentos;
	
	public Integer getCodigopedido() {
		return codigopedido;
	}
	public void setCodigopedido(Integer codigopedido) {
		this.codigopedido = codigopedido;
	}
	public double getSomadepagamentos() {
		return somadepagamentos;
	}
	public void setSomadepagamentos(double somadepagamentos) {
		this.somadepagamentos = somadepagamentos;
	}
	
}
