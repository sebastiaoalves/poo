/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uern.di.poo.exemplosaula.aula010a12;

/**
 *
 * @author sebastiao
 */
public class Apoio extends Funcionario {
    
    private double salarioFixo;
    
    public Apoio (double salarioFixo, String nome, String email, String telefone){
        super(nome, email, telefone);
        this.salarioFixo = salarioFixo;
        this.salario = salarioFixo;
    }
    
}
