/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uern.di.poo.aula25;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author lordi
 */
public class TextColorHandler extends KeyAdapter{

    int r=0, g=0, b=0;
    
    @Override
    public void keyTyped(KeyEvent e) {
        Color cor = new Color(r, g, b);
        r+=10;
        g+=10;
        b+=10;
        JTextField caixaDeTexto = (JTextField) e.getComponent();
        caixaDeTexto.setBackground(cor);
    }
    
}
