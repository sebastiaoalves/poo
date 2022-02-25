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
public class Gerente extends Funcionario{
    
    private double salarioBase;
    private Vendedor equipeDeVenda[];
    
    private static final double PERCENTUAL_SOBRE_VENDEDOR = 0.01;
    

    public Gerente(double salarioBase, Vendedor[] equipeDeVenda, String nome, String email, String telefone) {
        super(nome, email, telefone);
        this.salarioBase = salarioBase;
        this.equipeDeVenda = equipeDeVenda;
        this.salario = salarioBase;
        for(Vendedor v : equipeDeVenda)
            this.salario += PERCENTUAL_SOBRE_VENDEDOR * v.getVendasNoMes();
    }
  
    
}
