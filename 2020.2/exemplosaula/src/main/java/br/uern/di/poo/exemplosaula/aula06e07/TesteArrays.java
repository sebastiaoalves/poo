/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uern.di.poo.exemplosaula.aula06e07;

import java.util.Arrays;

/**
 *
 * @author sebastiao
 */
public class TesteArrays {
    
    static void exibeVetor (int vetor[]){
        for(int elemento:vetor)
            System.out.print(elemento + ", ");
        System.out.println("");
    }
    
    public static void main(String[] args) {
        
        int diasAulasFevereiro [] = {10, 3, 24, 31, 17};
        
        int diasAulasMarco [] = new int [diasAulasFevereiro.length];
        
        System.arraycopy(diasAulasFevereiro, 0, diasAulasMarco, 0, diasAulasFevereiro.length);
        
        System.out.println("Dias de aula em fevereiro: ");
        exibeVetor(diasAulasFevereiro);
        
        if ( Arrays.equals (diasAulasFevereiro, diasAulasMarco) )
            System.out.println ("\n\nOs meses tem aulas em dias iguais");
        
        Arrays.sort(diasAulasMarco);
        
        System.out.println("\nDias de aula em março: " + Arrays.toString(diasAulasMarco));
        
        int posicao = Arrays.binarySearch (diasAulasMarco, 10);
        if (  posicao >= 0 ){
            System.out.println("\n\nTem aula dia 10 de março");
            System.out.println("\nElemento encontrado na posição "+ posicao);
        }else
            System.out.println("\n\nNão tem aula dia 10 de março");
        
        double notas [ ] = new double [30];
        Arrays.fill (notas, 7.0);
        
        System.out.println("Notas da turma: " + Arrays.toString(notas));

    }
    
}
