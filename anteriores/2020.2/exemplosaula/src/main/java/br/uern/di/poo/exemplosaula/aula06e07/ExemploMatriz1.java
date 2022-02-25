/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uern.di.poo.exemplosaula.aula06e07;

/**
 *
 * @author sebastiao
 */
public class ExemploMatriz1 {
    public static void main(String[] args) {
        int quantidadeDeVendas [ ] = { 5, 10, 4, 18, 25, 20, 17, 9, 12, 21 };
        
        double valoresVendas [][] = new double [ quantidadeDeVendas.length ][];
        
        for(int i=0;i<valoresVendas.length; i++)
            valoresVendas[i]  = new double [quantidadeDeVendas[i]];
        
    }
}
