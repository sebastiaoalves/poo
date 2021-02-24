package br.uern.di.poo.aula12;

import java.util.Date;

public class Pessoa {
    private String primeiroNome;
    private String ultimoNome;
    private java.util.Date dataDeNascimento;
    private static int CPF = 1;


    public Pessoa(String primeiroNome, String ultimoNome, Date dataDeNascimento) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
}
