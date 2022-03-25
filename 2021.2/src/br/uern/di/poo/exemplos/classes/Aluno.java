package br.uern.di.poo.exemplos.classes;

public class Aluno {
	
	String nome;
	int RG;
	
	/**
	 * @param nome
	 * @param rG
	 */
	public Aluno(String nome, int rG) {
		this.nome = nome;
		RG = rG;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the rG
	 */
	public int getRG() {
		return RG;
	}

	/**
	 * @param rG the rG to set
	 */
	public void setRG(int rG) {
		RG = rG;
	}
	
}
