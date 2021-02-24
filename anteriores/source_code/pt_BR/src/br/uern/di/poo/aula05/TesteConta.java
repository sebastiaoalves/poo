package br.uern.di.poo.aula05;

public class TesteConta {
    public static void main(String[] args) {

        Conta c1=new Conta("sebastião",0.0);
        Conta c2 = new Conta();

        c1.setSaldo(1000);

        c2.setSaldo(2000);

        c2.setProprietário("Emidio");

        System.out.println(c1);

        System.out.println(c2);

    }
}
