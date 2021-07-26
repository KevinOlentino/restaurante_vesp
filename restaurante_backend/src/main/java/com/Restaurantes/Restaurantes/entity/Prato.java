package com.Restaurantes.Restaurantes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="prato")
public class Prato {
	
	@Id
	@Column(name="codigoprato")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer Codprato;
	@Column(name="descricao")
	private String Descricao;
	@Column(name="preco")
	private Double Preco;
	
	public Integer getCodprato() {
		return Codprato;
	}
	public void setCodprato(Integer codprato) {
		Codprato = codprato;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	public Double getPreco() {
		return Preco;
	}
	public void setPreco(Double preco) {
		Preco = preco;
	}
	
	
}
