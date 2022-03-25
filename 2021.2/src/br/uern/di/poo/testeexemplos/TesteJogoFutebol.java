package br.uern.di.poo.testeexemplos;

import br.uern.di.poo.exemplos.JogoFutebol;

public class TesteJogoFutebol {

	public static void main(String[] args) {
		JogoFutebol jogo1 = new JogoFutebol("Potiguar", 3, "Baraúnas", 1);
		
		JogoFutebol jogoMossoro = jogo1;
		
		jogoMossoro.setGolsTimeCasa(4);
		jogoMossoro.setGolsTimeVisitante(3);
		
		System.out.println("Placar do jogo:\n");
		System.out.println(jogo1.getNomeTimeCasa());
		System.out.println(jogo1.getGolsTimeCasa());
		System.out.println(jogo1.getNomeTimeVisitante());
		System.out.println(jogo1.getGolsTimeVisitante());

		
		JogoFutebol jogo2 = new JogoFutebol("Barcelona", 1, "Real Madrid", 1);
		jogo2.setGolsTimeCasa(2);
		
		
	}
}
