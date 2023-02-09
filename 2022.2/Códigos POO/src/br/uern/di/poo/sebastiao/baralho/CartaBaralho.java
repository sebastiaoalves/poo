package br.uern.di.poo.sebastiao.baralho;

public class CartaBaralho {
	
	private Naipe naipe;
	private Carta carta;
	
	public CartaBaralho(Naipe naipe, Carta carta) {
		super();
		this.naipe = naipe;
		this.carta = carta;
	}
	public Naipe getNaipe() {
		return naipe;
	}
	public void setNaipe(Naipe naipe) {
		this.naipe = naipe;
	}
	public Carta getCarta() {
		return carta;
	}
	public void setCarta(Carta carta) {
		this.carta = carta;
	}

}
