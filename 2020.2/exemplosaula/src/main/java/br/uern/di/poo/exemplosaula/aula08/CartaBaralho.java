/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uern.di.poo.exemplosaula.aula08;

/**
 *
 * @author sebastiao
 */
public class CartaBaralho {
    
    private Carta carta;
    private Naipe naipe;

    public CartaBaralho(Carta carta, Naipe naipe) {
        this.carta = carta;
        this.naipe = naipe;
    }

    public Carta getCarta() {
        return carta;
    }

    public Naipe getNaipe() {
        return naipe;
    }
    
    public static CartaBaralho [] geraBaralho (){
        int tamanhoBaralho = Naipe.values().length * Carta.values().length;
        CartaBaralho baralho [] = new CartaBaralho[tamanhoBaralho];
        int idx = 0;
        for (Naipe naipe : Naipe.values())
            for(Carta carta : Carta.values())
                baralho [idx++] = new CartaBaralho(carta, naipe);
        return baralho;
    }
    
    public static void main(String[] args) {
        CartaBaralho meuBaralho [] = CartaBaralho.geraBaralho();
        for(CartaBaralho minhaCarta : meuBaralho)
            System.out.println (minhaCarta.getCarta().getNome() + " de " +
                    minhaCarta.getNaipe().getNome());
    }
    
}
