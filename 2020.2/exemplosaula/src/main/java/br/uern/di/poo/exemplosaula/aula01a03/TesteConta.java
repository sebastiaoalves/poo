package br.uern.di.poo.exemplosaula.aula01a03;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author sebastiao
 */
public class TesteConta {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        Conta contaCorrente = new Conta("Sebastião", 100.0);
        
        //contaCorrente.nomeTitular = "Sebastião";
        //contaCorrente.saldo = 150;
        
        System.out.println("Nome do titular da conta corrente: " + contaCorrente.getNomeTitular());
        System.out.println("Saldo da conta corrente: " + contaCorrente.getSaldo());
        
        Conta contaPoupanca = new Conta();
        
        //contaPoupanca.nomeTitular = "Cicilia";
        //contaPoupanca.saldo = entrada.nextDouble();
        
        System.out.println("Nome do titular da conta poupanca: " + contaPoupanca.getNomeTitular());
        System.out.println("Saldo da conta poupança: " + contaPoupanca.getSaldo());
        
        Conta contaInvestimento = new Conta("Max");
        
        System.out.println("Nome do titular da conta investimento: " + contaInvestimento.getNomeTitular());
        System.out.println("Saldo da conta investimento: " + contaInvestimento.getSaldo());
        
        double novoSaldo = contaCorrente.realizaDeposito(50);
        
        System.out.println("Saldo da conta de " + contaInvestimento.getNomeTitular() + 
                " agora é de R$ " + contaInvestimento.getSaldo());
        
        //contaInvestimento.setNomeTitular("Henrique");
        //contaInvestimento.setSaldo(100);
     
        System.out.println("Saldo da conta de " + contaInvestimento.getNomeTitular() + 
                " agora é de R$ " + contaInvestimento.getSaldo());
        
    }
}
