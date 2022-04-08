package br.uern.di.poo.exemplos.sistemaprovas;

public class Questao implements Comparable {
	
	private String enunciado, respostas[];
	private int respostaCorreta, numero;
	private Dificuldade dificuldade;
	private Assunto assunto;
	private Serie serie;
	
	public Questao(String enunciado, String[] respostas, int respostaCorreta, int numero, Dificuldade dificuldade,
			Assunto assunto, Serie serie) {
		super();
		this.enunciado = enunciado;
		this.respostas = respostas;
		this.respostaCorreta = respostaCorreta;
		this.numero = numero;
		this.dificuldade = dificuldade;
		this.assunto = assunto;
		this.serie = serie;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public String[] getRespostas() {
		return respostas;
	}

	public void setRespostas(String[] respostas) {
		this.respostas = respostas;
	}

	public int getRespostaCorreta() {
		return respostaCorreta;
	}

	public void setRespostaCorreta(int respostaCorreta) {
		this.respostaCorreta = respostaCorreta;
	}

	public Dificuldade getDificuldade() {
		return dificuldade;
	}

	public void setDificuldade(Dificuldade dificuldade) {
		this.dificuldade = dificuldade;
	}

	public Assunto getAssunto() {
		return assunto;
	}

	public void setAssunto(Assunto assunto) {
		this.assunto = assunto;
	}

	public Serie getSerie() {
		return serie;
	}

	public void setSerie(Serie serie) {
		this.serie = serie;
	}

	@Override
	public int compareTo(Object outraQuestao) {
		Questao aOutra = (Questao) outraQuestao;
		int diferencaDificuldade = this.dificuldade.getNivel() - aOutra.getDificuldade().getNivel();
		if(diferencaDificuldade!=0)
			return diferencaDificuldade;
		else
			return this.numero - aOutra.getNumero();
	}

	@Override
	public String toString() {
		String descricao = "Questão " + this.numero + " - " + this.enunciado + "\n";
		for(int i=0; i < this.respostas.length; i++)
			descricao += "(" + (i+1) + ")" + this.respostas[i] + "\n";
		return descricao;
	}
	
}
