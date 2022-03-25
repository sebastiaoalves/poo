package br.uern.di.poo.exemplos;

//Criar uma enum Carta, para representar as cartas de um baralho 
// de 2 a 10, J, Q, K e A. 
// A enum deve ter dois atributos, o nome e o valor da carta, 
// onde o valor das cartas numéricas é o seu número, 
// J tem valor 11, Q vale 12, K vale 13 e A vale 14;


public enum Carta {
	DOIS ("2", 2),
	TRES ("3", 3),
	QUATRO("4", 4),
	CINCO("5", 5),
	SEIS("6", 6),
	SETE("7", 7),
	OITO("8", 8),
	NOVE("9", 9),
	DEZ("10", 10),
	J("Valete", 11),
	Q("Dama", 12),
	K("Rei", 13),
	A("Ás", 14);
	
	String nome;
	int valor;
	/**
	 * @param nome
	 * @param valor
	 */
	private Carta(String nome, int valor) {
		this.nome = nome;
		this.valor = valor;
	}
	
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * @return the valor
	 */
	public int getValor() {
		return valor;
	}
	
}
