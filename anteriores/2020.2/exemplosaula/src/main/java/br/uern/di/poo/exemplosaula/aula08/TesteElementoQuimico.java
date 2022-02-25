/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uern.di.poo.exemplosaula.aula08;

import java.util.Arrays;

/**
 *
 * @author sebastiao
 */
public class TesteElementoQuimico {
    public static void main(String[] args) {
        ElementoQuimico elemento;
        //elemento = new ElementoQuimico("S", "Sebastião ", 1000);
        elemento = ElementoQuimico.H;
        System.out.println(elemento.getNome() + " " + elemento.getSigla());
        
        String nomesElementos [ ]  = new String [ ElementoQuimico.values().length ];
        int i=0;
        for(ElementoQuimico e : ElementoQuimico.values())
            nomesElementos [i++] = e.getNome();
        System.out.println(Arrays.toString (nomesElementos));
            
    }
}
