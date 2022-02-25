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
public class Mago extends Personagem{ 
    
    private int mana;
    
    public Mago (int forca, int agilidade, int inteligencia, int mana){
        super (forca, agilidade, inteligencia);
        this.mana = mana;
        this.vida = super.calculaVida();
    }

}
