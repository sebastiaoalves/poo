/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uern.di.poo.exemplosaula.aula06e07;

/**
 *
 * @author sebastiao
 */
public class TesteConta {
    public static void main(String[] args) {
        //Conta c1 = new Conta ("Sebastião", 1000.0);
        //Conta c2 = new Conta ("Cicilia", 2000.0);
        System.out.println(Conta.SALDO_INICIAL);
        System.out.println("Cashback para depósito de 80 reais:" + Conta.calculaCashBack(80));
        System.out.println("Cashback para depósito de 200 reais:" + Conta.calculaCashBack(200));
        
    }
}
