package br.uern.di.poo.exemplos.jogo;

public class Guerreiro extends Personagem {
	
	public Guerreiro(int forca, int agilidade, int inteligencia) {
		super(forca, agilidade, inteligencia);
	}
	
	public void evolui ( ) {
		setNivel (getNivel()+1);
		setForca(forca +2);
        agilidade ++;
        inteligencia ++;
    }

	@Override
    public int getPontosAtaque( ) {
        return getNivel() + forca;
    }
    
    private final static double BONUS_VIDA=0.5;

    @Override
    public int getMaxPontosDeVida() {
    	//System.out.println("Pontos de vida do guerreiro.");
    	return getNivel() + (int)(forca * (1+BONUS_VIDA));
    }

	@Override
	public String toString() {
		return "Guerreiro [forca=" + forca + ", inteligencia=" + inteligencia + ", agilidade=" + agilidade
				+ ", getPontosAtaque()=" + getPontosAtaque() + ", getMaxPontosDeVida()=" + getMaxPontosDeVida()
				+ ", toString()=" + super.toString() + ", getPontosDeVida()=" + getPontosDeVida() + ", getNivel()="
				+ getNivel() + ", getForca()=" + getForca() + ", getInteligencia()=" + getInteligencia()
				+ ", getAgilidade()=" + getAgilidade() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

	@Override
	public int getPontosDefesa() {
		return getAgilidade()/2;
	}
    
}
