/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uern.di.poo.atividadesavaliativas.prova1.atividade2;

import javax.swing.ImageIcon;

/**
 *
 * @author sebastiao
 */
public class CartaBaralho {
    
    private final Carta carta;
    private final Naipe naipe;
    
    //Questão 1- a)
    private final ImageIcon imagem;

    // Questão 1- b)
    public CartaBaralho(Carta carta, Naipe naipe, ImageIcon imagem) {
        this.carta = carta;
        this.naipe = naipe;
        this.imagem = imagem;
    }
    
    // Questão 1- b)
    public ImageIcon getImagem(){
        return this.imagem;
    }

    public Carta getCarta() {
        return carta;
    }

    public Naipe getNaipe() {
        return naipe;
    }
    
    // Questão 2- c)
    public static CartaBaralho [] geraBaralho (){
        String pasta = "/home/sebastiao/NetBeansProjects/atividadesavaliativas/src/main/java/resources/images/"; // Questão 2- c)
        String extensão = ".png"; // Questão 2- c)
        int tamanhoBaralho = Naipe.values().length * Carta.values().length;
        CartaBaralho baralho [] = new CartaBaralho[tamanhoBaralho];
        int idx = 0;
        for (Naipe naipe : Naipe.values())
            for(Carta carta : Carta.values()){
                String arquivoCarta = pasta+naipe.getNome()+carta.getNome()+extensão; // Questão 2- c)
                baralho [idx++] = new CartaBaralho(carta, naipe, new ImageIcon(arquivoCarta)); // Questão 2- c)
            }
        return baralho;
    }
    
    public static void main(String[] args) {
        CartaBaralho meuBaralho [] = CartaBaralho.geraBaralho();
        for(CartaBaralho minhaCarta : meuBaralho)
            System.out.println (minhaCarta.getCarta().getNome() + " de " +
                    minhaCarta.getNaipe().getNome());
    }
    
}
