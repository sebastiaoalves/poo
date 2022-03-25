package br.uern.di.poo.testeexemplos;

import br.uern.di.poo.exemplos.StatusAluno;

public class TesteStatusAluno {

	public static void main(String[] args) {
		StatusAluno status;
		status = StatusAluno.MATRICULADO;
		
		switch(status) {
			case APROVADO:
				break;
			case MATRICULADO:
				break;
		}
		

	}

}
