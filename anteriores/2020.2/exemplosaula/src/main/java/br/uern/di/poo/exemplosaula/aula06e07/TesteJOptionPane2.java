/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uern.di.poo.exemplosaula.aula06e07;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

/**
 *
 * @author sebastiao
 */
public class TesteJOptionPane2 {
    public static void main(String[] args) {
        String nome = showInputDialog ( "Qual o seu nome? ");
        showMessageDialog(null, "Bem vindo," + nome);
        int idade = parseInt( showInputDialog ( "Qual a sua idade?") );
        int comorbidade = showConfirmDialog(null,
                "Você tem diabetes ou hipertensão?", "Escolha", YES_NO_OPTION);
        if ( idade > 65 || comorbidade == YES_OPTION)
            showMessageDialog(null, "Você é do grupo de risco da COVID-19",
                    "Cuidado", WARNING_MESSAGE);
        
        String vacinas [] = {"Astrazeneca", "BioNTech", "Jansen", "Sputinik"};
        String escolhida = showInputDialog(null, "Que vacina você mais confia",
                "Pesquisa", QUESTION_MESSAGE, null, vacinas, 
                vacinas [0]).toString( );
        showMessageDialog(null, "Sua vacina " + escolhida + 
                " será aplicada no dia D na hora H");

    }
}
