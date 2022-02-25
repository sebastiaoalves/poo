/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uern.di.poo.exemplosaula.aula08;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author sebastiao
 */
public class GUIManual {
    
    public static void main(String[] args) {
        
        // Cria o JFrame
        JFrame janela = new JFrame("Jogo");
        
        // Tudo o que você adiciona é no painel de conteúdo do Frame
        Container painelConteudo = janela.getContentPane();
        
        // Setando o layout de grade com 3 linhas e 2 colunas
        painelConteudo.setLayout(new GridLayout(3,2));
        
        // Adicionando coisas ao painel
        JLabel label1 = new JLabel("Nome");
        painelConteudo.add(label1);
        
        JTextField caixaTexto1 = new JTextField(20);
        painelConteudo.add(caixaTexto1);
        
        JLabel label2 = new JLabel("Email");
        painelConteudo.add(label2);
        
        JTextField caixaTexto2 = new JTextField(20);
        painelConteudo.add(caixaTexto2);
        
        JButton botaoOk = new JButton("Ok");
        painelConteudo.add(botaoOk);
        
        // Colocando um evento para o botão
        botaoOk.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent ae) {
                // O código para a ação
                JOptionPane.showMessageDialog(janela, "Você clicou no botão");
            }
        });
        
        // Coloca o tamanho suficiente para caber os componentes
        janela.pack();
        
        // Torna a janela visível
        janela.setVisible(true);
        
    }
    
}
