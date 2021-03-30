
package br.uern.di.poo.atividadesavaliativas.prova1.parte1;

/**
 *
 * @author sebastiao
 */
public class Videoteca {
    
    private Filme filmes [];

    public Videoteca(Filme[] filmes) {
        this.filmes = filmes;
    }

    public Filme[] getFilmes() {
        return filmes;
    }

    public void setFilmes(Filme[] filmes) {
        this.filmes = filmes;
    }
    
    public int buscaFilme (String nomeDoFilme){
        int pos = -1;
        for (int i=0;i<filmes.length;i++)
            if(filmes[i].getNome().contains(nomeDoFilme)){
                pos = i;
                break;
            }
        return pos;
    }
    
    public String [] getNomesFilmes(){
        String nomes [] = new String [filmes.length];
        for (int i=0;i<nomes.length;i++)
            nomes[i] = filmes[i].getNome();
        return nomes;
    }
    
}
