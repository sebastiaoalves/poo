/*
- Criar um pacote br.uern.di.poo.unidade1.aula14
- Criar uma classe Conta com:
    - Atributos: dia e mês (enum) de vencimento, valor e empresa
    - Métodos de instância: para verificar se a conta está vencida, get/set e construtor
    - Método estático que recebe um vetor de contas e devolve o total
- Criar uma classe TesteConta com um main que tenha:
    - Um vetor de contas a pagar (4) e contas a receber (2)
    - Liste as contas vencidas
    - Dê o total de contas a pagar e a receber

OBS: Usar o Scanner ou JOptionPane para ler os valores
 */


package br.uern.di.poo.aula14;

public class Conta {

    private int diaDeVencimento;
    private Mes mesDeVencimento;
    private double valor;
    private String empresa;

    @Override
    public String toString() {
        return "Conta\n" +
                "Dia de Vencimento " + diaDeVencimento +
                "\nMês de vencimento " + mesDeVencimento +
                "\nValor " + valor +
                "\nEmpresa " + empresa;
    }

    public Conta(int diaDeVencimento, Mes mesDeVencimento, double valor, String empresa) {
        this.diaDeVencimento = diaDeVencimento;
        this.mesDeVencimento = mesDeVencimento;
        this.valor = valor;
        this.empresa = empresa;
    }

    public int getDiaDeVencimento() {
        return diaDeVencimento;
    }

    public void setDiaDeVencimento(int diaDeVencimento) {
        this.diaDeVencimento = diaDeVencimento;
    }

    public Mes getMesDeVencimento() {
        return mesDeVencimento;
    }

    public void setMesDeVencimento(Mes mesDeVencimento) {
        this.mesDeVencimento = mesDeVencimento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public boolean estaVencida(int dia, Mes mes){
        return mes.getData() > this.mesDeVencimento.getData() ||
                mes.getData() == mesDeVencimento.getData() && dia > this.diaDeVencimento;
    }

    public static double getTotal(Conta []contas){
        double total=0.0;
        for (Conta c: contas)
            total+=c.getValor();
        return total;
    }
}
