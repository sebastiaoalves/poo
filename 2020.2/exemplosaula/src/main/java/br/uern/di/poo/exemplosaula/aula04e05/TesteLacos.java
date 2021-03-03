/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uern.di.poo.exemplosaula.aula04e05;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author sebastiao
 */
public class TesteLacos {
    
    public static void main(String[] args) {
        for(int i=1;i<100;i*=2)
            System.out.println("Valor de i: " + i);
        
        
//        Scanner entradaPadrao = new Scanner(System.in);
//        int numero;
//        do{
//            System.out.println("Digite um número de 0 a 10  para ver a tabuada ou outro para sair");
//            numero = entradaPadrao.nextInt();
//            for(int fator=0; fator<=10; fator++)
//                System.out.println(fator+" x "+numero+" = " + (fator*numero));
//        } while(numero>=0 && numero<=10);

        Random geradorAleatorio = new Random();
        for(int i = 0; i < 10 ; i++)
            System.out.println(geradorAleatorio.nextInt(100));
        
    }
    
}
