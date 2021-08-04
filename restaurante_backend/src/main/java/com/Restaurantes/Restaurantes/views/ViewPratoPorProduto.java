package com.Restaurantes.Restaurantes.views;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="prato_por_produto")
public class ViewPratoPorProduto {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	@Column(name="codigoprato")
	private int codigoprato;
	
	@Column(name="descricao")
	private String descricao;

	@Column(name="contagem")
	private String contagem;
	

	public int getCodigoprato() {
		return codigoprato;
	}

	public void setCodigoprato(int codigoprato) {
		this.codigoprato = codigoprato;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getContagem() {
		return contagem;
	}

	public void setContagem(String contagem) {
		this.contagem = contagem;
	}

		
}
