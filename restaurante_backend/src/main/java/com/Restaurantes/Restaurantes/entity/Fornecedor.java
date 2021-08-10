package com.Restaurantes.Restaurantes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "fornecedor")
public class Fornecedor {

	@Id
	@Column(name="codigo")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codigo;
	
	@Column(name="nome")
	@NotNull
	private String nome;
	
	@Column(name="telefone")
	@NotNull
	private String telefone;
	
	@Column(name="codigoproduto")
	@NotNull
	private int codigoproduto;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getCodigoproduto() {
		return codigoproduto;
	}

	public void setCodigoproduto(int codigoproduto) {
		this.codigoproduto = codigoproduto;
	}
	
	
}
