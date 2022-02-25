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
public class ExemploStringBuilder {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("Sebastião");
        sb.insert(3, "Emidio");
        
        System.out.println("Conteúdo: " + sb.toString());
        
        sb.delete(0, 5);
        
        System.out.println("Conteúdo: " + sb.toString());
        
        sb.setCharAt(0, '1');
        
        System.out.println("Conteúdo: " + sb.toString());
    }
}

