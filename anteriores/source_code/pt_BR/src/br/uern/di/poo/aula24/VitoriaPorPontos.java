package br.uern.di.poo.aula24;

import br.uern.di.poo.aula22.*;

public class VitoriaPorPontos extends Vitoria implements Pontuavel, Comparable{
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

    @Override
    public int getPontosLutador1() {
       return this.pontosVencedor;
    }

    @Override
    public int getPontosLutador2() {
        return this.pontosPerdedor;
    }

    @Override
    public int compareTo(Object o) {
        VitoriaPorPontos v =null;
        if(o instanceof VitoriaPorPontos)
            v = (VitoriaPorPontos)o;
        else{
             System.out.println("Erro geral de execução");
             System.exit(0);
        }
        int diffAtual = getPontosLutador1() - getPontosLutador2();
        int diffOutra = v.getPontosLutador1() - v.getPontosLutador2();
        return diffAtual - diffOutra;
    }
     
}
