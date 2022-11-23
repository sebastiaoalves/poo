package br.uern.di.poo.exemplos.jogo.teste;

import br.uern.di.poo.exemplos.jogo.excecoes.IllegalAttributeException;
import br.uern.di.poo.exemplos.jogo.personagens.Guerreiro;
import br.uern.di.poo.exemplos.jogo.personagens.Ladrao;
import br.uern.di.poo.exemplos.jogo.personagens.Mago;
import br.uern.di.poo.exemplos.jogo.personagens.Personagem;

public class TesteJogo2 {
	
	public static void realizaAtaque (Personagem atacante, Personagem defensor) {
		if (atacante.getPontosAtaque()>defensor.getPontosDefesa()) {
			int pvAtual = defensor.getPontosDeVida();
			int dano = atacante.getPontosAtaque() - defensor.getPontosDefesa();
			defensor.setPontosDeVida(pvAtual - dano);	
		}
			
	}
	

	public static void main(String[] args) throws CloneNotSupportedException {
		Guerreiro ivarBoneless = new Guerreiro(30, 7, 25); // PV = 0+18+9 = 27
		Ladrao bilboBaggins = new Ladrao(10, 18, 20); // PV = 0+10 = 10;
		Mago gandalfTheGray = new Mago(20, 21, 28, 100); // PV = 0 + 20 = 20
		
		Personagem generico = ivarBoneless;
		//Ladrao l = (Ladrao) generico;
		generico.setNivel(2);
		
		Personagem equipe [] = new Personagem [3];
		equipe[0] = ivarBoneless;
		equipe[1] = bilboBaggins;
		equipe[2] = gandalfTheGray;
		
		//equipe[5] = ivarBoneless;
		
		for (Personagem p:equipe)
			System.out.println(p);
		
		for (int i=0; i<equipe.length; i++)
			System.out.println(equipe[i].getMaxPontosDeVida());
		
		System.out.println("Pontos de vida de Gandalf: " + gandalfTheGray.getPontosDeVida());
		
		realizaAtaque(ivarBoneless, gandalfTheGray);
		
		System.out.println("Pontos de vida de Gandalf: " + gandalfTheGray.getPontosDeVida());
		
		//Personagem npc = new Personagem(1, 2, 2);
		try {
			gandalfTheGray.setForca(-1);
			System.out.println("Força do Gandalf:" + gandalfTheGray.getForca());
		}catch (IllegalAttributeException iae) {
			System.out.println("Não foi possível alterar o atributo");
		}
	}

}
