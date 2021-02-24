package br.uern.di.poo.aula24;

public abstract class Vitoria extends TipoResultado{

    @Override
    public abstract String toString();
    
    public static void main(String[] args) {
        Vitoria v1 = new VitoriaPorPontos(50, 45);
        Vitoria v2 = new VitoriaPorNocaute(1, 13, "cruzado de direita");
        System.out.println(v1.toString() + "\n" + v2.toString());
        
        Pontuavel p1 = new Empate(28), p2 = new VitoriaPorPontos(30, 27);
        System.out.println(" "+p1.getPontosLutador1() + " " +p1.getPontosLutador2());
        System.out.println(" "+p2.getPontosLutador1() + " " +p2.getPontosLutador2());
        
        Golpeavel g1 = new VitoriaPorFinalizacao(1, 50, "Mata leão"),
                g2 = new VitoriaPorNocaute(3, 100, "Cruzado");
        System.out.println("A luta acabou por " + g1.getMotivo() + " com o golpe " + g1.getGolpe());
        System.out.println("A luta acabou por " + g2.getMotivo() + " com o golpe " + g2.getGolpe());
        
        VitoriaPorPontos vitorias [ ]  = {
            new VitoriaPorPontos(30, 27),
            new VitoriaPorPontos(30, 28),
            new VitoriaPorPontos(28, 27),
            new VitoriaPorPontos(29, 28),
            new VitoriaPorPontos(28, 26)
        };
        
        java.util.Arrays.sort(vitorias);
        
        for(VitoriaPorPontos v : vitorias){
            System.out.println(" " + v.getPontosLutador1() + " " + v.getPontosLutador2());
        }
        
        System.out.println(vitorias[0].compareTo(v1));
    }
}
