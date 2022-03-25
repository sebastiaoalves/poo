/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uern.di.poo.atividadesavaliativas.prova4;

// Respostas para a letra a
public class Aluno {
    
    private String nome;
    private double media;
    private int faltas;
    
    public Aluno (String nome){
        this.nome = nome;
        this.media = 0.0;
        this.faltas = 0;
    }
    
    // Respostas para a letra b

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome + "\nMédia: " + media + 
                "\nFaltas: " + faltas;
    }
    
}
