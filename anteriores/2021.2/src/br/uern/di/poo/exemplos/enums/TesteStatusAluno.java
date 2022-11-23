package br.uern.di.poo.exemplos.enums;

public class TesteStatusAluno {

	public static void main(String[] args) {
		StatusAluno status;
		status = StatusAluno.MATRICULADO;
		
		switch(status) {
			case APROVADO:
				break;
			case MATRICULADO:
				break;
			default:
				break;
		}
		

	}

}
