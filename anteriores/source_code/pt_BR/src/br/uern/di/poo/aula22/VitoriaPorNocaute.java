package br.uern.di.poo.aula22;

public class VitoriaPorNocaute extends Vitoria{
    private int round;
    private int segundos;
    private String golpe;

    public String getGolpe() {
        return golpe;
    }

    public void setGolpe(String golpe) {
        this.golpe = golpe;
    }

    public VitoriaPorNocaute(int round, int segundos, String golpe) {
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
    public String toString() {
        return "Vitoria por nocaute aos " + segundos + "s  do " + round +"º round ("+golpe+").";
    }
    
}
