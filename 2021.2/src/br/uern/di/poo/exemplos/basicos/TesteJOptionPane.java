package br.uern.di.poo.exemplos.basicos;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import static java.lang.Integer.*;

public class TesteJOptionPane {

		public static void main(String[] args) {
			
			showMessageDialog(null, "Bem vindo");
			
			 String nome = JOptionPane.showInputDialog ("Qual o seu nome?"); 
			 int idade = parseInt( 
					 JOptionPane.showInputDialog ("Olá " + nome +
							 "Quantos anos você tem?"));
			 
			 
			 int comorbidade = JOptionPane.showConfirmDialog(null,"Você tem diabetes ou hipertensão?",
					 "Escolha", JOptionPane.YES_NO_OPTION); 
			 if ( idade > 65 || comorbidade == JOptionPane.YES_OPTION)
				 showMessageDialog(null, "Você é do grupo de risco da COVID-19",
						 "Cuidado", JOptionPane.WARNING_MESSAGE);
			 
			 String vacinas [] = {"Astrazeneca", "BioNTech", "Jansen", "Sputinik"};
			 String escolhida =  JOptionPane.showInputDialog(null,"Que vacina você mais confia", 
					 "Pesquisa", JOptionPane.QUESTION_MESSAGE, null, 
					 vacinas, vacinas [0]).toString( );
			 
			 JOptionPane.showMessageDialog(null, "Você prefere a vacina " + escolhida);

			System.exit(0);
		}
}
