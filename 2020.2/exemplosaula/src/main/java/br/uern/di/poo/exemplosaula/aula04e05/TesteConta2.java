/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uern.di.poo.exemplosaula.aula04e05;

/**
 *
 * @author sebastiao
 */
public class TesteConta2 {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Sebastião", 100.0);
        double novoSaldo = conta1.realizaSaque(50.0);
        System.out.println("O novo saldo é: " + novoSaldo);
        novoSaldo = conta1.realizaSaque(200.0);
        System.out.println("O novo saldo é: " + novoSaldo);
        novoSaldo = conta1.realizaSaque(-200.0);
        System.out.println("O novo saldo é: " + novoSaldo);
        novoSaldo = conta1.realizaDeposito(-200.0);
        System.out.println("O novo saldo é: " + novoSaldo);
        novoSaldo = conta1.realizaDeposito(200.0);
        System.out.println("O novo saldo é: " + novoSaldo);
        novoSaldo = conta1.realizaDeposito(50.0);
        System.out.println("O novo saldo é: " + novoSaldo);
    }
}
