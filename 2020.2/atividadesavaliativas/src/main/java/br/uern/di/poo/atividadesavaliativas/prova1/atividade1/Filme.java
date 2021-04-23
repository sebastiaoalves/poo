
package br.uern.di.poo.atividadesavaliativas.prova1.atividade1;

import javax.swing.ImageIcon;

/**
 *
 * @author sebastiao
 */
public class Filme {
    
    private int id;
    private String nome, genero, sinopse;
    
    //Para o exercício extra
    private String nomeImagem;

    public Filme(int id, String nome, String genero, String sinopse) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.sinopse = sinopse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getNomeImagem() {
        return nomeImagem;
    }

    public void setNomeImagem(String nomeImagem) {
        this.nomeImagem = nomeImagem;
    }

}
