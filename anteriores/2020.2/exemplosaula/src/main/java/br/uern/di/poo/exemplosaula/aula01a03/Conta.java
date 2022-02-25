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
    
    private String nomeTitular;
    
    private double saldo;
    
    public Conta(){
        this("A definir", 0.0);
    }
    
    public Conta(String nomeTitular){
        this(nomeTitular, 0.0);
    }
    
    public Conta (String nomeTitular, double saldo) {
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    /**
     * Deposita um valor na conta, <b> retornando o novo saldo</b>.
     * @param oValorASerDepositado O valor a ser depositado
     * @return O saldo após o depósito.
     */
    public double realizaDeposito(double oValorASerDepositado){
        this.saldo += oValorASerDepositado;
        adicionaCashBack(oValorASerDepositado);
        return this.saldo;
    }
    
    private void adicionaCashBack(double oValor){
        this.saldo += oValor * 0.05;
    }
    
    public String getNomeTitular(){
        return this.nomeTitular;
    }
            
//    public void setNomeTitular(String nomeTitular){
//        this.nomeTitular = nomeTitular;
//    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
//    public void setSaldo(double saldo){
//        this.saldo = saldo;
//    }
}
