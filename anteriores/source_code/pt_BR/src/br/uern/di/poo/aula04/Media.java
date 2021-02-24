package br.uern.di.poo.aula04;
import javax.swing.JOptionPane;

public class Media{

    public static void main(String args[]){

        double nota1, nota2, nota3, média;
        String conteúdo = JOptionPane.showInputDialog("Digite a 1ª nota do aluno");
        nota1 = Double.parseDouble ( conteúdo ) ;
        nota2 = Double.parseDouble ( JOptionPane.showInputDialog("Digite a 2ª nota do aluno") );
        nota3 = Double.parseDouble ( JOptionPane.showInputDialog("Digite a 3ª nota do aluno") );

        média = (nota1*4 + nota2*5 + nota3*6) /15;

        JOptionPane.showMessageDialog(null, "A média do aluno é " + média);
    }
}