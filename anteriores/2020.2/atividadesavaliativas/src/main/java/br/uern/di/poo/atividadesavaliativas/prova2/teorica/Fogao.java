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
public class Fogao extends Equipamento{
    
    private int numeroDeBocas;

    public Fogao(int numeroDeBocas, String modelo) {
        super(modelo);
        this.numeroDeBocas = numeroDeBocas;
    }

    public int getNumeroDeBocas() {
        return numeroDeBocas;
    }

    public void setNumeroDeBocas(int numeroDeBocas) {
        this.numeroDeBocas = numeroDeBocas;
    }
    
}
