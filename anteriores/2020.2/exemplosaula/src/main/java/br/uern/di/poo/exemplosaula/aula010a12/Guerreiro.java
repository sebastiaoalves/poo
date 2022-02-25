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
public final class Guerreiro extends Personagem{
    
  private String arma;

    public Guerreiro(String arma, int forca, int agilidade, int inteligencia) {
        super(forca, agilidade, inteligencia);
        this.arma = arma;
    }

    @Override
    public int calculaVida() {
        return (int) (1.5* (this.forca + this.agilidade + this.inteligencia));
    }
  
  
    
}