
package br.uern.di.poo.atividadesavaliativas.prova1.atividade1;

/**
 *
 * @author sebastiao
 */
public class Opinioes {

    private Avaliacao avaliacoes [];

    public Opinioes(Avaliacao[] avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public Avaliacao[] getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(Avaliacao[] avaliacoes) {
        this.avaliacoes = avaliacoes;
    }
    
    public double getMediaAvaliacoes (int idFilme){
        
        double somatorioNotas = 0.0;
        int contadorAvalicoes = 0;
        for (Avaliacao avaliacao : avaliacoes)
            if(avaliacao.getIdFilme() == idFilme){
                somatorioNotas += avaliacao.getNotaFilme();
                contadorAvalicoes++;
            }
        
        return contadorAvalicoes != 0 ? somatorioNotas/contadorAvalicoes : 0.0;
    }
    
    public int getMelhorAvaliacao (int idFilme){
        int melhorAvaliacao = 0;
        for (Avaliacao avaliacao : avaliacoes )
            if(avaliacao.getIdFilme() == idFilme){
                int avaliacaoAtual = avaliacao.getNotaFilme();
                if (avaliacaoAtual > melhorAvaliacao)
                    melhorAvaliacao = avaliacaoAtual;
            }
        return melhorAvaliacao;
    }
    
    public int getPiorAvaliacao (int idFilme){
        int piorAvaliacao = 100;
        for (Avaliacao avaliacao : avaliacoes )
            if(avaliacao.getIdFilme() == idFilme){
                int avaliacaoAtual = avaliacao.getNotaFilme();
                if (avaliacaoAtual < piorAvaliacao)
                    piorAvaliacao = avaliacaoAtual;
            }
        return piorAvaliacao;
    }
}
