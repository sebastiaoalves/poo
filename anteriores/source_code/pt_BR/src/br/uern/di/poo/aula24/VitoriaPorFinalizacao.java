package br.uern.di.poo.aula24;

import br.uern.di.poo.aula22.*;

public class VitoriaPorFinalizacao extends Vitoria implements Golpeavel {
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

    @Override
    public String getGolpe() {
        return golpe;
    }

    public void setGolpe(String golpe) {
        this.golpe = golpe;
    }

    @Override
    public String toString() {
        return "Vitoria por finalização " + getGolpe();
    }

    @Override
    public String getMotivo() {
        return "Finalização";
    }
       
}
