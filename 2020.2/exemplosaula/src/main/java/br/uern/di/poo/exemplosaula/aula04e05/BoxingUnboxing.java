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
        Integer intBoxed = 10;
        int integerUnboxed = intBoxed + 2;
        Double doubleBoxed = 1.5 + intBoxed + integerUnboxed;
        System.out.println(doubleBoxed);
        String precoEmString = String.valueOf(59.90);
String idadeEmString = String.valueOf(40);
String precoEmString2 = new Double(59.90).toString();
        if(intBoxed==10 ^ integerUnboxed<10)
            System.out.println("Isso.");
        for(int i=0;i<100;i+=2);
        
    }
}
