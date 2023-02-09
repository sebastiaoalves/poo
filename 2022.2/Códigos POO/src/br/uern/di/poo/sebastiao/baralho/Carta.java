package br.uern.di.poo.sebastiao.baralho;

public enum Carta {

	DOIS("Dois", 2),
	TRES("Três", 3),
	QUATRO("Quatro", 4),
	CINCO("Cinco", 5),
	SEIS("Seis", 6),
	SETE("Sete", 7),
	OITO("Oito", 8),
	NOVE("Nove", 9),
	DEZ("Dez", 10),
	VALETE("Valete", 11),
	DAMA("Dama", 12),
	REI("Rei", 13),
	AS("Ás", 14);
	
	private String nome;
	private int valor;
	public String getNome() {
		return nome;
	}
	public int getValor() {
		return valor;
	}
	private Carta(String nome, int valor) {
		this.nome = nome;
		this.valor = valor;
	}
	
	
	
}
