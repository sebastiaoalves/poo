
package br.uern.di.poo.atividadesavaliativas.prova1.atividade1;

/**
 *
 * @author sebastiao
 */
public class Avaliacao {
    
    private int idFilme;
    private String avaliador;
    private int notaFilme;
    private String comentario;

    public Avaliacao(int idFilme, String avaliador, int notaFilme, String comentario) {
        this.idFilme = idFilme;
        this.avaliador = avaliador;
        this.notaFilme = notaFilme;
        this.comentario = comentario;
    }

    public int getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(int idFilme) {
        this.idFilme = idFilme;
    }

    public String getAvaliador() {
        return avaliador;
    }

    public void setAvaliador(String avaliador) {
        this.avaliador = avaliador;
    }

    public int getNotaFilme() {
        return notaFilme;
    }

    public void setNotaFilme(int notaFilme) {
        this.notaFilme = notaFilme;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    
    
}
