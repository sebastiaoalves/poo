package br.uern.di.poo.aula24;

import br.uern.di.poo.aula22.*;

public class SemResultado extends TipoResultado{
    private String motivo;

    public SemResultado(String motivo) {
        this.motivo = motivo;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
    
}
