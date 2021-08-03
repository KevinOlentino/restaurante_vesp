package com.Restaurantes.Restaurantes.views;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="quantidade_pratos_por_pedido")
public class ViewQuantidadePratosPorPedido {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	@Column(name="codigpedido")
	private int codigoPedido;
	
	@Column(name="quantidadepratospedidos")
	private int qntPratosPorPedido;

	public int getCodigoPedido() {
		return codigoPedido;
	}

	public void setCodigoPedido(int codigoPedido) {
		this.codigoPedido = codigoPedido;
	}

	public int getQntPratosPorPedido() {
		return qntPratosPorPedido;
	}

	public void setQntPratosPorPedido(int qntPratosPorPedido) {
		this.qntPratosPorPedido = qntPratosPorPedido;
	}
}
