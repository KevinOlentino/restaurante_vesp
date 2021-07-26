package com.Restaurantes.Restaurantes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "Pagamento")
public class Pagamento {
	
	@Id
	@Column(name="codigopagamento")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codigopagamento;
	
	@Column(name="codigopedido")
	@NotNull
	private int codigopedido;
	
	@Column(name="codigocliente")
	@NotNull
	private int codigocliente;
	
	@Column(name="valorpago")
	@NotNull
	private double valorpago;

	public int getCodigopagamento() {
		return codigopagamento;
	}

	public void setCodigopagamento(int codigopagamento) {
		this.codigopagamento = codigopagamento;
	}

	public int getCodigopedido() {
		return codigopedido;
	}

	public void setCodigopedido(int codigopedido) {
		this.codigopedido = codigopedido;
	}

	public int getCodigocliente() {
		return codigocliente;
	}

	public void setCodigocliente(int codigocliente) {
		this.codigocliente = codigocliente;
	}

	public double getValorpago() {
		return valorpago;
	}

	public void setValorpago(double valorpago) {
		this.valorpago = valorpago;
	}

	
}
