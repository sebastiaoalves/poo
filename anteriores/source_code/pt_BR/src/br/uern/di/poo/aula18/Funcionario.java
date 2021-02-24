package br.uern.di.poo.aula18;

public class Funcionario {

    private String nome;
    private int horas;
    private double salario;

    public Funcionario(String nome){
        this.nome = nome;
        this.horas = 0;
        this.salario = 0.0;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
