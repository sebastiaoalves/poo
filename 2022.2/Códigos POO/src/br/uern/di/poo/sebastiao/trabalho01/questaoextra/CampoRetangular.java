package br.uern.di.poo.sebastiao.trabalho01.questaoextra;

public class CampoRetangular {

	private ParOrdenado posicaoCantoSuperior, comprimento;
	private Bola bola;
	public CampoRetangular(int xSuperior, int ySuperior, int comprimentoX, 
			int comprimentoY, Bola bola) {
		this.posicaoCantoSuperior = new ParOrdenado(xSuperior, ySuperior);
		this.comprimento = new ParOrdenado(comprimentoX, comprimentoY);;
		this.bola = bola;
	}
	
	public ParOrdenado getPosicaoCantoSuperior() {
		return posicaoCantoSuperior;
	}
	
	public ParOrdenado getComprimento() {
		return comprimento;
	}
	
	public Bola getBola() {
		return bola;
	}
	
	public boolean bolaTocaBordaEsquerda() {
		if(bola.getPosicaoCentro().getX()-bola.getRaio() <= 
				this.posicaoCantoSuperior.getX())
			return true;
		return false;
	}
	
	public boolean bolaTocaBordaDireita() {
		if(bola.getPosicaoCentro().getX()+bola.getRaio() >= 
				this.posicaoCantoSuperior.getX() + this.comprimento.getX())
			return true;
		return false;	
	}
	
	public boolean bolaTocaBordaSuperior() {
		if(bola.getPosicaoCentro().getY()-bola.getRaio() <= 
				this.posicaoCantoSuperior.getY())
			return true;
		return false;	
		
	}
	
	public boolean bolaTocaBordaInferior() {
		if(bola.getPosicaoCentro().getY()+bola.getRaio() >= 
				this.posicaoCantoSuperior.getY() + this.comprimento.getY())
			return true;
		return false;	
		
	}
	
	public void movimentaBola() {
		bola.movimenta();
		if(bolaTocaBordaEsquerda() || bolaTocaBordaDireita())
			bola.getVelocidade().setX(bola.getVelocidade().getX()*-1);
		if(bolaTocaBordaInferior() || bolaTocaBordaSuperior())
			bola.getVelocidade().setY(bola.getVelocidade().getY()*-1);
	}
	
}
