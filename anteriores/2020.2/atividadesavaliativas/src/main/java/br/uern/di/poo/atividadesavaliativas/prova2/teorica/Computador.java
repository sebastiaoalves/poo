/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uern.di.poo.atividadesavaliativas.prova2.teorica;

/**
 *
 * @author sebastiao
 */
public class Computador extends Equipamento implements Ligavel {
    
    private static final int consumoEletrico = 20;

    public Computador(String modelo) {
        super(modelo);
    }
    
    // Não há métodos get/set já que o único atributo é constante.

    @Override
    public int getConsumoEnergia() {
        return this.consumoEletrico;
    }
    
    
}
