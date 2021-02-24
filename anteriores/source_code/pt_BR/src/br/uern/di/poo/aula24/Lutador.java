package br.uern.di.poo.aula24;

import br.uern.di.poo.aula22.*;
import java.util.Date;
import java.util.LinkedList;

public class Lutador {
    String nome;
    Date dataDeNascimento;
    String localDeNascimento;
    String academia;
    
    LinkedList <TipoResultado> cartel;

    public Lutador(String nome, Date dataDeNascimento, String localDeNascimento, String academia) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.localDeNascimento = localDeNascimento;
        this.academia = academia;
        cartel = new LinkedList<>();
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getLocalDeNascimento() {
        return localDeNascimento;
    }

    public void setLocalDeNascimento(String localDeNascimento) {
        this.localDeNascimento = localDeNascimento;
    }

    public String getAcademia() {
        return academia;
    }

    public void setAcademia(String academia) {
        this.academia = academia;
    }

    public LinkedList<TipoResultado> getCartel() {
        return cartel;
    }

    public void setCartel(LinkedList<TipoResultado> cartel) {
        this.cartel = cartel;
    }
    
    public int getNumeroLutas(){
        return cartel.size(); //retorna o tamanho da lista 
    }
    
    public int getNumeroDeVitorias(){
        int numVitorias = 0;
        for(TipoResultado resultado:cartel)
            if(resultado instanceof Vitoria)//testa se a subclasse é do tipo de uma determinada classe
                numVitorias++;
        return numVitorias;
    }

    public int getNumeroDeEmpate(){
        int numEmpates = 0;
        for(TipoResultado resultado:cartel)
            if(resultado instanceof Empate)//testa se a subclasse é do tipo de uma determinada classe
                numEmpates++;
        return numEmpates;
    }
    public int getNumeroDeDerrotas(){
        int numDerrotas = 0;
        for(TipoResultado resultado:cartel)
            if(resultado instanceof Derrota)//testa se a subclasse é do tipo de uma determinada classe
                numDerrotas++;
        return numDerrotas;
    }
}
