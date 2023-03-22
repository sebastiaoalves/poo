package br.uern.di.poo.sebastiao.trabalho01.questaoextra;

public class Bola {
	
	private ParOrdenado posicaoCentro, velocidade;
	private final int raio;
	
	public Bola(int xCentro, int yCentro, int velocidadeHorizontal, int velocidadeVertical, int raio) {
		this.posicaoCentro = new ParOrdenado(xCentro, yCentro);
		this.velocidade = new ParOrdenado(velocidadeHorizontal, velocidadeVertical);
		this.raio = raio;
	}
	
	public ParOrdenado getVelocidade() {
		return velocidade;
	}
	
	public void setVelocidade(ParOrdenado velocidade) {
		this.velocidade = velocidade;
	}
	
	public ParOrdenado getPosicaoCentro() {
		return posicaoCentro;
	}
	
	public int getRaio() {
		return raio;
	}

	public void movimenta() {
		this.posicaoCentro.setX(this.posicaoCentro.getX()+this.velocidade.getX());
		this.posicaoCentro.setY(this.posicaoCentro.getY()+this.velocidade.getY());
	}
	
	@Override
	public String toString() {
		return "A bola está na posição " + this.posicaoCentro + " se movendo a uma velocidade " +
				this.velocidade + " pixels por movimento";
	}
	
}
