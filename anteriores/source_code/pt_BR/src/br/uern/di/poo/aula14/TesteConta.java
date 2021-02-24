package br.uern.di.poo.aula14;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;


public class TesteConta {

    private static final int NUM_CONTAS_PAGAR=4, NUM_CONTAS_RECEBER=2;

    private static void leituraJOptionPane(Conta[] contas, int numContas) {
        for (int i = 0; i< numContas; i++) {
            showMessageDialog(null, (i+1) +"ª conta");
            int dia = parseInt(showInputDialog("Digite o dia de vencimento"));
            Mes mes = Mes.values()[parseInt(showInputDialog("Digite o número do mes de vencimento:"))-1];
            double valor = parseDouble(showInputDialog("Digite o valor da conta"));
            String empresa = showInputDialog("Digite a empresa da conta:");
            contas[i] = new Conta(dia, mes, valor, empresa);
        }
    }

    public static void main(String[] args) {
        Conta []contasAPagar = new Conta[NUM_CONTAS_PAGAR];
        Conta []contasAReceber = new Conta[NUM_CONTAS_RECEBER];

        showMessageDialog(null, "Informações das contas a pagar");
        leituraJOptionPane(contasAPagar, NUM_CONTAS_PAGAR);

        showMessageDialog(null, "Informações das contas a receber");
        leituraJOptionPane(contasAReceber, NUM_CONTAS_RECEBER);

        showMessageDialog(null, "Contas a pagar vencidas");
        for(Conta c:contasAPagar)
            if(c.estaVencida(29, Mes.MARCO))
                showMessageDialog(null, c);

        showMessageDialog(null, "Contas a receber vencidas");
        for(Conta c:contasAReceber)
            if(c.estaVencida(29, Mes.MARCO))
                showMessageDialog(null, c);

        showMessageDialog(null, "Total de contas a pagar: " + Conta.getTotal(contasAPagar));
        showMessageDialog(null, "Total de contas a receber: " + Conta.getTotal(contasAReceber));
    }
}
