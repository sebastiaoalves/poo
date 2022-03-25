/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uern.di.poo.atividadesavaliativas.prova4;


// Resposta do item d
import java.util.Scanner;
public class TesteAluno {
    
    public static Aluno[] criaTurma(){
        
        System.out.println("Digite o número de alunos na turma: ");
        Scanner leitura = new Scanner (System.in);
        int tamanhoDaTurma = leitura.nextInt();
        
        Aluno turma[] = new Aluno [tamanhoDaTurma];
        
        for (int i = 0 ; i < tamanhoDaTurma ; i++){
            int opcao;
            do{
                System.out.println("Digite a opção:\n1 - Aluno da UERN\n"
                    + "2 - Aluno de Intercâmbio");
                String nomeAluno, nomeUniversidade;
                
                opcao = leitura.nextInt();
                if(opcao!=1 && opcao!=2)
                    continue;
                            
                System.out.println("Digite o nome do aluno");
                nomeAluno = leitura.next();
                if(opcao == 1)
                    turma[i] = new Aluno(nomeAluno);
                if(opcao ==2){
                    System.out.println("Digite o nome da universidade");
                    nomeUniversidade = leitura.next();
                    turma[i] = new AlunoIntercambio(nomeUniversidade, nomeAluno);
                        
                }
            }while (opcao!=1 && opcao!=2);
        }
        
        return turma;
    }
    
    
    // Resposta da letra e
    public static void main(String[] args) {
        Aluno turmaPOO[] = criaTurma();
        for(Aluno aluno:turmaPOO){
            if(aluno instanceof AlunoIntercambio)
                System.out.println("Aluno de Intercâmbio");
            else
                System.out.println("Aluno Regular");
            System.out.println(aluno);
        }
    }
    
}
