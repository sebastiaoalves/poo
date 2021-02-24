package br.uern.di.poo.aula18;

public class Assalariado extends Funcionario{

    public Assalariado(String nome, int horas, double salario){
        super(nome);
        setHoras(horas);
        setSalario(salario);
    }

}
