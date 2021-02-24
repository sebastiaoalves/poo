package br.uern.di.poo.aula22;

public class VitoriaPorPontos extends Vitoria {
    int pontosVencedor, pontosPerdedor;

    public VitoriaPorPontos(int pontosVencedor, int pontosPerdedor) {
        this.pontosVencedor = pontosVencedor;
        this.pontosPerdedor = pontosPerdedor;
    }

    @Override
    public String toString() {
        return "Vitoria por pontos (" + pontosVencedor + " - " + pontosPerdedor + ").";
    }

    public int getPontosVencedor() {
        return pontosVencedor;
    }

    public void setPontosVencedor(int pontosVencedor) {
        this.pontosVencedor = pontosVencedor;
    }

    public int getPontosPerdedor() {
        return pontosPerdedor;
    }

    public void setPontosPerdedor(int pontosPerdedor) {
        this.pontosPerdedor = pontosPerdedor;
    }
    
    
}
