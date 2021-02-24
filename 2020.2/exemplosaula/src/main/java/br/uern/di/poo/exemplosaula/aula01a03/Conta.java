package br.uern.di.poo.exemplosaula.aula01a03;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author sebastiao
 */
public class Conta {
    
    String nomeTitular;
    
    double saldo;
    
    Conta(){
        this("A definir", 0.0);
    }
    
    Conta(String nomeTitular){
        this(nomeTitular, 0.0);
    }
    
    Conta (String nomeTitular, double saldo) {
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }
    
    /**
     * Deposita um valor na conta, <b> retornando o novo saldo</b>.
     * @param oValorASerDepositado O valor a ser depositado
     * @return O saldo após o depósito.
     */
    double realizaDeposito(double oValorASerDepositado){
        this.saldo += oValorASerDepositado;
        return this.saldo;
    }
}
