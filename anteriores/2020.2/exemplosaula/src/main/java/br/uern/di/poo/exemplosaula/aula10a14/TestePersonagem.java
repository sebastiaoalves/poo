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
public class TestePersonagem {
    
    public static void main(String[] args) {
//        Mago gandalf = new Mago(10, 11, 15, 50);
        Guerreiro ivarBoneless = new Guerreiro ("Espada longa", 14, 10, 7);
//        Personagem npc = new Personagem(4, 5, 4);

        String itens [] = {"Bolsa", "Chave-mestra"};
        Ladrao bilboBaggins = new Ladrao(itens, 4, 12, 10);
        Guerreiro thorinOakenshield = new Guerreiro("Espada longa", 14, 10, 7);
        System.out.println("Vida de Bilbo: " + bilboBaggins.calculaVida());
        System.out.println("Vida de Thorin: " + thorinOakenshield.calculaVida());
        
        Personagem hobbit = bilboBaggins;
        System.out.println("Vida do Hobbit: " + hobbit.calculaVida());
        
        Personagem dwarf = thorinOakenshield;
        System.out.println("Vida do Anão: " + dwarf.calculaVida());
        
  
        if(bilboBaggins.equals(thorinOakenshield))
            System.out.println("Bilbo e Thorin são iguais!");
        
        if(thorinOakenshield.equals(ivarBoneless))
            System.out.println("Thorin e Ivar são iguais!");
        
        if(thorinOakenshield == ivarBoneless)
            System.out.println("Thorin e Ivar tem a mesma referência!");
        
        Guerreiro kingUnderTheMountain = thorinOakenshield;
        
        kingUnderTheMountain.setArma("Machado de Guerra");
        
        System.out.println("Arma de Thorin Escudo de Carvalho " + 
                thorinOakenshield.getArma());
        
        if(thorinOakenshield == kingUnderTheMountain)
            System.out.println("Thorin é o rei sob a montanha!");
        
        Personagem p = new Guerreiro("Espada", 10, 9, 12);
        
    }
    
}
