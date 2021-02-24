/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uern.di.poo.aula11;

/**
 *
 * @author lordi
 */
public class TesteImposto {
    public static void main(String[] args) {
        VideoGame ps4 = new VideoGame("PlayStation 4", 1500.0);
        VideoGame ps4pro = new VideoGame("PlayStation 4 Pro", 2200.0);
        
        System.out.println("Preço sem imposto do" + ps4.getNome()+" : " + ps4.getPreçoSemImpostos());
        System.out.println("Preço sem imposto do" + ps4pro.getNome()+" : " + ps4pro.getPreçoSemImpostos());
        
        System.out.println(ps4);
        System.out.println(ps4pro);
    }
}
