package br.uern.di.poo.exemplos.sistemaprovas;

import java.util.Calendar;

public class Prova {
	
	private String nome;
	private Calendar data;
	private Questao questoes[];
	
	@Override
	public String toString() {
		String descricao = this.nome + "\nData: " + data.toString() + "\n";
		for(Questao questao:questoes)
			descricao += "\n" + questao.toString() + "\n";
		return descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public Questao[] getQuestoes() {
		return questoes;
	}

	public void setQuestoes(Questao[] questoes) {
		this.questoes = questoes;
	}

	public Prova(String nome, Calendar data, Questao[] questoes) {
		super();
		this.nome = nome;
		this.data = data;
		this.questoes = questoes;
	}

}
