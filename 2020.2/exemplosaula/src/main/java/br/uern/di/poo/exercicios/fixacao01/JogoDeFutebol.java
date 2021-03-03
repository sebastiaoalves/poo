/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uern.di.poo.exercicios.fixacao01;

/**
 *
 * @author sebastiao
 */
public class JogoDeFutebol {

    public JogoDeFutebol(String nomeDoTimeDaCasa, int golsDoTimeDaCasa) {
        this.nomeDoTimeDaCasa = nomeDoTimeDaCasa;
        this.golsDoTimeDaCasa = golsDoTimeDaCasa;
    }
    
    private String nomeDoTimeDaCasa;
    
    private int golsDoTimeDaCasa;

    /**
     * @return the nomeDoTimeDaCasa
     */
    public String getNomeDoTimeDaCasa() {
        return nomeDoTimeDaCasa;
    }

    /**
     * @param nomeDoTimeDaCasa the nomeDoTimeDaCasa to set
     */
    public void setNomeDoTimeDaCasa(String nomeDoTimeDaCasa) {
        this.nomeDoTimeDaCasa = nomeDoTimeDaCasa;
    }

    /**
     * @return the golsDoTimeDaCasa
     */
    public int getGolsDoTimeDaCasa() {
        return golsDoTimeDaCasa;
    }

    /**
     * @param golsDoTimeDaCasa the golsDoTimeDaCasa to set
     */
    public void setGolsDoTimeDaCasa(int golsDoTimeDaCasa) {
        this.golsDoTimeDaCasa = golsDoTimeDaCasa;
    }
   
    
    
}
