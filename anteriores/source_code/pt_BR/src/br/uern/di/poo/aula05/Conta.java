package br.uern.di.poo.aula05;

import java.util.Objects;

public class Conta {

    private String proprietário;
    private double saldo;

    public Conta() {
        this(null,0.0);
    }

    public Conta(String proprietário, double saldo) {
        this.proprietário = proprietário;
        this.saldo = saldo;
    }

    public String getProprietário() {
        return proprietário;
    }

    public void setProprietário(String proprietário) {
        this.proprietário = proprietário;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "proprietário='" + proprietário + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return Double.compare(conta.saldo, saldo) == 0 &&
                Objects.equals(proprietário, conta.proprietário);
    }

    @Override
    public int hashCode() {
        return Objects.hash(proprietário, saldo);
    }
}
