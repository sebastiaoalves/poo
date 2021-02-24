package br.uern.di.poo.aula04;

import javax.swing.JOptionPane;

public class Media2{

	public static void main(String args[]){
	
		double nota1, nota2, nota3, média;
		String conteúdo = JOptionPane.showInputDialog(null, "Digite a 1ª nota do aluno", 
				"Programa da média", JOptionPane.WARNING_MESSAGE);
		nota1 = Double.parseDouble ( conteúdo ) ;
		nota2 = Double.parseDouble ( JOptionPane.showInputDialog("Digite a 2ª nota do aluno") );
		nota3 = Double.parseDouble ( JOptionPane.showInputDialog("Digite a 3ª nota do aluno") );

		média = (nota1*4 + nota2*5 + nota3*6) /15;

		int númeroDeFaltas = Integer.parseInt ( JOptionPane.showInputDialog("Digite o número de faltas do aluno") );

		JOptionPane.showMessageDialog(null, "A média do aluno é " + média); 

		if (númeroDeFaltas>14)
			JOptionPane.showMessageDialog(null, "O aluno foi reprovado por falta"); 
		else if(média>=7)
			JOptionPane.showMessageDialog(null, "O aluno foi aprovado");
		else if(média>=4){
			double nota4 = Double.parseDouble ( JOptionPane.showInputDialog("Digite a nota da 4ª prova do aluno") );
			média=(média+nota4)/2;
			if(média>=6)
				JOptionPane.showMessageDialog(null, "O aluno foi aprovado");
			else
				JOptionPane.showMessageDialog(null, "O aluno foi reprovado");
		}else
			JOptionPane.showMessageDialog(null, "O aluno foi reprovado"); 
	}
}
