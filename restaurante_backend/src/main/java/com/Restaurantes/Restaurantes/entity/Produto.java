package com.Restaurantes.Restaurantes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="produto")
public class Produto {
	@Id
	@Column(name="codigo")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codigo;

	@Column(name="nome")
	private String Nome;
	
	@Column(name="preco")
	private Double Preco;
	
	@Column(name="quantidade")
	private int Quantidade;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public Double getPreco() {
		return Preco;
	}

	public void setPreco(Double preco) {
		Preco = preco;
	}

	public int getQuantidade() {
		return Quantidade;
	}

	public void setQuantidade(int quantidade) {
		Quantidade = quantidade;
	}
	
	
}
