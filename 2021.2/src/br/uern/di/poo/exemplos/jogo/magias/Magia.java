package br.uern.di.poo.exemplos.jogo.magias;

public class Magia {
	
	private String nome;
	private TipoMagia tipo;
	private int nivel, manaNecessario, pontosDeVida;
	
	public Magia (String nome, TipoMagia tipo, int nivel, 
			int manaNecessario, int pontosDeVida ) {
		this.nome = nome;
		this.tipo = tipo;
		this.nivel = nivel;
		this.manaNecessario = manaNecessario;
		this.pontosDeVida = pontosDeVida;
	}
	
	public String getNome() {
		return nome;
	}

	public TipoMagia getTipo() {
		return tipo;
	}

	public int getNivel() {
		return nivel;
	}

	public int getManaNecessario() {
		return manaNecessario;
	}

	public int getPontosDeVida() {
		return pontosDeVida;
	}
}



