package br.uern.di.poo.aula03;

import javax.swing.JOptionPane;

/** <p> Arquivo que não faz nada </p>
	<p> Comentário de múltiplas linhas </p>*/
public class Hello2{
	
	/** Função principal da classe */
	public static void main(String args[]) {
	
		String nome = JOptionPane.showInputDialog("Digite seu nome");
	
		JOptionPane.showMessageDialog(null,"Seu nome é " +nome);
	
	}
	
}
