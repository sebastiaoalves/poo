package br.uern.di.poo.exemplosaula.aula06e07;

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
    
    private int numero;

    public int getNumero() {
        return numero;
    }
    
    public static final double SALDO_INICIAL = 10.0;
    
    private static final double LIMITE_CASHBACK = 100.0;
    
    private static final double PERCENTUAL_CASHBACK = 0.05;
    
    private static final double TAXA_DE_SAQUE = 12.0;
    
    public Conta(int numero){
        this(numero, "A definir", SALDO_INICIAL);
    }
    
    public Conta(int numero, String nomeTitular){
        this(numero, nomeTitular, SALDO_INICIAL);
    }
    
    public Conta (int numero, String nomeTitular, double saldo) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    /**
     * Deposita um valor na conta, <b> retornando o novo saldo</b>.
     * @param oValorASerDepositado O valor a ser depositado
     * @return O saldo após o depósito.
     */
    public double realizaDeposito(double oValorASerDepositado){
        if(oValorASerDepositado > 0){
            this.saldo += oValorASerDepositado + calculaCashBack(oValorASerDepositado);
        }else{
            System.err.println("Erro ao realizar depósito: valor a ser depositado é negativo");
        }
        return this.saldo;
    }
    
    public double realizaSaque(double oValorASerSacado){
        if(oValorASerSacado > 0){
            if(oValorASerSacado <= this.saldo){
                this.saldo -= oValorASerSacado;  // this.saldo = this.saldo - oValorASerSacado
            }else{
                System.err.println("Saque não realizado! Não há saldo o suficiente!");
            }
        }else{
            System.err.println("Erro ao realizar saque: valor a ser sacado é negativo");
        }

        return this.saldo;
    }
    
    public static double calculaCashBack(double oValor){
        if( oValor < LIMITE_CASHBACK )
            return oValor * PERCENTUAL_CASHBACK;
        else
            return LIMITE_CASHBACK * PERCENTUAL_CASHBACK;
    }
    
    public String getNomeTitular(){
        return this.nomeTitular;
    }
    
    public double getSaldo(){
        return this.saldo;
    }    
    
}
