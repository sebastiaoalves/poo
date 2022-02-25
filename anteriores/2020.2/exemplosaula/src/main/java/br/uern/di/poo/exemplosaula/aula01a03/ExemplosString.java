package br.uern.di.poo.exemplosaula.aula01a03;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author sebastiao
 */
public class ExemplosString {
    
    public static void main(String args[]){
        
        String nome = new String("Sebastião");
        
        String sobrenome = "Alves";
        
        String nomeCompleto = nome + " " + sobrenome;
        
        int idade = 40;
        
        String nomeIdade = nomeCompleto + " " + idade + " anos";
        
        double peso = 76.8;
        
        System.out.println(nomeIdade + " - " + peso + " quilos");
        
        System.out.println("Tamanho da string nomeCompleto:" + nomeCompleto.length());
        
        System.out.println("5° caractere da string nome: " + nome.charAt(4));
        
        String primeira = "Sebastiao", segunda = "sebastiÃo";
        
        if(primeira.equalsIgnoreCase(segunda))
            System.out.println("As strings são iguais");
        else
            System.out.println("As string são diferentes");
        
        System.out.println("O caractere 'a' está na posição: " + primeira.indexOf('a'));
        System.out.println("O caractere 'a' está na posição: " + primeira.indexOf('a', 4));
        if (primeira.indexOf('a', 8) != -1)
            System.out.println("O caractere 'a' está na posição: " + primeira.indexOf('a', 8));
        
        System.out.println(segunda.substring(2, 7));
        
        System.out.println(primeira.substring( primeira.indexOf('a')+1, primeira.lastIndexOf('a')));
        
        Scanner entrada = new Scanner(System.in);
        
        String seuNome = entrada.nextLine();
        
        System.out.println("Nome: " + seuNome);
        
    }
    
}
