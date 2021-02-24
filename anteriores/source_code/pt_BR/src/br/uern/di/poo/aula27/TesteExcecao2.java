/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uern.di.poo.aula27;

import javax.swing.JOptionPane;

/**
 *
 * @author lordi
 */
public class TesteExcecao2 {
    public static void main(String[] args) {
        boolean deuCerto = false;
        do{
            try{
                double taxa = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da taxa"));
                deuCerto=true;
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Digite a p#!@ da taxa!!");
                System.out.println(ex.toString());
                ex.printStackTrace();
            }
        }while(!deuCerto);
    }
}
