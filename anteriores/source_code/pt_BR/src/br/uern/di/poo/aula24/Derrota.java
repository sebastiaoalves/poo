package br.uern.di.poo.aula24;

public class Derrota extends TipoResultado{
    Vitoria resultadoVencedor;

    public Derrota(Vitoria resultadoVencedor) {
        this.resultadoVencedor = resultadoVencedor;
    }

    public Vitoria getResultadoVencedor() {
        return resultadoVencedor;
    }

    public void setResultadoVencedor(Vitoria resultadoVencedor) {
        this.resultadoVencedor = resultadoVencedor;
    }
    
}
