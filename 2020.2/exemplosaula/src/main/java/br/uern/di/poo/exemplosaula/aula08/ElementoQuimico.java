/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uern.di.poo.exemplosaula.aula08;

/**
 *
 * @author sebastiao
 */
public enum ElementoQuimico {
    
    H("H", "Hidrogênio", 1), HE("He", "Hélio", 2), O("O", "Oxigênio",9), C("C", "Carbono", 5);
    
    private final String sigla, nome;
    private int numero;

    private ElementoQuimico(String sigla, String nome, int numero) {
        this.sigla = sigla;
        this.nome = nome;
        this.numero = numero;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }
    
}
