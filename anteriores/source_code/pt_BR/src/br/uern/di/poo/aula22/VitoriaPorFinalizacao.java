package br.uern.di.poo.aula22;

public class VitoriaPorFinalizacao extends Vitoria {
    private int round;
    private int segundos;
    private String golpe;

    public VitoriaPorFinalizacao(int round, int segundos, String golpe) {
        this.round = round;
        this.segundos = segundos;
        this.golpe = golpe;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public String getGolpe() {
        return golpe;
    }

    public void setGolpe(String golpe) {
        this.golpe = golpe;
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
