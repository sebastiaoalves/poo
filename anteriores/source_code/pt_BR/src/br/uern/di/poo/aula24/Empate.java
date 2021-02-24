package br.uern.di.poo.aula24;

public class Empate extends TipoResultado implements Pontuavel{
    private int pontuacao;

    public Empate(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    @Override
    public String toString() {
        return "Empate " + this.pontuacao; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getPontosLutador1() {
        return this.pontuacao;
    }

    @Override
    public int getPontosLutador2() {
        return this.pontuacao;
    }
    
       
}
