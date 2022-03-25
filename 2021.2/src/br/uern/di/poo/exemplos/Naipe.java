package br.uern.di.poo.exemplos;

// Criar uma enum chamada Naipe, para representar os 4 naipes de uma carta de baralho.
//A enum deve ter um atributo com o nome do naipe;

public enum Naipe {
	OURO("Ouro"), COPAS("Copas"), PAUS("Paus"), ESPADA("Espada");
	
	String nome;

	/**
	 * @param nome
	 */
	private Naipe(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	
}
