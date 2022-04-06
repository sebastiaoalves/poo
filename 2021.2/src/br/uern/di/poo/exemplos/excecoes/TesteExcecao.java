package br.uern.di.poo.exemplos.excecoes;

import javax.swing.JOptionPane;

public class TesteExcecao {
	
	public static int leIdade() throws NullPointerException, NumberFormatException{
		int idade = -1;
		
		String idadeStr = JOptionPane.showInputDialog(
					"Digite a sua idade");
		String idadeSemEspaco = idadeStr.trim();
		System.out.println("Removeu os espaços em branco...");
		idade = Integer.parseInt(idadeSemEspaco);
		System.out.println("Converteu o número para inteiro...");
		return idade;
	}
	
	public static void main(String[] args) {
		
		
		int idade = leIdade();
		
		JOptionPane.showMessageDialog(null, "Você tem " + idade + " anos.");
		
	}

}
