package br.uern.di.poo.exemplos.jogo;

public class Paladino extends Guerreiro {
	
	int pontosDeCura;

	/**
	 * @param forca
	 * @param agilidade
	 * @param inteligencia
	 * @param pontosDeCura
	 */
	public Paladino(int forca, int agilidade, int inteligencia, int pontosDeCura) {
		super(forca, agilidade, inteligencia);
		this.pontosDeCura = pontosDeCura;
	}
	
	

}
