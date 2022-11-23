package br.uern.di.poo.exemplos.jogo.personagens;

import br.uern.di.poo.exemplos.jogo.excecoes.MagicCastException;
import br.uern.di.poo.exemplos.jogo.magias.Magia;
import br.uern.di.poo.exemplos.jogo.magias.TipoMagia;

public class Paladino extends Guerreiro implements Conjurador {
	
	int pontosDeCura;
	int mana;

	/**
	 * @param forca
	 * @param agilidade
	 * @param inteligencia
	 * @param pontosDeCura
	 */
	public Paladino(int forca, int agilidade, int inteligencia, int pontosDeCura) {
		super(forca, agilidade, inteligencia);
		this.pontosDeCura = pontosDeCura;
		this.mana = 10;
	}
	
	@Override
	public void lancaMagia(Magia magia, Personagem personagem) {
		if(this.mana < magia.getManaNecessario())
			throw new MagicCastException(magia, "Personagem sem mana");
		else if (this.getNivel() < magia.getNivel())
			throw new MagicCastException(magia, "Nível do personagem inferior ao necessário");
		else if(magia.getTipo() != TipoMagia.CURA)
			throw new MagicCastException(magia, "Paladinos só podem usar magias de cura");
		System.out.println("Magia " + magia.getNome() + " foi lançada.");
	
	}

}
