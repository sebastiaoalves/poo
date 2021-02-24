package br.uern.di.poo.aula22;

public abstract class Vitoria extends TipoResultado{

    @Override
    public abstract String toString();
    
    public static void main(String[] args) {
        Vitoria v1 = new VitoriaPorPontos(50, 45), 
                v2 = new VitoriaPorNocaute(1, 13, "cruzado de direita");
        System.out.println(v1.toString() + "\n" + v2.toString());
    }
}
