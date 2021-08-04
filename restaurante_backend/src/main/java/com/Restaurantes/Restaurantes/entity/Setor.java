package com.Restaurantes.Restaurantes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "setor")
public class Setor {

	@Id
	@Column(name="codigosetor")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codigosetor;
	
	@Column(name="nome")
	@NotNull
	private String nome;

	public int getCodigosetor() {
		return codigosetor;
	}

	public void setCodigosetor(int codigosetor) {
		this.codigosetor = codigosetor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
