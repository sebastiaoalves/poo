package br.uern.di.poo.aula24;

import br.uern.di.poo.aula22.*;

public class VitoriaPorInterrupcao implements Interrompivel{

    private String motivo;

    public VitoriaPorInterrupcao(String motivo) {
        this.motivo = motivo;
    }
    
    @Override
    public String getMotivo() {
        return this.motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
}
