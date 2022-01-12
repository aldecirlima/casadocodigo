package br.com.casadocodigo.models;

import java.math.BigDecimal;

public class Livro {
	private String titulo;
	private String descricao;
	private BigDecimal preco;
	private Integer numeroPaginas;

	public Livro(String titulo, String descricao, BigDecimal preco, Integer numeroPaginas) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.preco = preco;
		this.numeroPaginas = numeroPaginas;
	}

	public Livro() {
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Integer getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(Integer numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", descricao=" + descricao + ", preco=" + preco + ", numeroPaginas="
				+ numeroPaginas + "]";
	}

}
