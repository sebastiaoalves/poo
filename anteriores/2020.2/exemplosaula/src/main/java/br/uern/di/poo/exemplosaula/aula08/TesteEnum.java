/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uern.di.poo.exemplosaula.aula08;

/**
 *
 * @author sebastiao
 */
public class TesteEnum {
    public static void main(String[] args) {
        StatusAluno statusAtual = StatusAluno.MATRICULADO;
        double notaAluno = 8.0;
        int faltasAluno = 40;
        
        //System.out.println(statusAtual);
        
        System.out.println("Os status que um aluno pode assumir:");
        for(StatusAluno status : StatusAluno.values())
            System.out.println(status);
        
        if(notaAluno>=6.0 && faltasAluno <=15)
            statusAtual = StatusAluno.APROVADO;
        else if(notaAluno < 6.0)
            statusAtual = StatusAluno.REPROVADO_POR_MEDIA;
        else if(faltasAluno > 15 )
            statusAtual = StatusAluno.REPROVADO_POR_FALTA;
        
//        if (statusAtual != StatusAluno.APROVADO)
//            System.out.println("O aluno não foi aprovado!");

        switch(statusAtual){
            case APROVADO:
                System.out.println("O aluno foi aprovado na disciplina");
                break;
            case REPROVADO_POR_FALTA:
                System.out.println("O aluno foi reprovado porque teve mais de 15 faltas");
                break;
            case REPROVADO_POR_MEDIA:
                System.out.println("O aluno foi reprovado porque não obteve média maior que 6.0");
                break;
            case MATRICULADO:
                System.out.println("O aluno ainda está matriculado na disciplina");
                break;
            default:
                System.out.println("O aluno provavelmente trancou a disciplina ou o curso");
        }

    }
}
