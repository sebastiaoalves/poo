/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uern.di.poo.exemplosaula.aula10a14;

/**
 *
 * @author sebastiao
 */
public class Vendedor extends Funcionario{
    
    private double vendasNoMes;
    
    private static final double PERCENTUAL_SOBRE_VENDA = 0.05;

    public Vendedor(double vendasNoMes, String nome, String email, String telefone) {
        super(nome, email, telefone);
        this.vendasNoMes = vendasNoMes;
        this.salario = PERCENTUAL_SOBRE_VENDA * vendasNoMes;
    }

    public double getVendasNoMes() {
        return vendasNoMes;
    }
    
    
}
