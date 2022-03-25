/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uern.di.poo.exemplosaula.aula10a14;

import javax.swing.JOptionPane;

/**
 *
 * @author sebastiao
 */
public class TesteExcecao {
    
    public static void main(String[] args) {
        int tamanhoDaFonte=0;
        do{
            try{
                String entrada = JOptionPane.showInputDialog("Digite o tamanho da fonte");
                String entradaSemEspaco = entrada.trim( );
                tamanhoDaFonte = Integer.parseInt (entradaSemEspaco);
            }catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "O número digitado está incorreto.");
            }catch(NullPointerException npe){
                JOptionPane.showMessageDialog(null, "Nenhum número foi digitado.");
            }
        }while(tamanhoDaFonte==0);
        
        System.out.println("O tamanho da fonte é " + tamanhoDaFonte);
    }
    
}
