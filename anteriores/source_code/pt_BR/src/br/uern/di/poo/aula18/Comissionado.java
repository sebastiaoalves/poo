package br.uern.di.poo.aula18;

public class Comissionado extends Assalariado {

    private double comissao;

    public Comissionado (String nome, int horas, double salario, double comissao){
        super(nome, horas, salario);
        this.comissao = comissao;
    }

    public double getComissao(){
        return this.comissao;
    }

    public void setComissao(double comissao){
        this.comissao=comissao;
    }

    @Override
    public double getSalario(){
        return super.getSalario() + this.comissao;
    }

}
