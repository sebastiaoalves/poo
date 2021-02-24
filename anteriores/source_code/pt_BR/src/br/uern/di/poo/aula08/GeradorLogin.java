/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uern.di.poo.aula08;

/**
 *
 * @author lordi
 */
public class GeradorLogin {
    private String nome;
    private int anoDeNascimento;

    public GeradorLogin(String nome, int anoDeNascimento) {
        this.nome = nome;
        this.anoDeNascimento = anoDeNascimento;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the anoDeNascimento
     */
    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }

    /**
     * @param anoDeNascimento the anoDeNascimento to set
     */
    public void setAnoDeNascimento(int anoDeNascimento) {
        this.anoDeNascimento = anoDeNascimento;
    }
    
    public String loginPrimeiroUltimo(){
        String []nomesSeparados = nome.split(" ");
        String sugestão = nomesSeparados[0];
        sugestão += nomesSeparados[nomesSeparados.length-1];
        return sugestão.toLowerCase();
    }
    
    public String loginIniciais(){
        String []nomesSeparados = nome.split(" ");
        String sugestão="";
        for(String nome:nomesSeparados){
            sugestão+=nome.charAt(0);
        }
        return sugestão.toLowerCase();
    }
    
    public String loginIniciaisUltimoAno(){
        String []nomesSeparados = nome.split(" ");
        String sugestão="";
        for(int i=0; i < nomesSeparados.length - 1; i++)
            sugestão+=nomesSeparados[i].charAt(0);
        sugestão+=nomesSeparados[nomesSeparados.length-1];
        sugestão+=anoDeNascimento;
        return sugestão.toLowerCase();
    }
            
     public static void main(String[] args) {
        GeradorLogin gerador = new GeradorLogin("Sebastião Emidio Alves Filho", 1980);
         System.out.println(gerador.loginPrimeiroUltimo());
         System.out.println(gerador.loginIniciais());
         System.out.println(gerador.loginIniciaisUltimoAno());
    }
            
            
}
