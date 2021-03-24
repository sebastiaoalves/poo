/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uern.di.poo.exemplosaula.aula06e07;
import javax.swing.JOptionPane;

/**
 *
 * @author sebastiao
 */
public class TesteJOptionPane {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog ( "Qual o seu nome? ");
        JOptionPane.showMessageDialog(null, "Bem vindo," + nome);
        int idade = Integer.parseInt( JOptionPane.showInputDialog ( "Qual a sua idade?") );
        int comorbidade = JOptionPane.showConfirmDialog(null,
                "Você tem diabetes ou hipertensão?", "Escolha", JOptionPane.YES_NO_OPTION);
        if ( idade > 65 || comorbidade == JOptionPane.YES_OPTION)
            JOptionPane.showMessageDialog(null, "Você é do grupo de risco da COVID-19",
                    "Cuidado", JOptionPane.WARNING_MESSAGE);
        
        String vacinas [] = {"Astrazeneca", "BioNTech", "Jansen", "Sputinik"};
        String escolhida = JOptionPane.showInputDialog(null, "Que vacina você mais confia",
                "Pesquisa", JOptionPane.QUESTION_MESSAGE, null, vacinas, 
                vacinas [0]).toString( );
        JOptionPane.showMessageDialog(null, "Sua vacina " + escolhida + " será aplicada no dia D na hora H");

    }
}
