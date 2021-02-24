/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uern.di.poo.exemplosaula.aula01a03;

import javax.swing.JFrame;

/**
 *
 * @author sebastiao
 */
public class HelloJanela {
    public static void main(String[] args) {
        
        JFrame janela = new JFrame("Janela Olá mundo");
        
        janela.setVisible(true);
        //janela.setSize(500, 500);
        janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
}
