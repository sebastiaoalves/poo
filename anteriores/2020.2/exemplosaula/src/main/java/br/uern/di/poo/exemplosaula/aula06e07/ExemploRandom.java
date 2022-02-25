/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uern.di.poo.exemplosaula.aula06e07;

import java.util.Random;

/**
 *
 * @author sebastiao
 */
public class ExemploRandom {
    
    public static void main(String[] args) {
        
        Random geradorAleatorio = new Random();
        
        int i1, i2, i3;
        i1 = geradorAleatorio.nextInt(10);
        i2 = geradorAleatorio.nextInt(10);
        i3 = geradorAleatorio.nextInt(10);
        System.out.println(" " + i1 + " " + i2 + " " + i3);
        
        double d1, d2, d3;
        d1 = geradorAleatorio.nextDouble();
        d2 = geradorAleatorio.nextDouble();
        d3 = geradorAleatorio.nextDouble();
        System.out.println(" " + d1 + " " + d2 + " " + d3);
    }
    
}
