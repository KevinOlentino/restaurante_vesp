package com.Restaurantes.Restaurantes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.sun.istack.NotNull;

@Entity
@Table(name = "cliente")
public class Cliente {

	@Id
	@Column(name="codigocliente")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codigoCliente;
	
	@Column(name="nome")
	@NotNull
	private String nome;
	
	@Column(name="email")
	@NotNull
	private String email;
	
	@Column(name="senha")
	@NotNull
	private String senha;

	public int getCodigocliente() {
		return codigoCliente;
	}

	public void setCodigocliente(int codigocliente) {
		this.codigoCliente = codigocliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
