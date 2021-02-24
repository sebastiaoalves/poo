/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uern.di.poo.aula24;

/**
 *
 * @author lordi
 */
public class TestePontuavel {
    public static void main(String[] args) {
        VitoriaPorPontos vpp = new VitoriaPorPontos(10, 8);
        VitoriaPorFinalizacao vpf = new VitoriaPorFinalizacao(1, 30, "Guilhotina");
        Empate e = new Empate(9);
        VitoriaPorNocaute vpn = new VitoriaPorNocaute(2, 10, "Gancho");
        
        TipoResultado cartel []  = {vpp, vpf, e, vpn};
        for (TipoResultado tmp: cartel)
            if(tmp instanceof Pontuavel){
                System.out.println("Pontos do lutador 1: " + ((Pontuavel)tmp).getPontosLutador1());
                System.out.println("Pontos do lutador 2: " + ((Pontuavel)tmp).getPontosLutador2());
            }
    }
}
