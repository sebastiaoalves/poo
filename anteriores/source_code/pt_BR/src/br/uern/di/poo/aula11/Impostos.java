/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uern.di.poo.aula11;

/**
 *
 * @author lordi
 */
public enum Impostos {
    IPI ("Imposto sobre Produtos Industrializados", "IPI", 0.3) , 
    ICMS("Imposto sobre Circulação de Mercadorias e Serviços", "ICMS", 0.25), 
    COFINS("Contribuição para o Financiamento da Seguridade Social", "PIS/COFINS", 0.0925);
    
    private final String nome;
    private final String sigla;
    private final double taxa;

    private Impostos(String nome, String sigla, double taxa) {
        this.nome = nome;
        this.sigla = sigla;
        this.taxa = taxa;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public double getTaxa() {
        return taxa;
    }
        
}
