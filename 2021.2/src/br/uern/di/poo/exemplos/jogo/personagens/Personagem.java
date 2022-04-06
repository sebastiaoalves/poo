package br.uern.di.poo.exemplos.jogo.personagens;

import br.uern.di.poo.exemplos.jogo.excecoes.IllegalAttributeException;

public abstract class Personagem {
	
	private int nivel, pontosDeVida;
	
	protected int forca, inteligencia, agilidade;

	/**
	 * @param forca
	 * @param inteligencia
	 * @param agilidade
	 */
	public Personagem(int forca, int inteligencia, int agilidade) {
		this.nivel = 0;
		this.forca = forca;
		this.inteligencia = inteligencia;
		this.agilidade = agilidade;
		this.pontosDeVida = this.forca;
	}
	
	@Override
	public String toString() {
		return "Personagem [nivel=" + nivel + ", pontosDeVida=" + pontosDeVida + ", forca=" + forca + ", inteligencia="
				+ inteligencia + ", agilidade=" + agilidade + "]";
	}
	
	public int getMaxPontosDeVida() {
		//System.out.println("Pontos de vida de personagem.");
		return this.nivel + this.forca;
	}
	
	// O deveres do contrato para as subclasses
	public abstract int getPontosAtaque();
	public abstract int getPontosDefesa();

	/**
	 * @return the pontosDeVida
	 */
	public int getPontosDeVida() {
		return pontosDeVida;
	}

	/**
	 * @param pontosDeVida the pontosDeVida to set
	 */
	public void setPontosDeVida(int pontosDeVida) {
		this.pontosDeVida = pontosDeVida;
	}

	/**
	 * @return the nivel
	 */
	public int getNivel() {
		return nivel;
	}

	/**
	 * @param nivel the nivel to set
	 */
	public final void setNivel(int nivel) {
		this.nivel = nivel;
	}

	/**
	 * @return the forca
	 */
	public int getForca() {
		return forca;
	}

	/**
	 * @param forca the forca to set
	 */
	public void setForca(int forca) throws IllegalAttributeException {
		if (forca>=1 && forca<=20)
			this.forca = forca;
		else
			throw new IllegalAttributeException(forca, "Força");
	}

	/**
	 * @return the inteligencia
	 */
	public int getInteligencia() {
		return inteligencia;
	}

	/**
	 * @param inteligencia the inteligencia to set
	 */
	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	/**
	 * @return the agilidade
	 */
	public int getAgilidade() {
		return agilidade;
	}

	/**
	 * @param agilidade the agilidade to set
	 */
	public void setAgilidade(int agilidade) {
		this.agilidade = agilidade;
	}
	
}
