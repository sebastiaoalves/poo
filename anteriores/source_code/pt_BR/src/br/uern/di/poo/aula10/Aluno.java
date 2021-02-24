/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uern.di.poo.aula10;
import static javax.swing.JOptionPane.*;
import static java.lang.Double.*;
import static br.uern.di.poo.aula10.StatusAluno.*;

/**
 *
 * @author lordi
 */
public class Aluno {

    private double nota1;
    private double nota2;
    private double nota3;
    
    public static final int PESOS [ ] = {4, 5, 6};

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
        double média = (PESOS[0]*nota1+PESOS[1]*nota2+PESOS[2]*nota3) /
                (PESOS[0]+PESOS[1]+PESOS[2]);
        return média;
    }
    
    public static double calculaNotaMinima (double nota1, double nota2){
            double notaMínima = (7.0*(PESOS[0]+PESOS[1]+PESOS[2]) - PESOS[0]*nota1 - PESOS[1]*nota2) / PESOS[2];
            if(notaMínima<=10.0)
                return notaMínima;
            else
                return -1;
    }
    
    public StatusAluno getStatusAluno(){
        double média = calculaMédia();
        if(média<4.0)
            return REPROVADO_NOTA;
        else if(média<7.0)
            return QUARTA_PROVA;
        else
            return APROVADO;
    }
    
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno(10, 5.6, 8.2);
        a1.setNota2(parseDouble(showInputDialog("Digite uma nota")));
        //a2.setNota1(Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota")));
        
        System.out.println(a1);
        if(a1.getStatusAluno().equals(APROVADO))
            System.out.println("O aluno passou!");
        System.out.println(a2);
        
        System.out.println("Média do aluno 1: " +a1.calculaMédia());
        System.out.println("Média do aluno 1: " +a2.calculaMédia());
        
        System.out.println("Pesos usados nas provas da UERN:");
        for(int i:Aluno.PESOS)
            System.out.print(i + " ");
        
        System.out.println("");
        
        System.out.println("Se você tirar 2.3 na 1ª prova e 3.5 na 2ª você precisará de " + 
                (Aluno.calculaNotaMinima(2.3, 3.5)!=-1.0?Aluno.calculaNotaMinima(2.3, 3.5)+"":" um milagre"));
        
    }
    
}
