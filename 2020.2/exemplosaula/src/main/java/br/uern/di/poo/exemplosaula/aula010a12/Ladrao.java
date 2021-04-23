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
public class Ladrao extends Personagem{
    
    private String itens[];

    public Ladrao(String[] itens, int forca, int agilidade, int inteligencia) {
        super(forca, agilidade, inteligencia);
        this.itens = itens;
    }

    @Override
    public String toString() {
        return "Ladrao{" + "itens=" + itens + '}';
    }

}
