package com.Restaurantes.Restaurantes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "cliente_prato_pronto")
public class ClientePratoPronto {
	
	@Id
	@Column(name="codigopedido")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codigopedido;
	
	@Column(name="nome")
	@NotNull
	private String nome;
	
	@Column(name="descricao")
	@NotNull
	private String descricao;

	
	public int getCodigopedido() {
		return codigopedido;
	}

	public void setCodigopedido(int codigopedido) {
		this.codigopedido = codigopedido;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
