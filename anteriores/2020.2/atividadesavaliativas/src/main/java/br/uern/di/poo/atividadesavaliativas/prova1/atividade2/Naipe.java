/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uern.di.poo.atividadesavaliativas.prova1.atividade2;

/**
 *
 * @author sebastiao
 */
public enum Naipe {
    
    PAUS ("paus"), OURO("ouro"), COPAS("copas"), ESPADAS("espadas");
    
    private final String nome;

    private Naipe(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
}
