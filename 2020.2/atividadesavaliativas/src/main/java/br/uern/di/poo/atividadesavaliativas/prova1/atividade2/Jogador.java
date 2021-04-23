/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uern.di.poo.atividadesavaliativas.prova1.atividade2;

/**
 *
 * @author sebastiao
 */
public class Jogador {
    
    // Questão 3- a)
    public static final int cartasNoJogo = 5;
    
    //Questão 3- b)
    private final String nome;
    private CartaBaralho mao[];
    
    //Questão 3- c)
    private int pontos;

    //Questão 3- d)
    public String getNome() {
        return nome;
    }

    //Questão 3- d)
    public CartaBaralho[] getMao() {
        return mao;
    }
    
    //Questão 3- d)
    public int getPontos() {
        return pontos;
    }
    
    
    //Questão 4- a)
    public Jogador(String nome, CartaBaralho[] mao) {
        this.nome = nome;
        this.mao = mao;
        this.pontos = 0;
    }
    
    //Questão 4- b)
    public void adicionarPontuacao (CartaBaralho carta1, CartaBaralho carta2){
        this.pontos += carta1.getCarta().getPontos() + carta2.getCarta().getPontos();
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
    
}
