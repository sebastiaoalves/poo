/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uern.di.poo.aula11;

/**
 *
 * @author lordi
 */
public class VideoGame {
    
    private String nome;
    private double preçoFinal;

    public VideoGame(String nome, double preçoFinal) {
        this.nome = nome;
        this.preçoFinal = preçoFinal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreçoFinal() {
        return preçoFinal;
    }

    public void setPreçoFinal(double preçoFinal) {
        this.preçoFinal = preçoFinal;
    }
    
    public double getPreçoSemImpostos(){
        double valorImpostos=0.0;
        for (Impostos i : Impostos.values() )
            valorImpostos += i.getTaxa() * preçoFinal;
         return preçoFinal - valorImpostos;
    }

    @Override
    public String toString() {
        return "VideoGame"
                + "\nnome=" + nome
                + "\npreço final=" + preçoFinal
                + "\nvalor sem impostos=" + getPreçoSemImpostos();
    }
}
