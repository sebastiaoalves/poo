package br.uern.di.poo.exemplos.jogo.teste;

import br.uern.di.poo.exemplos.jogo.excecoes.MagicCastException;
import br.uern.di.poo.exemplos.jogo.magias.Magia;
import br.uern.di.poo.exemplos.jogo.magias.TipoMagia;
import br.uern.di.poo.exemplos.jogo.personagens.Mago;
import br.uern.di.poo.exemplos.jogo.personagens.Paladino;

public class TesteExcecaoMagia {

	public static void main(String[] args) {
		Magia curaLeve = new Magia("Cura leve", TipoMagia.CURA, 10, 120, 8);
		Magia misselMagico = new Magia("Missel mágico", TipoMagia.ATAQUE, 5, 4, 7);
		Mago merlin = new Mago(9, 10, 20, 5);
		merlin.setNivel(1000);
		merlin.lancaMagia(curaLeve, merlin);
		Paladino arthas = new Paladino (15, 14, 12, 10);
		arthas.setNivel(10);
		try {
			arthas.lancaMagia(misselMagico, arthas);
		}catch(MagicCastException mge) {
			System.out.println("Não foi possível lançar a magia.");
		}
	}
}
