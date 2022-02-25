/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uern.di.poo.exercicios.fixacao01;

import br.uern.di.poo.exemplosaula.aula01a03.Conta;

/**
 *
 * @author sebastiao
 */
public class ExercicioString {
    
    public static void main(String[] args) {
        Conta banco[] =  new Conta[10];

        for (int i = 0; i < banco.length; i++)
            banco[i] = new Conta("Conta "+i);

        for(Conta c:banco)
            c.realizaDeposito(100);

        for(Conta c:banco)
            System.out.println(c);

    }
    
}
