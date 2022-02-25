/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uern.di.poo.atividadesavaliativas.prova1.teorica;

/**
 *
 * @author sebastiao
 */

public class Associado {

    // letra b
    private String nome;
    private int pontosDeVenda, pontosQualificaveis;
    private NivelQualificacao nivelQualificacao;
    
    // letra c
    public Associado (String nome){
        this.nome = nome;
        this.pontosDeVenda = 0;
        this.pontosQualificaveis = 0;
        this.nivelQualificacao = NivelQualificacao.PRATA;
    }
    
    // letra d
    public void registraVenda(double valorDaVenda){
        this.pontosDeVenda += valorDaVenda;
        this.pontosQualificaveis += 0.1 * valorDaVenda;
    }
    
    // letra e - opção 1
    public static NivelQualificacao verificaNivelQualificacao(int pontosDeVenda, int pontosQualificaveis){
        if(pontosDeVenda < 5000 || pontosQualificaveis < 500)
            return NivelQualificacao.PRATA;
        else if(pontosDeVenda < 10000 || pontosQualificaveis < 1000)
            return NivelQualificacao.OURO; 
        else if(pontosDeVenda < 15000 || pontosQualificaveis < 1500)
            return NivelQualificacao.RUBI;
        else if(pontosDeVenda < 20000 || pontosQualificaveis < 2000)
            return NivelQualificacao.ESMERALDA;
        else 
            return NivelQualificacao.DIAMANTE;
    }
    
    // letra e - opção 2
    public static NivelQualificacao verificaNivelQualificacao2(int pontosDeVenda, int pontosQualificaveis){
        int limiteVenda = 5000, limiteQualificavel = 500;
        NivelQualificacao resposta =  NivelQualificacao.DIAMANTE; 
        for (NivelQualificacao nivel : NivelQualificacao.values()){
            if (pontosDeVenda < limiteVenda && pontosQualificaveis < limiteQualificavel){
                resposta = nivel;
                break;
            }
            else{
                limiteVenda+=5000;
                limiteQualificavel+=500;
            }
        }
        return resposta;
    }
    
    // letra f
    public void fechaMes(){
        this.nivelQualificacao = verificaNivelQualificacao(this.pontosDeVenda, this.pontosQualificaveis);
        this.pontosDeVenda *= 0.1;
        this.pontosQualificaveis = 0;
    }
    
}
