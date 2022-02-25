package br.uern.di.poo.exemplosaula.aula06e07;
public class TesteConta2 {
    public static void main(String[] args) {
        Conta conta1 = new Conta (1);
        Conta conta2 = new Conta (2, "Sebastião");
        Conta [ ] contas = new Conta[4];
        contas[1] = conta1;
        if (conta2.getSaldo() > Conta.SALDO_INICIAL)
            System.out.println("Um depósito foi feito");
        for (Conta c : contas)
            if(c != null)
                System.out.println(c.getNomeTitular());
    }
}


