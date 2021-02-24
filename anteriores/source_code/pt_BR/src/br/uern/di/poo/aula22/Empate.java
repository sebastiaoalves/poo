package br.uern.di.poo.aula22;

public class Empate extends TipoResultado{
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
    
       
}
