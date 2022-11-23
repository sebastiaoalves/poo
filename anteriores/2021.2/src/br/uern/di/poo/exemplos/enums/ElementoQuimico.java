package br.uern.di.poo.exemplos.enums;

public enum ElementoQuimico {
	H("Hidrogênio"), O("Oxigênio"), Au ("Ouro");
	
	String nome;

	/**
	 * @param nome
	 */
	private ElementoQuimico(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	
}
