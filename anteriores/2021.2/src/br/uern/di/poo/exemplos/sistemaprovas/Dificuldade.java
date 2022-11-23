package br.uern.di.poo.exemplos.sistemaprovas;

public enum Dificuldade {
	MUITO_FACIL(1), FACIL(2), MEDIO(3), DIFICIL(4), MUITO_DIFICIL(5);
	
	private int nivel;

	private Dificuldade(int nivel) {
		this.nivel = nivel;
	}

	public int getNivel() {
		return nivel;
	}

}
