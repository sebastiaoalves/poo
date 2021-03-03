package br.uern.di.poo.exemplosaula.aula04e05;

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
        if(oValorASerDepositado > 0){
            this.saldo += oValorASerDepositado;
            adicionaCashBack(oValorASerDepositado);
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
    
    private void adicionaCashBack(double oValor){
        if( oValor < 100.0 )
            this.saldo += oValor * 0.05;
        else
            this.saldo += 5.0;
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
