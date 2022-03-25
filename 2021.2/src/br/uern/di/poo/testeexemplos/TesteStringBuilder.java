package br.uern.di.poo.testeexemplos;

public class TesteStringBuilder {

	public static void main(String[] args) {
		String nome1 = "Sebastião";
		String nome2 = "Alves";

		StringBuilder buffer = new StringBuilder();

		System.out.printf("Valores atuais: %s\n", buffer.toString());
		buffer.append(nome1);
		System.out.printf("Valores atuais: %s\n", buffer.toString());
		buffer.insert(4, nome2);
		System.out.printf("Valores atuais: %s\n", buffer.toString());

		buffer.delete(5, 10);
		System.out.printf("Valores atuais: %s\n", buffer.toString());
		buffer.deleteCharAt(4);
		System.out.printf("Valores depois: %s\n", buffer.toString());


	}

}
