/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uern.di.poo.exemplosaula.aula04e05;

/**
 *
 * @author sebastiao
 */
public class BoxingUnboxing {
    public static void main(String[] args) {
        //Integer myInteger = new Integer(10);
        Integer intBoxed = 10;
               
        int integerUnboxed = intBoxed + 2;
                
        Double doubleBoxed = 1.5 + intBoxed + integerUnboxed;
        
        String s = "4.5";
        
        double valor = Double.parseDouble(s);
        
        String s2 = "10";
        
        int valorInteiro = Integer.parseInt(s2);
        
        int idade = 40;
        
        String frase = "Ele tem " + idade + " anos.";
        
        System.out.println(frase);
        
        String condicao = String.valueOf(false);
        
        System.out.println(condicao);
        
        String alt = Double.toString(1.64);
        
        String altura = String.valueOf(1.64);
        
        String strDoubleBoxed = doubleBoxed.toString();
        
        
        
//        System.out.println(doubleBoxed);
//        String precoEmString = String.valueOf(59.90);
//String idadeEmString = String.valueOf(40);
//String precoEmString2 = new Double(59.90).toString();
//        if(intBoxed==10 ^ integerUnboxed<10)
//            System.out.println("Isso.");
//        for(int i=0;i<100;i+=2);
        
    }
}
