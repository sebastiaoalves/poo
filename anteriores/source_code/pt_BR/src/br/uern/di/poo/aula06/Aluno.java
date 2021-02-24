/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uern.di.poo.aula06;

/**
 *
 * @author lordi
 */
public class Aluno {

    private double nota1;
    private double nota2;
    private double nota3;

    public Aluno() {
        this(0.0,0.0,0.0);
    }
    
    public Aluno(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + '}';
    }
    
    public double calculaMédia(){
        double média = (4*nota1+5*nota2+6*nota3)/15;
        return média;
    }
    
    public static void main(String[] args) {
        Aluno a1 = new Aluno(), a2 = new Aluno(10,5.6, 8.2);
        a1.setNota2(8.3);
        a2.setNota1(4.2);
        
        System.out.println(a1);
        System.out.println(a2);
        
        System.out.println("Média do aluno 1: " +a1.calculaMédia());
        System.out.println("Média do aluno 1: " +a2.calculaMédia());
    }
    
}
