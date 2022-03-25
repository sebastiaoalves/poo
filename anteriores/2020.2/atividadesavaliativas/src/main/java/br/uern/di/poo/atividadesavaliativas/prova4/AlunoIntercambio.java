/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uern.di.poo.atividadesavaliativas.prova4;

/**
 *
 * @author sebastiao
 */
public class AlunoIntercambio extends Aluno{
    
    private String universidade;

    public AlunoIntercambio(String universidade, String nome) {
        super(nome);
        this.universidade = universidade;
    }   

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    @Override
    public String toString() {
        return super.toString() + "\nUniversidade:" + universidade;
    }
    
}
