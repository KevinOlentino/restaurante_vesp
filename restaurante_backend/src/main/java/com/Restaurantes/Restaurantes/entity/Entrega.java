package com.Restaurantes.Restaurantes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.sun.istack.NotNull;

@Entity
@Table(name="entrega")
public class Entrega {
	
	@Id
	@Column(name="codigo")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer Codigo;
	
	@Column(name="codigocliente")
	private Integer CodigoCliente;
	
	@Column(name="endereco")
	@NotNull
	private String Endereco;

	public Integer getCodigo() {
		return Codigo;
	}

	public void setCodigo(Integer codigo) {
		Codigo = codigo;
	}

	public Integer getCodigoCliente() {
		return CodigoCliente;
	}

	public void setCodigoCliente(Integer codigoCliente) {
		CodigoCliente = codigoCliente;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	
	
}
