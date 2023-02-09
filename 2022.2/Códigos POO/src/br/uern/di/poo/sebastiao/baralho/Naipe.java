package br.uern.di.poo.sebastiao.baralho;

import java.awt.Color;

public enum Naipe {
	
	COPAS("Copas", "Hearts", "Coração", Color.RED), 
	PAUS("Paus", "Clubs", "Árvore", Color.BLACK), 
	ESPADAS("Espadas", "Spades", "Folha", Color.BLACK), 
	OURO("Ouro", "Diamond", "Diamante", Color.RED);
	
	public String getNomeEmPortugues() {
		return nomeEmPortugues;
	}

	public String getNomeEmIngles() {
		return nomeEmIngles;
	}

	public String getSimbolo() {
		return simbolo;
	}

	public Color getCor() {
		return cor;
	}

	private String nomeEmPortugues;
	private String nomeEmIngles;
	private String simbolo;
	private Color cor;
	
	private Naipe(String nomeEmPortugues, String nomeEmIngles, String simbolo, Color cor) {
		this.nomeEmPortugues = nomeEmPortugues;
		this.nomeEmIngles = nomeEmIngles;
		this.simbolo = simbolo;
		this.cor = cor;
	}

	
}
