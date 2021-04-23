/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uern.di.poo.exemplosaula.aula010a12;

/**
 *
 * @author sebastiao
 */
public class Personagem {
    
    private int nivel;
    protected int forca, agilidade, inteligencia, vida;
    
    //public static final int VIDA_PADRAO = 100;

    public Personagem(int forca, int agilidade, int inteligencia) {
        this.forca = forca;
        this.agilidade = agilidade;
        this.inteligencia = inteligencia;
        this.nivel = 1;
        this.vida = calculaVida();
    }
    
    protected int calculaVida() {
        return  this.forca + this.agilidade + this.inteligencia;
    }
    
    @Override
    public String toString(){
        return "{Força: " + this.forca + ", Agilidade: " + this.agilidade +
                ", Inteligência: " + this.inteligencia + ", Nível: " + this.nivel;
    }
    
    @Override
    public boolean equals (Object outroPersonagem){
        if (! (outroPersonagem instanceof Personagem))
            return false;
        Personagem oOutro = (Personagem) outroPersonagem;
        return oOutro.nivel == this.nivel && oOutro.forca == this.forca &&
                oOutro.agilidade == this.agilidade && oOutro.inteligencia == this.inteligencia;
    }
    
    public final void recebeDano(int pontosDeDano){
        
    }
    
}
