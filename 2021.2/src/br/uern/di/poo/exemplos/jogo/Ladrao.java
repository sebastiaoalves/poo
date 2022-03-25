package br.uern.di.poo.exemplos.jogo;

import java.util.Scanner;

public class Ladrao extends Personagem {
	
	String itensMochila[];

	public Ladrao(int forca, int inteligencia, int agilidade) {
		super(forca, inteligencia, agilidade);
		this.itensMochila = new String [5];
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Ladrao bilboBaggins = new Ladrao(entrada.nextInt(),
				entrada.nextInt(),
				entrada.nextInt());
		
		bilboBaggins.setNivel(1);
		bilboBaggins.getMaxPontosDeVida();
		
	}

	@Override
	public int getPontosAtaque() {
		return getNivel() + getAgilidade();
	}

	@Override
	public int getPontosDefesa() {
		return (int)(getAgilidade()/1.5);
	}

}
