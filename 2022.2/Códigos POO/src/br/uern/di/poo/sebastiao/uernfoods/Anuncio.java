package br.uern.di.poo.sebastiao.uernfoods;

import java.time.LocalDate;

public class Anuncio {
	
	private Alimento alimento;
	private String descricao, nomeDoVendedor;
	private double preco;
	private LocalDate validade;
	private StatusDoAnuncio statusDoAnuncio;
	public Alimento getAlimento() {
		return alimento;
	}
	public void setAlimento(Alimento alimento) {
		this.alimento = alimento;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getNomeDoVendedor() {
		return nomeDoVendedor;
	}
	public void setNomeDoVendedor(String nomeDoVendedor) {
		this.nomeDoVendedor = nomeDoVendedor;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public LocalDate getValidade() {
		return validade;
	}
	public void setValidade(LocalDate validade) {
		this.validade = validade;
	}
	public StatusDoAnuncio getStatusDoAnuncio() {
		return statusDoAnuncio;
	}
	public void setStatusDoAnuncio(StatusDoAnuncio statusDoAnuncio) {
		this.statusDoAnuncio = statusDoAnuncio;
	}
	public Anuncio(Alimento alimento, String descricao, String nomeDoVendedor, double preco, LocalDate validade,
			StatusDoAnuncio statusDoAnuncio) {
		super();
		this.alimento = alimento;
		this.descricao = descricao;
		this.nomeDoVendedor = nomeDoVendedor;
		this.preco = preco;
		this.validade = validade;
		this.statusDoAnuncio = statusDoAnuncio;
	}
	

}
