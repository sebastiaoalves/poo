/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uern.di.poo.aula07;

/**
 *
 * @author lordi
 */
public class Calculadora {
    
    /**
     * @return the numero1
     */
    public int getNumero1() {
        return numero1;
    }

    /**
     * @param numero1 the numero1 to set
     */
    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    /**
     * @return the numero2
     */
    public int getNumero2() {
        return numero2;
    }

    /**
     * @param numero2 the numero2 to set
     */
    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    /**
     * @return the operador
     */
    public char getOperador() {
        return operador;
    }

    /**
     * @param operador the operador to set
     */
    public void setOperador(char operador) {
        this.operador = operador;
    }
    private int numero1;
    private int numero2;
    private char operador;

    public Calculadora() {
    }

    public Calculadora(int numero1, int numero2, char operador) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.operador = operador;
    }
    
    public int calcula( ){
        switch(operador){
            case '+':
                return numero1+numero2;
            case '-':
                return numero1-numero2;
            case '*':
                return numero1*numero2;
            case '/':
                return numero1/numero2;
            case '^':
                return (int)Math.pow(numero1, numero2);
            default:
                return -1;
        }
    }
}
