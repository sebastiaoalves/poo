package br.uern.di.poo.exemplos.jogo.personagens;

import br.uern.di.poo.exemplos.jogo.excecoes.MagicCastException;
import br.uern.di.poo.exemplos.jogo.magias.Magia;

public final class Mago extends Personagem implements Conjurador{
	
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

	@Override
	public void lancaMagia(Magia magia, Personagem personagem) {
		if(this.mana < magia.getManaNecessario() || 
				this.getNivel() < magia.getNivel())
			throw new MagicCastException(magia, "Personagem com mana ou nível insuficiente");
		System.out.println("Lançou a magia " + magia.getNome());
	}

	
}
