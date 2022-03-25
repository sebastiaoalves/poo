package br.uern.di.poo.exemplos.jogo;

public final class Mago extends Personagem {
	
	private int mana;
	
	public Mago (int forca, int agilidade, int inteligencia, int mana) {
		super(forca, agilidade, inteligencia);
		this.mana = mana;
	}

	public void evolui ( ) {
        this.forca ++;
        this.agilidade ++;
        this.inteligencia +=2;
    }

	@Override
    public int getPontosAtaque( ) {
        return getNivel() + this.inteligencia;
    }

	/**
	 * @return the mana
	 */
	public int getMana() {
		return mana;
	}

	/**
	 * @param mana the mana to set
	 */
	public void setMana(int mana) {
		this.mana = mana;
	}

	@Override
	public int getPontosDefesa() {
		return getInteligencia()/3 + getAgilidade()/3;
	}

	
}
