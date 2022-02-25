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
public class ExemploVetor1 {
    
    public static void main(String[] args) {
        double vetorDouble [] = new double[5];
        
        for(int i=0;i<vetorDouble.length;i++)
            System.out.println(vetorDouble[i]);
        
        String [] vetorStrings;
        vetorStrings = new String[10];
        for(int i=0;i<vetorStrings.length;i++)
            System.out.println(vetorStrings[i]);
        
        char opcoes [] = { 'a', 'i', 'd'};
        for (char tmp : opcoes)
            tmp = 'X';
        
        for (char tmp : opcoes)
            System.out.println(tmp);
        
        StringBuilder vetorSB[] = new StringBuilder[3];
        
        for (int i = 0; i < vetorSB.length; i++) {
            vetorSB[i] = new StringBuilder();
            vetorSB[i].append("Sebastião");
        }
        
        for(StringBuilder tmp : vetorSB)
            tmp.append("Alves");
        
        for(StringBuilder tmp : vetorSB)
            System.out.println(tmp.toString());
        
    }
    
}
