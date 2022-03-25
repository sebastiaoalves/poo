/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uern.di.poo.atividadesavaliativas.prova2.teorica;

/**
 *
 * @author sebastiao
 */
public class TesteEquipamento {
    
    public static void main(String[] args) {
        Fogao fogao1 = new Fogao(5, "Tabajara Plus");
        Fogao fogao2 = new Fogao(2, "Acme Travel");
        Computador computador1 = new Computador("Negativo Core 5");
        Computador computador2 = new Computador("Inserr Suspiron");
        
        Equipamento patrimonio [] = {fogao1, computador1, fogao2, computador2};
        
        for(Equipamento equipamento:patrimonio){
            System.out.println("Equipamento: " + equipamento.getModelo());
            if(equipamento instanceof Ligavel){
                Ligavel ligavel = (Ligavel) equipamento;
                System.out.println("Consumo de energia (W): " +ligavel.getConsumoEnergia());
            }
            System.out.println("----------");
        }

    }
    
}
