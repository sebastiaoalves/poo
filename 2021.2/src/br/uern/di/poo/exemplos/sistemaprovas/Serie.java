package br.uern.di.poo.exemplos.sistemaprovas;

public enum Serie {
	PRIMEIRA("1ª série"), SEGUNDA ("2ª série"), TERCEIRA("3ª série");
	
	private String nome;

	private Serie(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	
}
